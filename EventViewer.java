
/**
 * @author Rafael Ayala
 * 
 * @since October 4, 2023
 * 
 *        - CS 3331 - Advanced Object-Oriented Programming
 * 
 *        - Dr. Daniel Mejia
 * 
 *        - Programming Assignment 2
 * 
 *        - EventViewer.java
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

import java.util.*;

public class EventViewer {

    /**
     * Constructor for EventViewer
     */
    public EventViewer() {
    }

    /**
     * The following method will obtain the respective event belonging to its respective HashMap if it is a sport,
     * festival, or concert, and print methods will be called to print all of its respective information.
     * @param sportMap
     * @param concertMap
     * @param festivalMap
     */
    public void eventInfoViewer(HashMap<String, Sport> sportMap, HashMap<String, Concert> concertMap,
            HashMap<String, Festival> festivalMap) {

        boolean exit = false;
        while (!exit) {
            System.out.println("================================================================================");
            System.out.println(
                    "Enter the event ID number followed by a space and the event name(ID Event Name).  You may also type in 'EXIT' to exit.");
            String eventKey = System.console().readLine();

            if (sportMap.containsKey(eventKey)) {
                sportMap.get(eventKey).printEventInfo(sportMap.get(eventKey), eventKey);
                System.out.println("================================================================================");
            } else if (concertMap.containsKey(eventKey)) {
                concertMap.get(eventKey).printEventInfo(concertMap.get(eventKey), eventKey);
                System.out.println("================================================================================");
            } else if (festivalMap.containsKey(eventKey)) {
                festivalMap.get(eventKey).printEventInfo(festivalMap.get(eventKey), eventKey);
                System.out.println("================================================================================");
            } else if (eventKey.equalsIgnoreCase("EXIT")) {
                exit = true;
                break;
            }
        }
    }

}
