/**
 * @author Rafael Ayala, Darien Booth
 * 
 * @since October 14, 2023
 * 
 *        - CS 3331 - Advanced Object-Oriented Programming
 * 
 *        - Dr. Daniel Mejia
 * 
 *        - Programming Assignment 3
 * 
 *        - Invoice.java
 * 
 *        - The following file defines an Invoice that obtains traits from
 *        Ticket and Customer objects to form invoices for individual
 *        transactions.
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

public class Invoice {

    /**
     * These are the attributes for each Invoice object.
     * The following attributes come from Rafael Ayala's 
     * original implementation of the TicketMiner system, 
     * as well as their getters and setters.
     */
    private String customerLastNameandEventName;
    private String ticketType;
    /**
     * The following attributes come from Darien Booth's
     * original implementation of the TicketMiner system,
     * as well as their getters and setters.
     */
    private int numOfTickets;
    private double totalPrice;
    private int confirmationNum;

    /**
     * @param none
     */
    public Invoice() {
    }

    /**
     * @param none
     * @return this.customerLastName
     */
    public String getCustomerLastNameandEventName() {
        return this.customerLastNameandEventName;
    }

    /**
     * @return none
     * @param customerLastNameandEventName
     */
    public void setCustomerLastNameandEventName(String customerLastNameandEventName) {
        this.customerLastNameandEventName = customerLastNameandEventName;
    }

    /**
     * @param none
     * @return this.ticketQuantity
     */
    public int getNumOfTickets() {
        return this.numOfTickets;
    }

    /**
     * @return none
     * @param numOfTickets
     */
    public void setNumOfTickets(int numOfTickets) {
        this.numOfTickets = numOfTickets;
    }

    /**
     * @param none
     * @return this.totalPrice
     */
    public double getTotalPrice() {
        return this.totalPrice;
    }

    /**
     * @return none
     * @param totalPrice
     */
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * @param none
     * @return this.conNume
     */
    public int getConfirmationNum() {
        return this.confirmationNum;
    }

    /**
     * @return none
     * @param confirmationNum
     */
    public void setConfirmationNum(int confirmationNum) {
        this.confirmationNum = confirmationNum;
    }

    /**
     * @param none
     * @return this.ticketType
     */
    public String getTicketType() {
        return this.ticketType;
    }

    /**
     * @return none
     * @param ticketType
     */
    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

}
