
/**
 * @author Rafael Ayala
 * 
 * @since October 5, 2023
 * 
 * - CS 3331 - Advanced Object-Oriented Programming
 * 
 * - Dr. Daniel Mejia
 * 
 * - Programming Assignment 2
 * 
 * - Sport.java
 * 
 * - The following file defines a specialization of the Event class known as Sport.  This class does not necessarily
 * have any distinct attributes besides the name and price, which are already defined in the Event class.  There is also
 * a method for obtaining a Sport object from an ArrayList, the data structure that will represent each row of the
 * EventList csv file.  There is also a method for enabling the administrator to modify sport attributes.
 * 
 * - This work was done individually and completely on my own. I did not share, reproduce, or alter any part of this 
 * assignment for any purpose. I did not share code, upload this assignment online in any form, or 
 * view/received/modified code written from anyone else. All deliverables were produced entirely on my own. This 
 * assignment is part of an academic course at The University of Texas at El Paso and a grade will be assigned for 
 * the work I produced.
 * 
 */

import java.io.*;
import java.util.*;

public class Sport extends Event {

    /**
     * @param none
     */
    public Sport() {
    }

    /**
     * The following method will take a String ArrayList, from the values of
     * the Event HashMap, and each value will be converted to an attribute of a new
     * Sport object
     * that will be inserted as the value of a Sport HashMap.
     * 
     * @param events
     * @param attributes
     * @return concertEvents
     */
    public Sport generateSportEvent(ArrayList<String> events, ArrayList<String> attributes) {

        Sport sport = new Sport();

        ColumnAttributes sportAtts = new ColumnAttributes();

        sport.setEventName(events.get(sportAtts.searchForNameCol(attributes)));
        sport.setDate(events.get(sportAtts.searchForDateCol(attributes)));
        sport.setTime(events.get(sportAtts.searchForTimeCol(attributes)));
        sport.setEventType(events.get(sportAtts.searchForEventTypeCol(attributes)));
        if (events.get(sportAtts.searchForFireWorksCol(attributes)).equalsIgnoreCase("Yes")) {
            sport.setFireworks("Yes");
            sport.setFireWorksCost(Double.valueOf(events.get(sportAtts.searchForFireWorksCostCol(attributes))));
        } else {
            sport.setFireworks("No");
            sport.setFireWorksCost(0.0);
        }
        Venue venue = new Venue();
        sport.setVenue(venue.obtainVenue(events, attributes));
        sport.getVenue().setSeatsUn(Double.valueOf(events.get(sportAtts.searchForPctSeatsUn(attributes))));
        sport.getVenue().setVIPPct(Double.valueOf(events.get(sportAtts.searchForVIPPctCol(attributes))));
        sport.getVenue().setGoldPct(Double.valueOf(events.get(sportAtts.searchForGoldPctCol(attributes))));
        sport.getVenue().setSilverPct(Double.valueOf(events.get(sportAtts.searchForSilverPctCol(attributes))));
        sport.getVenue().setBronzePct(Double.valueOf(events.get(sportAtts.searchForBronzePctCol(attributes))));
        sport.getVenue().setGenPct(Double.valueOf(events.get(sportAtts.searchForGeneralPctCol(attributes))));
        sport.getVenue().setResPct(Double.valueOf(events.get(sportAtts.searchForGeneralPctCol(attributes))));
        sport.setVipPrice(Double.valueOf(events.get(sportAtts.searchForVIPCol(attributes))));
        sport.setGoldPrice(Double.valueOf(events.get(sportAtts.searchForGoldCol(attributes))));
        sport.setSilverPrice(Double.valueOf(events.get(sportAtts.searchForSilverCol(attributes))));
        sport.setBronzePrice(Double.valueOf(events.get(sportAtts.searchForBronzeCol(attributes))));
        sport.setGeneralPrice(Double.valueOf(events.get(sportAtts.searchForGeneralCol(attributes))));

        return sport;
    }

    
    /**
     * As long as the administrator chooses to, they can modify sport attributes
     * given this method.
     * Individual sports will be accessed via a String key and the Sport
     * HashMap.  Given that the
     * event name is part of the key, if the name is changed, the key will be modified, and the new key
     * with the original Sport value will be inserted back into the HashMap.
     * @param sport
     * @param eventKey
     * @param sportMap
     */
    public void modifySportAttribute(Sport sport, String eventKey, HashMap<String, Sport> sportMap){

        WriteToFile adminModification = new WriteToFile();
        boolean validChange = false;
        while(!validChange){
            System.out.println("Which of the following would you like to do?");
            System.out.println("1. Change an event's name");
            System.out.println("2. Change an event's date");
            System.out.println("3. Change an event's time");
            System.out.println("4. Change an event's VIP price");
            System.out.println("5. Change an event's Gold price");
            System.out.println("6. Change an event's Silver price");
            System.out.println("7. Change an event's Bronze price");
            System.out.println("8. Change an event's General Admission price");
            System.out.println("9. Exit");

            try{

                String option = System.console().readLine();
                int choice = Integer.parseInt(option);
                switch (choice) {
                    // Change an event's name
                    case 1:
                        System.out.println("Now enter the name you want to change this event to:");
                    
                        String newName = System.console().readLine();
                        String [] splitKey = eventKey.split(" ");
                        String newKey = splitKey[0]+" "+newName;
                    
                        Sport originalSport = sportMap.remove(eventKey);
                        sportMap.put(newKey, originalSport);
                        originalSport.setEventName(newName);
                        adminModification.writeAdminActivity(newKey+" and modified the name.");
                        break;
                    // Change an event's date
                    case 2:
                        
                        System.out.println("Now enter the date you want to change this event to:");
                        String newDate = System.console().readLine();
                        sport.setDate(newDate);
                        adminModification.writeAdminActivity(eventKey+" and modified the date.");
                        break;
                    // Change an event's time
                    case 3:
                        
                        System.out.println("Now enter the time you want to change this event to:");
                        String newTime = System.console().readLine();
                        sport.setTime(newTime);
                        adminModification.writeAdminActivity(eventKey+" and modified the time.");
                        
                        break;
                    // Change an event's VIP price
                    case 4:
                        
                        System.out.println(
                                "Now enter the VIP price you want to change this event to (include '.', even if the cents amount is 0)):");
                        double newVIP = Double.valueOf(System.console().readLine());
                        sport.setVipPrice(newVIP);
                        adminModification.writeAdminActivity(eventKey+" and modified the VIP Price.");
                        
                        break;
                    // Change an event's Gold price
                    case 5:
                        
                        System.out.println(
                                "Now enter the Gold Price you want to change this event to (include '.', even if the cents amount is 0):");
                        double newGold = Double.valueOf(System.console().readLine());
                        sport.setGoldPrice(newGold);
                        adminModification.writeAdminActivity(eventKey+" and modified the Gold Price.");
                        
                        break;
                    // Change an event's Silver price
                    case 6:
                        
                        System.out.println(
                                "Now enter the Silver Price you want to change this event to (include '.', even if the cents amount is 0):");
                        double newSilver = Double.valueOf(System.console().readLine());
                        sport.setSilverPrice(newSilver);
                        adminModification.writeAdminActivity(eventKey+" and modified the Silver Price.");
                        
                        break;
                    // Change an event's Bronze price
                    case 7:
                        
                        System.out.println(
                                "Now enter the Bronze Price you want to change this event to (include '.', even if the cents amount is 0):");
                        double newBronze = Double.valueOf(System.console().readLine());
                        sport.setBronzePrice(newBronze);
                        adminModification.writeAdminActivity(eventKey+" and modified the Bronze Price.");
                        
                        break;
                    // Change an event's General Admssion price
                    case 8:
                        
                        System.out.println(
                                "Now enter the General Price you want to change this event to (include '.', even if the cents amount is 0):");
                        double newGeneral = Double.valueOf(System.console().readLine());
                        sport.setGeneralPrice(newGeneral);
                        adminModification.writeAdminActivity(eventKey+" and modified the General Price.");
                        
                        break;
                    // Exit from the application
                    case 9:
                        validChange = true;
                        break;
                    default:
                        System.out.println(
                                "Please make sure you put a valid ID or choice number\nand only numbers or letters in the right places.");
                        break;
                }
            } catch (ArrayIndexOutOfBoundsException d) {
                System.out.println("Please only enter a choice on the menu");
            } catch (ArithmeticException e) {
                System.out.println("Error; no negative values allowed");
            } catch (NumberFormatException f) {
                System.out.println("Input error.  Make sure you appropriately put in letters or numbers where you are supposed to.");
            }
        }
    }
}
