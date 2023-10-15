/**
 * @author Rafael Ayala
 * 
 * @since October 5, 2023
 * 
 *        - CS 3331 - Advanced Object-Oriented Programming
 * 
 *        - Dr. Daniel Mejia
 * 
 *        - Programming Assignment 2
 * 
 *        - ProcessPurchase.java
 * 
 *        - The following file defines a class with a method for processing
 *        the purchase choices of a user for an event.  This method will call
 *        on other methods that will help in processing purchases given the
 *        type of ticket.  For instance, there is a method specifically for
 *        processing the purchase of VIP tickets in the VipT class.
 * 
 *        - This work was done individually and completely on my own. I did not
 *        share, reproduce, or alter any part of this
 *        assignment for any purpose. I did not share code, upload this
 *        assignment online in any form, or
 *        view/received/modified code written from anyone else. All deliverables
 *        were produced entirely on my own. This
 *        assignment is part of an academic course at The University of Texas at
 *        El Paso and a grade will be assigned for
 *        the work I produced.
 * 
 */

public class ProcessPurchase {

    /**
     * Constructor for ProcessPurchase
     */
    public ProcessPurchase(){}

    /**
     * This is a critical method that, as the name implies, will process the
     * purchase for a customer. First, the user will be asked what type of
     * ticket they want to purchase. Based on their choice, and how many of
     * those tickets they want, a condition will be checked to ensure the
     * customer has enough funds, the ticket type is still available, and
     * the event still has seats available. Otherwise, the customer will
     * have to make accomodations. For every successful transaction, an Invoice
     * object will be created, the appropriate values will be set for the invoice
     * (total, confirmation number), the invoice will be added to the user's
     * collection of invoices, the event's availability and ticket collections
     * will be updated, and the information will be passed to be logged to a text
     * file.
     * 
     * @param customer
     * @param event
     * @param mapKey
     * 
     */
    public void processPurchase(Customer customer,
            Event event, String mapKey) {

        Factory ticketFactory = new Factory();

        boolean validTicketProcess = false;

        Invoice invoice = new Invoice();

        while (!validTicketProcess) {
            System.out.println(
                    "***If you already tried buying a ticket and were redirected here, you probably made an invalid input or tried to purchase a ticket you can't afford.***");
            System.out.println();
            System.out.println("Which type of ticket would you like to purchase? Enter only your number choice.");
            System.out.println("1. VIP");
            System.out.println("2. Gold");
            System.out.println("3. Silver");
            System.out.println("4. Bronze");
            System.out.println("5. General Admission");

            int ticketChoice = Integer.parseInt(System.console().readLine());

            switch (ticketChoice) {
                case 1:
                    System.out.println("How many VIP tickets?");
                    int vQty = Integer.parseInt(System.console().readLine());
                    if (1 <= vQty && vQty <= 6 && (event.getVipPrice()) * vQty <= (customer.getMoneyAvailable())
                            && event.getVenue().getPctSeatsUA() != 100
                            && (event.getVenue().getVipPct() / 100) * event.getVenue().getCapacity() != 0) {

                        Ticket vip = ticketFactory.createTicket("Vip");
                        vip.processTicketPurchase(event, customer, mapKey, vQty, invoice, "Vip");
                        validTicketProcess = true;
                        break;
                    }
                    break;
                case 2:
                    System.out.println("How many Gold tickets?");
                    int gQty = Integer.parseInt(System.console().readLine());
                    if (1 <= gQty && gQty <= 6 && (event.getGoldPrice()) * gQty <= (customer.getMoneyAvailable())
                            && event.getVenue().getPctSeatsUA() != 100
                            && (event.getVenue().getGoldPct() / 100) * event.getVenue().getCapacity() != 0) {

                        Ticket gold = ticketFactory.createTicket("Gold");
                        gold.processTicketPurchase(event, customer, mapKey, gQty, invoice, "Gold");

                        validTicketProcess = true;
                        break;
                    }
                    break;
                case 3:
                    System.out.println("How many Silver tickets?");
                    int sQty = Integer.parseInt(System.console().readLine());
                    if (1 <= sQty && sQty <= 6 && (event.getSilverPrice()) * sQty <= (customer.getMoneyAvailable())
                            && event.getVenue().getPctSeatsUA() != 100
                            && (event.getVenue().getSilverPct() / 100) * event.getVenue().getCapacity() != 0) {

                        Ticket silver = ticketFactory.createTicket("Silver");
                        silver.processTicketPurchase(event, customer, mapKey, sQty, invoice, "Silver");
                        validTicketProcess = true;
                        break;
                    }
                    break;
                case 4:
                    System.out.println("How many Bronze tickets?");
                    int bQty = Integer.parseInt(System.console().readLine());
                    if (1 <= bQty && bQty <= 6 && (event.getBronzePrice()) * bQty <= (customer.getMoneyAvailable())
                            && event.getVenue().getPctSeatsUA() != 100
                            && (event.getVenue().getBronzePct() / 100) * event.getVenue().getCapacity() != 0) {

                        Ticket bronze = ticketFactory.createTicket("Bronze");
                        bronze.processTicketPurchase(event, customer, mapKey, bQty, invoice, "Bronze");

                        validTicketProcess = true;
                        break;
                    }
                    break;
                case 5:
                    System.out.println("How many General Admssion tickets?");
                    int genQty = Integer.parseInt(System.console().readLine());
                    if (1 <= genQty && genQty <= 6
                            && (event.getGenAdmPrice()) * genQty <= (customer.getMoneyAvailable())
                            && event.getVenue().getPctSeatsUA() != 100
                            && (event.getVenue().getGenPct() / 100) * event.getVenue().getCapacity() != 0
                            && (event.getVenue().getResPct() / 100) * event.getVenue().getCapacity() != 0) {

                        Ticket general = ticketFactory.createTicket("General Admission");
                        general.processTicketPurchase(event, customer, mapKey, genQty, invoice, "General Admission");

                        validTicketProcess = true;

                        break;
                    }
                    break;
            }
            if (!validTicketProcess) {
                System.out.println(
                        "Please check your input, or make sure that there are still seats left for the event.  \nYou may need to select a different ticket type or adjust your ticket amount.");
            }
        }
    }
    
}
