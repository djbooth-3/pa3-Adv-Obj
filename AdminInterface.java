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
 *        - AdminInterface.java
 * 
 *        - The following file defines a method for processing the interface of
 *        an adminstrator in the TicketMiner system.
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

public class AdminInterface {


    /**
     * The following method will simply process an adminstrator's choice to either view or modify event attributes.
     * @param sportMap
     * @param concertMap
     * @param festivalMap
     */
    public void adminInterface(HashMap<String, Sport> sportMap, HashMap<String, Concert> concertMap, HashMap<String, Festival> festivalMap) {

        // Based on user input, the event information for the appropriate event will be
        // displayed.
        boolean exit = false;
        while(!exit){

            System.out.println("====================================================================================================");
            System.out.println("Would you like to change or view an event's information?  You may also type 'EXIT' to go back.");

            boolean validAdminInput = false;
            while(!validAdminInput){
                System.out.println("1. View");
                System.out.println("2. Change");
                System.out.println("====================================================================================================");

                String adminChoice = System.console().readLine();
                if(adminChoice.equals("1")){
                    EventViewer eventviewer = new EventViewer();
                    eventviewer.eventInfoViewer(sportMap, concertMap, festivalMap);
                    validAdminInput = true;
                    break;
                } else if (adminChoice.equals("2")){
                    EventModifier eventmodifier = new EventModifier();
                    eventmodifier.modifyEvent(sportMap, concertMap, festivalMap);
                    validAdminInput = true;
                    break;
                } else if(adminChoice.equalsIgnoreCase("EXIT")){
                    validAdminInput = true;
                    exit =  true;
                    break;
                }
                else if (!validAdminInput){
                    System.out.println("Your input may have been invalid.  Ignore if you simply just exited.");;
                }
            } 
        }
    }
}