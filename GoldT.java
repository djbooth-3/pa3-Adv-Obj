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
 *        - GoldT.java
 * 
 *        - The following file defines a specialization of the Ticket class
 *        known as GoldT, representing Gold tickets. This class purely
 *        exists to be
 *        a different type of Ticket, but does not have any unique attributes of
 *        its own.  There is a method defined specifically for this class, which
 *        is for processing the purchase of a Gold ticket.
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

public class GoldT extends Ticket {

    /**
     * Constructor for GoldT
     * @param none
     */
    public GoldT() {
    }

    /**
     * All of the appropriate attributes for a customer and event will be adjusted
     * given the user's choices of purchasing a Gold ticket.  This includes the customer's
     * balance and invoice/Gold ticket collections, the event's availability values and 
     * ticket collections, and the venue's availability. 
     * @param event
     * @param customer
     * @param mapKey
     * @param gQty
     * @param invoice
     */
    public void processGoldPurchase(Event event, Customer customer, String mapKey, int gQty, Invoice invoice) {

        invoice.setTotal((event.getGoldPrice() * gQty));
        invoice.setCustomerLastNameandEventName(customer.getLName() + ", " + event.getEventName());
        invoice.setTicketQuantity(gQty);
        invoice.setTicketType("Gold");
        invoice.setConNum((int) (Math.random() * 99999999));

        double goldPurchaseTax = invoice.getTotal() * 0.0825;

        if(customer.getTMMS() == true){
            customer.setAvailableMoney(customer.getAvailableMoney() - (invoice.getTotal()*0.9) - goldPurchaseTax);
        } else {
            customer.setAvailableMoney(customer.getAvailableMoney() - invoice.getTotal() - goldPurchaseTax);
        }

        event.setTaxCharged(event.getTaxCharged() + goldPurchaseTax);

        customer.setSaved(invoice.getTotal()*0.1);

        GoldT gold = new GoldT();
        gold.setTName("Gold");
        gold.setTicketPrice(event.getGoldPrice());
        gold.setId(mapKey);
        for(int i = 0; i < gQty; i++){
            event.addGold(gold);
        }

        event.getVenue().setSeatsUn(event.getVenue().getSeatsUn() + (gQty/event.getVenue().getCapacity()));

        customer.addInvoice(invoice);

        customer.addEvent(mapKey);
        for(int i = 0; i < gQty; i++){
            customer.addGoldTicket(gold);
        }

        WriteToFile textFile = new WriteToFile();
        textFile.writeToOutputFile(customer, gQty, gold, event, customer.getAvailableMoney(), mapKey);

        // This message will be printed to signify a valid transaction.
        System.out.println("Thank you for using TicketMiner!");
    }

}
