
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
 * - ColumnAttributes.java
 * 
 * - The following file defines a class with methods for finding the column numbers with the respective attributes for an event
 * and customer.  Given the header of the EventList and CustomerList files, their column values will be used to interpret
 * where the attributes of an event or customer are located.  For instance, if the Event ID column is in the third column
 * of the file, then it can be interpreted that the Event ID attributes are located in index 2.  These values will be
 * utilized to obtain and set attributes for events and customers.
 * 
 * This work was done individually and completely on my own. I did not share, reproduce, or alter any part of this 
 * assignment for any purpose. I did not share code, upload this assignment online in any form, or 
 * view/received/modified code written from anyone else. All deliverables were produced entirely on my own. This 
 * assignment is part of an academic course at The University of Texas at El Paso and a grade will be assigned for 
 * the work I produced.
 * 
 */

import java.util.*;
import java.lang.*;

public class ColumnAttributes {

    /**
     * Constructor for ColumnAttributes
     */
    public ColumnAttributes(){}

    /**
     * Will return the column number in the header row corresponding to the "ID" column
     * @param headerRow
     * @return
     */
    public int searchForIDColArrayVersion(String [] headerRow){
        int i;
        for (i = 0; i < headerRow.length; i++) {
            if (headerRow[i].equalsIgnoreCase("Event ID")) {
                return i;
            }
        }
        return i;
    }

    public int searchForNameColArrayVersion(String [] headerRow){
        int i;
        for (i = 0; i < headerRow.length; i++) {
            if (headerRow[i].equalsIgnoreCase("Name")) {
                return i;
            }
        }
        return i;
    }

    /**
     * Will return the column number with the ID attribute of an event
     * @param eventVenAtts
     * @return
     */
    public int searchForIDCol(ArrayList <String> eventVenAtts) {
        int i;
        for (i = 0; i < eventVenAtts.size(); i++) {
            if (eventVenAtts.get(i).equalsIgnoreCase("ID")) {
                return i;
            }
        }
        return i;
    }

    /**
     * Will return the column number with the Name attribute of an event
     * @param eventVenAtts
     * @return
     */
    public int searchForNameCol(ArrayList <String> eventVenAtts) {
        int i;
        for (i = 0; i < eventVenAtts.size(); i++) {
            if (eventVenAtts.get(i).equalsIgnoreCase("Name")) {
                return i;
            }
        }
        return i;
    }

    /**
     * Will return the column number with the Date attribute of an event
     * @param eventVenAtts
     * @return
     */
    public int searchForDateCol(ArrayList <String> eventVenAtts) {
        int i;
        for (i = 0; i < eventVenAtts.size(); i++) {
            if (eventVenAtts.get(i).equalsIgnoreCase("Date")) {
                return i;
            }
        }
        return i;
    }

    /**
     * Will return the column number with the Time attribute of an event
     * @param eventVenAtts
     * @return
     */
    public int searchForTimeCol(ArrayList <String> eventVenAtts) {
        int i;
        for (i = 0; i < eventVenAtts.size(); i++) {
            if (eventVenAtts.get(i).equalsIgnoreCase("Time")) {
                return i;
            }
        }
        return i;
    }

    /**
     * Will return the column number with the "Fireworks Planned" attribute of an event
     * @param eventVenAtts
     * @return
     */
    public int searchForFireWorksCol(ArrayList <String> eventVenAtts) {
        int i;
        for (i = 0; i < eventVenAtts.size(); i++) {
            if (eventVenAtts.get(i).equalsIgnoreCase("Fireworks Planned")) {
                return i;
            }
        }
        return i;
    }

    /**
     * Will return the column number with the Fireworks Cost attribute of an event
     * @param eventVenAtts
     * @return
     */
    public int searchForFireWorksCostCol(ArrayList <String> eventVenAtts){
        int i;
        for(i = 0; i < eventVenAtts.size(); i++){
            if(eventVenAtts.get(i).equalsIgnoreCase("Fireworks Cost")){
                return i;
            }
        }
        return i;
    }

    /**
     * Will return the column number with the VIP Price attribute of an event
     * @param eventVenAtts
     * @return
     */
    public int searchForVIPCol(ArrayList <String> eventVenAtts) {
        int i;
        for (i = 0; i < eventVenAtts.size(); i++) {
            if (eventVenAtts.get(i).equalsIgnoreCase("VIP Price")) {
                return i;
            }
        }
        return i;
    }

    /**
     * Will return the column number with the Gold Price attribute of an event
     * @param eventVenAtts
     * @return
     */
    public int searchForGoldCol(ArrayList <String> eventVenAtts) {
        int i;
        for (i = 0; i < eventVenAtts.size(); i++) {
            if (eventVenAtts.get(i).equalsIgnoreCase("Gold Price")) {
                return i;
            }
        }
        return i;
    }

    /**
     * Will return the column number with the Silver Price attribute of an event
     * @param eventVenAtts
     * @return
     */
    public int searchForSilverCol(ArrayList <String> eventVenAtts) {
        int i;
        for (i = 0; i < eventVenAtts.size(); i++) {
            if (eventVenAtts.get(i).equalsIgnoreCase("Silver Price")) {
                return i;
            }
        }
        return i;
    }

    /**
     * Will return the column number with the Bronze Price attribute of an event
     * @param eventVenAtts
     * @return
     */
    public int searchForBronzeCol(ArrayList <String> eventVenAtts) {
        int i;
        for (i = 0; i < eventVenAtts.size(); i++) {
            if (eventVenAtts.get(i).equalsIgnoreCase("Bronze Price")) {
                return i;
            }
        }
        return i;
    }

    /**
     * Will return the column number with the General Admission Price attribute of an event
     * @param eventVenAtts
     * @return
     */
    public int searchForGeneralCol(ArrayList <String> eventVenAtts) {
        int i;
        for (i = 0; i < eventVenAtts.size(); i++) {
            if (eventVenAtts.get(i).equalsIgnoreCase("General Admission Price")) {
                return i;
            }
        }
        return i;
    }

    /**
     * Will return the column number with the Event Type attribute of an event
     * @param eventVenAtts
     * @return
     */
    public int searchForEventTypeCol(ArrayList <String> eventVenAtts) {
        int i;
        for (i = 0; i < eventVenAtts.size(); i++) {
            if (eventVenAtts.get(i).equalsIgnoreCase("Event Type")) {
                return i;
            }
        }
        return i;
    }

    /**
     * Will return the column number with the VIP Pct attribute of an event
     * @param eventVenAtts
     * @return
     */
    public int searchForVIPPctCol(ArrayList <String> eventVenAtts) {
        int i;
        for (i = 0; i < eventVenAtts.size(); i++) {
            if (eventVenAtts.get(i).equalsIgnoreCase("VIP Pct")) {
                return i;
            }
        }
        return i;
    }

    /**
     * Will return the column number with the Gold Pct attribute of an event
     * @param eventVenAtts
     * @return
     */
    public int searchForGoldPctCol(ArrayList <String> eventVenAtts) {
        int i;
        for (i = 0; i < eventVenAtts.size(); i++) {
            if (eventVenAtts.get(i).equalsIgnoreCase("Gold Pct")) {
                return i;
            }
        }
        return i;
    }

    /**
     * Will return the column number with the Silver Pct attribute of an event
     * @param eventVenAtts
     * @return
     */
    public int searchForSilverPctCol(ArrayList <String> eventVenAtts) {
        int i;
        for (i = 0; i < eventVenAtts.size(); i++) {
            if (eventVenAtts.get(i).equalsIgnoreCase("Silver Pct")) {
                return i;
            }
        }
        return i;
    }

    /**
     * Will return the column number with the Bronze Pct attribute of an event
     * @param eventVenAtts
     * @return
     */
    public int searchForBronzePctCol(ArrayList <String> eventVenAtts) {
        int i;
        for (i = 0; i < eventVenAtts.size(); i++) {
            if (eventVenAtts.get(i).equalsIgnoreCase("Bronze Pct")) {
                return i;
            }
        }
        return i;
    }

    /**
     * Will return the column number with the General Admission Pct attribute of an event
     * @param eventVenAtts
     * @return
     */
    public int searchForGeneralPctCol(ArrayList <String> eventVenAtts) {
        int i;
        for (i = 0; i < eventVenAtts.size(); i++) {
            if (eventVenAtts.get(i).equalsIgnoreCase("General Admission Pct")) {
                return i;
            }
        }
        return i;
    }

    /**
     * Will return the column number with the Reserved Extra Pct attribute of an event
     * @param eventVenAtts
     * @return
     */
    public int searchForReservedExtraCol(ArrayList <String> eventVenAtts) {
        int i;
        for (i = 0; i < eventVenAtts.size(); i++) {
            if (eventVenAtts.get(i).equalsIgnoreCase("Reserved Extra Pct")) {
                return i;
            }
        }
        return i;
    }

    /**
     * Will return the column number with the "Pct Seats Unavailable" attribute of an event
     * @param eventVenAtts
     * @return
     */
    public int searchForPctSeatsUn(ArrayList <String> eventVenAtts) {
        int i;
        for (i = 0; i < eventVenAtts.size(); i++) {
            if (eventVenAtts.get(i).equalsIgnoreCase("Pct Seats Unavailable")) {
                return i;
            }
        }
        return i;
    }

    /**
     * Will return the column number  with the "Venue Name" attribute of an event
     * @param eventVenAtts
     * @return
     */
    public int searchForVenueName(ArrayList <String> eventVenAtts) {
        int i;
        for (i = 0; i < eventVenAtts.size(); i++) {
            if (eventVenAtts.get(i).equalsIgnoreCase("Venue Name")) {
                return i;
            }
        }
        return i;
    }

    /**
     * Will return the column number with the "Venue Type" attribute of an event
     * @param eventVenAtts
     * @return
     */
    public int searchForVenueType(ArrayList <String> eventVenAtts) {
        int i;
        for (i = 0; i < eventVenAtts.size(); i++) {
            if (eventVenAtts.get(i).equalsIgnoreCase("Venue Type")) {
                return i;
            }
        }
        return i;
    }

    /**
     * Will return the column number with the "Capacity" attribute of an event
     * @param eventVenAtts
     * @return
     */
    public int searchForCapacity(ArrayList <String> eventVenAtts) {
        int i;
        for (i = 0; i < eventVenAtts.size(); i++) {
            if (eventVenAtts.get(i).equalsIgnoreCase("Capacity")) {
                return i;
            }
        }
        return i;
    }

    /**
     * Will return the column number with the Venue Cost attribute of an event
     * @param eventVenAtts
     * @return
     */
    public int searchForVenueCost(ArrayList <String> eventVenAtts) {
        int i;
        for (i = 0; i < eventVenAtts.size(); i++) {
            if (eventVenAtts.get(i).equalsIgnoreCase("Cost")) {
                return i;
            }
        }
        return i;
    }



    // The methods below will be utilzed to obtain the eventVenAtts for every customer.

    /**
     * This method will traverse the String 2D array containing the customer csv and
     * will return the column number containing the ID attribute.
     * 
     * @param customerAtts
     * @return i
     */
    public int searchForIDCol(String[][] customerAtts) {
        int i;
        for (i = 0; i < customerAtts[0].length; i++) {
            if (customerAtts[0][i].equalsIgnoreCase("ID")) {
                return i;
            }
        }
        return i;
    }

    /**
     * This method will traverse the String 2D array containing the customer csv and
     * will return the column number containing the First Name attribute.
     * 
     * @param customerAtts
     * @return i
     */
    public int searchForFNameCol(String[][] customerAtts) {
        int i;
        for (i = 0; i < customerAtts[0].length; i++) {
            if (customerAtts[0][i].equalsIgnoreCase("First Name")) {
                return i;
            }
        }
        return -1;
    }

    /**
     * This method will traverse the String 2D array containing the customer csv and
     * will return the column number containing the Last Name attribute.
     * 
     * @param customerAtts
     * @return i
     */
    public int searchForLNameCol(String[][] customerAtts) {
        int i;
        for (i = 0; i < customerAtts[0].length; i++) {
            if (customerAtts[0][i].equalsIgnoreCase("Last Name")) {
                return i;
            }
        }
        return -1;
    }

    /**
     * This method will traverse the String 2D array containing the customer csv and
     * will return the column number containing the Money Available attribute.
     * 
     * @param customerAtts
     * @return i
     */
    public int searchForMoneyAvailCol(String[][] customerAtts) {
        int i;
        for (i = 0; i < customerAtts[0].length; i++) {
            if (customerAtts[0][i].equalsIgnoreCase("Money Available")) {
                return i;
            }
        }
        return -1;
    }

    /**
     * This method will traverse the String 2D array containing the customer csv and
     * will return the column number containing the Events Purchased attribute.
     * 
     * @param customerAtts
     * @return i
     */
    public int searchForPurchasedCol(String[][] customerAtts) {
        int i;
        for (i = 0; i < customerAtts[0].length; i++) {
            if (customerAtts[0][i].equalsIgnoreCase("Concerts Purchased")) {
                return i;
            }
        }
        return -1;
    }

    /**
     * This method will traverse the String 2D array containing the customer csv and
     * will return the column number containing the TicketMiner Membership
     * attribute.
     * 
     * @param customerAtts
     * @return i
     */
    public int searchForMemberCol(String[][] customerAtts) {
        int i;
        for (i = 0; i < customerAtts[0].length; i++) {
            if (customerAtts[0][i].equalsIgnoreCase("TicketMiner Membership")) {
                return i;
            }
        }
        return -1;
    }

    /**
     * This method will traverse the String 2D array containing the customer csv and
     * will return the column number containing the Username attribute.
     * 
     * @param customerAtts
     * @return i
     */
    public int searchForUNameCol(String[][] customerAtts) {
        int i;
        for (i = 0; i < customerAtts[0].length; i++) {
            if (customerAtts[0][i].equalsIgnoreCase("Username")) {
                return i;
            }
        }
        return -1;
    }

    /**
     * This method will traverse the String 2D array containing the customer csv and
     * will return the column number containing the Password attribute.
     * 
     * @param customerAtts
     * @return i
     */
    public int searchForPassWCol(String[][] customerAtts) {
        int i;
        for (i = 0; i < customerAtts[0].length; i++) {
            if (customerAtts[0][i].equalsIgnoreCase("Password")) {
                return i;
            }
        }
        return -1;
    }   
}