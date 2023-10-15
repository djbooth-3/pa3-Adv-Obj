/**
 * @author Rafael Ayala, Darien Booth 
 * 
 * @version 1.0
 * 
 * @since October 12, 2023
 * 
 *        - CS 3331 - Advanced Object-Oriented Programming
 * 
 *        - Dr. Daniel Mejia
 * 
 *        - Programming Assignment 3
 * 
 *        - Factory.java
 * 
 *        - The following file defines a class with a method for enabling administrators to view event information.
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
import java.util.ArrayList;
import java.util.HashMap;

public class Factory {

    /**
     * Creating instance of the class
     */
    public Factory() {

    }

    /**
     * Creating event type instance of a child class depending on input
     * @param ticketType String for ticket type
     * @return ticket based on string input
     */
    public Ticket createTicket(String ticketType) {
        if (ticketType.equalsIgnoreCase("Vip")) {
            return new VipT();
        } else if (ticketType.equalsIgnoreCase("Gold")) {
            return new GoldT();
        } else if (ticketType.equalsIgnoreCase("Silver")){
            return new SilverT();
        } else if (ticketType.equalsIgnoreCase("Bronze")){
            return new BronzeT();
        } else {
            return new GeneralT();
        }
    }

    /**
     * Creating venue type instance of a child class depending on input 
     * @param venueType String for venue type
     * @return venue based on string input 
     */
    public Venue createVenue(String venueType) {
        if (venueType.equals("Arena")) {
            return new Arena();
        } else if (venueType.equals("Auditorium")) {
            return new Auditorium();
        } else if (venueType.equals("Stadium")) {
            return new Stadium();
        } else {
            return new OpenAir();
        }
    }
}