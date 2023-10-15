/**
 * @author Rafael Ayala
 * 
 * @since October 5, 2023
 * 
 *        CS 3331 - Advanced Object-Oriented Programming
 * 
 *        - Dr. Daniel Mejia
 * 
 *        - Programming Assignment 2
 * 
 *        - Ticket.java
 * 
 *        - The following file creates an abstract "Ticket" class with
 *        attrributes that more specialized "Ticket" classes
 *        can inherit from, such as the "VipT" and "GoldT" classes.
 * 
 *        This work was done individually and completely on my own. I did not
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

public abstract class Ticket {

    /**
     * These are the attributes for every Ticket object, as well as its children.
     */
    private String ticketName;
    private double ticketPrice;
    private String id;

    /**
     * Constructor for Ticket
     * 
     * @param none
     */
    public Ticket() {
    }

    /**
     * Getter for ticket name
     * 
     * @param none
     * @return this.ticketName
     */
    public String getTName() {
        return this.ticketName;
    }

    /**
     * Setter for ticket name
     * 
     * @return none
     * @param ticketName
     */
    public void setTName(String ticketName) {
        this.ticketName = ticketName;
    }

    /**
     * Getter for ticket price
     * 
     * @param none
     * @return this.ticketPrice
     */
    public double getTicketPrice() {
        return this.ticketPrice;
    }

    /**
     * Setter for ticket price
     * 
     * @return none
     * @param ticketPrice
     */
    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    /**
     * Getter for ticket id
     * 
     * @param none
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * Setter for ticket id
     * 
     * @return none
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Given a user's purchase choices, a new invoice will be created, and all of the 
     * appropriate attributes for a customer and event will be adjusted given the 
     * user's choices of purchasing a ticket.  This includes the customer's
     * balance and invoice/ticket collection, the event's 
     * availability values and ticket collections, and the venue's availability.
     * Activity will be written to an output file.
     *
     * This method was designed by Rafael Ayala and checked by Darien Booth
     * 
     * @param event
     * @param customer
     * @param mapKey
     * @param tQty
     * @param invoice
     */
    public void processTicketPurchase(Event event, Customer customer, String mapKey, int tQty, Invoice invoice, String ticketType) {

        double totalPrice = (event.getVipPrice() * tQty);
        double tax = totalPrice * 0.0825;
        double totalPricewithDiscount = totalPrice * 0.9;
        double taxWithDiscount = totalPricewithDiscount * 0.0825;
        if(customer.getMembership() == true){
            invoice.setTotalPrice(totalPricewithDiscount + taxWithDiscount);
            customer.setMoneyAvailable(customer.getMoneyAvailable() - invoice.getTotalPrice());
            customer.setSaved(customer.getSaved() + totalPricewithDiscount*0.1);
            event.setTaxCharged(event.getTaxCharged() + taxWithDiscount);
            event.setVipRev(event.getVipRev() + invoice.getTotalPrice());
            event.setDiscounted(event.getDiscounted() + totalPricewithDiscount*0.1);
        } else {
            invoice.setTotalPrice(totalPrice + tax);
            customer.setMoneyAvailable(customer.getMoneyAvailable() - invoice.getTotalPrice());
            event.setTaxCharged(event.getTaxCharged() + tax);
            event.setVipRev(event.getVipRev() + invoice.getTotalPrice());
        }
        invoice.setCustomerLastNameandEventName(customer.getLastName() + ", " + event.getname());
        invoice.setNumOfTickets(tQty);
        invoice.setTicketType(ticketType);
        invoice.setConfirmationNum((int) (Math.random() * 99999999));

        if(ticketType.equalsIgnoreCase("Vip")){
            VipT vip = new VipT();
            vip.setTName(ticketType);
            vip.setTicketPrice(event.getVipPrice());
            vip.setId(mapKey);
            for(int i = 0; i < tQty; i++){
                customer.addVIPTicket(vip);
                event.addVip(vip);
            }
        } else if (ticketType.equalsIgnoreCase("Gold")){
            GoldT gold = new GoldT();
            gold.setTName(ticketType);
            gold.setTicketPrice(event.getGoldPrice());
            gold.setId(mapKey);
            for(int i = 0; i < tQty; i++){
                customer.addGoldTicket(gold);
                event.addGold(gold);
            }
        } else if (ticketType.equalsIgnoreCase("Silver")){
            SilverT silver = new SilverT();
            silver.setTName(ticketType);
            silver.setTicketPrice(event.getSilverPrice());
            silver.setId(mapKey);
            for(int i = 0; i < tQty; i++){
                customer.addSilverTicket(silver);
                event.addSilver(silver);
            }
        } else if (ticketType.equalsIgnoreCase("Bronze")){
            BronzeT bronze = new BronzeT();
            bronze.setTName(ticketType);
            bronze.setTicketPrice(event.getBronzePrice());
            bronze.setId(mapKey);
            for(int i = 0; i < tQty; i++){
                customer.addBronzeTicket(bronze);
                event.addBronze(bronze);
            }
        } else {
            GeneralT general = new GeneralT();
            general.setTName(ticketType);
            general.setTicketPrice(event.getBronzePrice());
            general.setId(mapKey);
            for(int i = 0; i < tQty; i++){
                customer.addGeneralTicket(general);
                event.addGeneral(general);
            }
        }

        event.getVenue().setSeatsUA(event.getVenue().getPctSeatsUA() + (tQty/event.getVenue().getCapacity()));

        customer.setInvoice(invoice);

        customer.addEvent(mapKey);

        WriteToFile textFile = new WriteToFile();
        textFile.writeToOutputFile(customer, tQty, ticketType, event, customer.getMoneyAvailable(), mapKey);

        // This message will be printed to signify a valid transaction.
        System.out.println("Thank you for using TicketMiner!");

    }

}