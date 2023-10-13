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

}