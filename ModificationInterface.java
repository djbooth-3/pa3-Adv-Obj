//import java.util.HashMap;

/**
 * @author Darein Booth
 * 
 * @since October 12, 2023
 * 
 * - CS 3331 - Advanced Object-Oriented Programming
 * 
 * - Dr. Daniel Mejia
 * 
 * - Programming Assignment 2
 * 
 * - Event.java
 * 
 * - The following file defines an interface for modifyin event attributes
 * 
 * - This work was done individually and completely on my own. I did not share, reproduce, or alter any part of this 
 * assignment for any purpose. I did not share code, upload this assignment online in any form, or 
 * view/received/modified code written from anyone else. All deliverables were produced entirely on my own. This 
 * assignment is part of an academic course at The University of Texas at El Paso and a grade will be assigned for 
 * the work I produced.
 * 
 */

//public class ModificationInterface{

    /* 
    public void modifyEventAttribute(Event event, String eventKey, HashMap<String, Sport> sportMap){

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
                    
                        Event originalConcert = sportMap.remove(eventKey);
                        sportMap.put(newKey, originalConcert);
                        originalConcert.setEventName(newName);
                        adminModification.writeAdminActivity(newKey+" and modified the name.");
                        break;
                    // Change an event's date
                    case 2:
                        
                        System.out.println("Now enter the date you want to change this event to:");
                        String newDate = System.console().readLine();
                        event.setDate(newDate);
                        adminModification.writeAdminActivity(eventKey+" and modified the date.");
                        break;
                    // Change an event's time
                    case 3:
                        
                        System.out.println("Now enter the time you want to change this event to:");
                        String newTime = System.console().readLine();
                        event.setTime(newTime);
                        adminModification.writeAdminActivity(eventKey+" and modified the time.");
                        
                        break;
                    // Change an event's VIP price
                    case 4:
                        
                        System.out.println(
                                "Now enter the VIP price you want to change this event to (include '.', even if the cents amount is 0)):");
                        double newVIP = Double.valueOf(System.console().readLine());
                        event.setVipPrice(newVIP);
                        adminModification.writeAdminActivity(eventKey+" and modified the VIP Price.");
                        
                        break;
                    // Change an event's Gold price
                    case 5:
                        
                        System.out.println(
                                "Now enter the Gold Price you want to change this event to (include '.', even if the cents amount is 0):");
                        double newGold = Double.valueOf(System.console().readLine());
                        event.setGoldPrice(newGold);
                        adminModification.writeAdminActivity(eventKey+" and modified the Gold Price.");
                        
                        break;
                    // Change an event's Silver price
                    case 6:
                        
                        System.out.println(
                                "Now enter the Silver Price you want to change this event to (include '.', even if the cents amount is 0):");
                        double newSilver = Double.valueOf(System.console().readLine());
                        event.setSilverPrice(newSilver);
                        adminModification.writeAdminActivity(eventKey+" and modified the Silver Price.");
                        
                        break;
                    // Change an event's Bronze price
                    case 7:
                        
                        System.out.println(
                                "Now enter the Bronze Price you want to change this event to (include '.', even if the cents amount is 0):");
                        double newBronze = Double.valueOf(System.console().readLine());
                        event.setBronzePrice(newBronze);
                        adminModification.writeAdminActivity(eventKey+" and modified the Bronze Price.");
                        
                        break;
                    // Change an event's General Admssion price
                    case 8:
                        
                        System.out.println(
                                "Now enter the General Price you want to change this event to (include '.', even if the cents amount is 0):");
                        double newGeneral = Double.valueOf(System.console().readLine());
                        event.setGeneralPrice(newGeneral);
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
*/