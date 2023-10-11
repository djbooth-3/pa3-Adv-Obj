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
 *        - GeneralT.java
 * 
 *        - The following file defines a specialization of the Ticket class
 *        known as GeneralT, representing General Admission tickets. This
 *        class purely exists to be
 *        a different type of Ticket, but does not have any unique attributes of
 *        its own. There is a method defined specifically for this class, which
 *        is for processing the purchase of a General Admission ticket.  It is an
 *        assumption that the Extra Reserved tickets will
 *        be classfied as General Admission tickets.
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

public class GeneralT extends Ticket {

    /**
     * @param none
     */
    public GeneralT() {
    }

    /**
     * Given a user's purchase choices, a new invoice will be created, and all of the 
     * appropriate attributes for a customer and event will be adjusted given the 
     * user's choices of purchasing a Bronze ticket.  This includes the customer's
     * balance and invoice/General Admission ticket collection, the event's 
     * availability values and ticket collections, and the venue's availability.
     * Activity will be written to an output file.
     *  @param event
     * @param customer
     * @param mapKey
     * @param genQty
     * @param invoice
     */
    public void processGeneralPurchase(Event event, Customer customer, String mapKey, int genQty, Invoice invoice) {

        invoice.setTotal((event.getGeneralPrice() * genQty));
        invoice.setCustomerLastNameandEventName(customer.getLName() + ", " + event.getEventName());
        invoice.setTicketQuantity(genQty);
        invoice.setTicketType("General Admission");
        invoice.setConNum((int) (Math.random() * 99999999));

        double genPurchaseTax = invoice.getTotal() * 0.0825;

        if(customer.getTMMS() ==  true){
            customer.setAvailableMoney(customer.getAvailableMoney() - (invoice.getTotal()*0.9) - genPurchaseTax);
        } else {
            customer.setAvailableMoney(customer.getAvailableMoney() - invoice.getTotal() - genPurchaseTax);
        }

        event.setTaxCharged(event.getTaxCharged() + genPurchaseTax);

        customer.setSaved(invoice.getTotal()*0.1);

        GeneralT generalT = new GeneralT();
        generalT.setTName("General Admission");
        generalT.setTicketPrice(event.getGeneralPrice());
        generalT.setId(mapKey);
        for(int i = 0; i < genQty; i++){
            event.addGeneral(generalT);
        }
        event.getVenue().setSeatsUn(event.getVenue().getSeatsUn() + (genQty/event.getVenue().getCapacity()));

        customer.addInvoice(invoice);

        customer.addEvent(mapKey);
        for(int i = 0; i < genQty; i++){
            customer.addGeneralTicket(generalT);
        }

        WriteToFile textFile = new WriteToFile();
        textFile.writeToOutputFile(customer, genQty, generalT, event, customer.getAvailableMoney(),
                mapKey);
        
        // This message will be printed to signify a valid transaction.
        System.out.println("Thank you for using TicketMiner!");
    }
}