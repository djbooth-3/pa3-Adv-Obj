
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
 *        - EventModifier.java
 * 
 *        - The following file defines a class with a method that will enable adminstrators to modify event attributes.
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

public class EventModifier {

    /**
     * Constructor for class instance
     * 
     * @param none
     */
    public EventModifier() {
    }

    /**
     * The following method will enable adminstrators to modify event attributes
     * given the HashMaps with the three types of events.
     * 
     * @param sportMap
     * @param concertMap
     * @param festivalMap
     */
    public void modifyEvent(HashMap<String, Sport> sportMap, HashMap<String, Concert> concertMap,
            HashMap<String, Festival> festivalMap) {

        boolean exit = false;
        while (!exit) {
            System.out.println(
                    "For the event you would like to modify, enter the event ID number, followed by a space, followed by the event name.  You may also type 'EXIT' to exit.");

            String eventKey = System.console().readLine();

            if (sportMap.containsKey(eventKey)) {

                Sport sportToChange = sportMap.get(eventKey);
                sportToChange.modifySportAttribute(sportToChange, eventKey, sportMap);

                System.out.println("================================================================================");
            } else if (concertMap.containsKey(eventKey)) {

                Concert concertToChange = concertMap.get(eventKey);
                concertToChange.modifyConcertAttribute(concertToChange, eventKey, concertMap);

                System.out.println("================================================================================");
            } else if (festivalMap.containsKey(eventKey)) {

                Festival festivalToChange = festivalMap.get(eventKey);
                festivalToChange.modifyFestivalAttribute(festivalToChange, eventKey, festivalMap);

                System.out.println("================================================================================");
            } else if (eventKey.equalsIgnoreCase("EXIT")) {
                exit = true;
                break;
            }
        }
    }

}
