/**
 * @author Rafael Ayala, Darien Booth
 * 
 * @author Original Author of Method: Darien Booth; Separate Class created by Rafael Ayala
 * 
 * @since October 12, 2023
 * 
 *        - CS 3331 - Advanced Object-Oriented Programming
 * 
 *        - Dr. Daniel Mejia
 * 
 *        - Programming Assignment 3
 * 
 *        - NewLoginPage.java
 * 
 *        - The following file defines a class with a method for processing 
 *        entry information at the start of the run of the TicketMiner 
 *        system.  If the user identifies as a standard user, they will need
 *        to login, and the respective Customer information will be returned.
 *        otherwise, if the user identifies as an administrator, they will
 *        be redirected to an administrator interface.
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

import java.util.*;


public class MakeVenue {

    /**
     * Original creator of this method: Darien Booth
     * Refactoring accomplished by Rafael Ayala
     * 
     * Stores the information read from scanner line in object venue  
     * @param arr string array that is being sliced and stored
     * @return the object Venue that contains stored information
     */
    public Venue makeVenue(ArrayList<String> events, ArrayList<String>attributes) {


        ColumnAttributes venueAtts = new ColumnAttributes();
        Factory factory = new Factory(); 

        switch (events.get(venueAtts.searchForVenueType(attributes))) {
            case "Stadium":     // for stadium 
                Venue stadium = factory.createVenue("Stadium");
                stadium.obtainVenueAttributes(events, attributes, stadium);
                return stadium;
            case "Arena":      // for arena
                Venue arena = factory.createVenue("Arena");
                arena.obtainVenueAttributes(events, attributes, arena);
                return arena;
            case "Auditorium":   // for auditorium
                Venue auditorium = factory.createVenue("Auditorium");
                auditorium.obtainVenueAttributes(events, attributes, auditorium);
                return auditorium;
            case "Open Air":    // for open air
                Venue openAir = factory.createVenue("OpenAir");
                openAir.obtainVenueAttributes(events, attributes, openAir);
                return openAir;
            default:
                Venue temp = factory.createVenue("Stadium");
                return temp;
        }
    }
    
}
