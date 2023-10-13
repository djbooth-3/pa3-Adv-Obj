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
 *        - BronzeT.java
 * 
 *        - The following file defines a specialization of the Ticket class
 *        known as BronzeT, representing Bronze tickets. This class purely
 *        exists to be
 *        a different type of Ticket, and does not have any unique attributes of
 *        its own.  There is a method defined specifically for this class, which
 *        is for processing the purchase of a Bronze ticket.
 *        
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

public class BronzeT extends Ticket {

    /**
     * Constructor for BronzeT
     * @param none
     */
    public BronzeT() {
    }

    /**
     * All of the appropriate attributes for a customer and event will be adjusted
     * given the user's choices of purchasing a Bronze ticket.  This includes the customer's
     * balance and invoice/Bronze ticket collections, the event's availability values and 
     * ticket collections, and the venue's availability.
     * @param event
     * @param customer
     * @param mapKey
     * @param bQty
     * @param invoice
     */
    public void processBronzePurchase(Event event, Customer customer, String mapKey, int bQty, Invoice invoice) {

        invoice.setTotal((event.getBronzePrice() * bQty));
        invoice.setCustomerLastNameandEventName(customer.getLName() + ", " + event.getEventName());
        invoice.setTicketQuantity(bQty);
        invoice.setTicketType("Bronze");
        invoice.setConNum((int) (Math.random() * 99999999));

        double bronzePurchaseTax = invoice.getTotal() * 0.0825;

        if(customer.getTMMS() == true){
            customer.setAvailableMoney(customer.getAvailableMoney() - (invoice.getTotal()*0.9) - bronzePurchaseTax);
        } else {
            customer.setAvailableMoney(customer.getAvailableMoney() - invoice.getTotal() - bronzePurchaseTax);
        }

        event.setTaxCharged(event.getTaxCharged() + bronzePurchaseTax);

        customer.setSaved(invoice.getTotal()*0.1);

        BronzeT bronze = new BronzeT();
        bronze.setTName("Bronze");
        bronze.setTicketPrice(event.getBronzePrice());
        bronze.setId(mapKey);
        for(int i = 0; i < bQty; i++){
            event.addBronze(bronze);
        }

        event.getVenue().setSeatsUn(event.getVenue().getSeatsUn() + (bQty/event.getVenue().getCapacity()));

        customer.addInvoice(invoice);

        customer.addEvent(mapKey);
        for(int i = 0;  i < bQty; i++){
            customer.addBronzeTicket(bronze);
        }

        WriteToFile textFile = new WriteToFile();
        textFile.writeToOutputFile(customer, bQty, bronze, event, customer.getAvailableMoney(), mapKey);

        // This message will be printed to signify a valid transaction.
        System.out.println("Thank you for using TicketMiner!");
    }
}
