/**
 * @author Rafael Ayala
 * 
 * @since September 14, 2023
 * 
 *        - CS 3331 - Advanced Object-Oriented Programming
 * 
 *        - Dr. Daniel Mejia
 * 
 *        - Programming Assignment 1
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
     */
    private String customerLastNameandEventName;
    private String ticketType;
    private int ticketQuantity;
    private double totalPrice;
    private int conNum;

    /**
     * @param none
     */
    public Invoice() {
    }

    /**
     * @param customerLastNameandEventName
     */
    public Invoice(String customerLastNameandEventName) {
        this.customerLastNameandEventName = customerLastNameandEventName;
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
    public int getTicketQuantity() {
        return this.ticketQuantity;
    }

    /**
     * @return none
     * @param ticketQuantity
     */
    public void setTicketQuantity(int ticketQuantity) {
        this.ticketQuantity = ticketQuantity;
    }

    /**
     * @param none
     * @return this.totalPrice
     */
    public double getTotal() {
        return this.totalPrice;
    }

    /**
     * @return none
     * @param totalPrice
     */
    public void setTotal(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * @param none
     * @return this.conNume
     */
    public int getConNum() {
        return this.conNum;
    }

    /**
     * @return none
     * @param conNum
     */
    public void setConNum(int conNum) {
        this.conNum = conNum;
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
