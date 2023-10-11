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
 *        - WriteToFile.java
 * 
 *        - The following file define methods for writing TicketMiner activity
 *        to an output file.
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

import java.io.*;
import java.util.*;

public class WriteToFile {

    /**
     * Constructor for WriteToFile
     */
    public WriteToFile() {
    }

    /**
     * The following method will take in the following parameters and use them to
     * create a string value for a log file.  This will record purchase activity.
     * 
     * @param customer
     * @param ticketQty
     * @param tickets
     * @param event
     * @param balance
     * @param eventInfo
     * @return none
     */

    // Note: I did not believe it would be relevant to record mistakes in the text
    // file, so all incorrect inputs are omitted.
    public void writeToOutputFile(Customer customer, int ticketQty, Ticket tickets, Event event, double balance,
            String eventInfo) {
        try {
            String outputFile = "log.txt";
            String logItem = (customer.getFName() + " " + customer.getLName() + " bought " + ticketQty + " "
                    + tickets.getTName() + " ticket(s) for event ID " + eventInfo + ".  Customer's current balance is "
                    + Math.floor(balance * 100) / 100 + "\n");
            FileWriter output = new FileWriter(outputFile, true);
            output.write(logItem);
            output.close();
        } catch (IOException z) {
            z.printStackTrace();
        }
    }

    /**
     * The following method will print Admin activity to an output file.  This includes event viewership and event changes.
     * @param eventInfo
     */
    public void writeAdminActivity(
            String eventInfo) {
        try {
            String outputFile = "log.txt";
            String logItem = ("Adminstrator inquired about the event with the ID and name, " + eventInfo+"\n");
            FileWriter output = new FileWriter(outputFile, true);
            output.write(logItem);
            output.close();
        } catch (IOException z) {
            z.printStackTrace();
        }
    }

    /**
     * The following method will create an updated CustomerList csv file.
     * @param customerList
     */
    public void writeNewCustomerList(ArrayList<Customer> customerList) {

        try {
            String updatedCList = "updatedCustomerSheet.csv";

            String attributes = "ID,First Name,Last Name,Money Available,Concerts Purchased,TicketMiner Membership,Username,Password\n";

            FileWriter customerOutput = new FileWriter(updatedCList);
            customerOutput.write(attributes);
            for (int i = 0; i < customerList.size(); i++) {
                String customerListRow = customerList.get(i).getID() + "," + customerList.get(i).getFName() + ","
                        + customerList.get(i).getLName() + "," + String.valueOf(customerList.get(i).getAvailableMoney())
                        + "," + String.valueOf(customerList.get(i).getNumOfPurchasedEvents()) + ","
                        + String.valueOf(customerList.get(i).getTMMS()) + "," + customerList.get(i).getUserN() + ","
                        + customerList.get(i).getPassW() + "\n";
                customerOutput.write(customerListRow);
            }
            customerOutput.close();

        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    /**
     * The following method will create an updated EventList csv file.
     * @param concertMap
     * @param sportMap
     * @param festivalMap
     */
    public void writeNewEventList(HashMap<String, Concert> concertMap, HashMap<String, Sport> sportMap,
            HashMap<String, Festival> festivalMap) {

        try {
            // All Sport objects and their information will be printed, first.
            String updatedEList = "updatedEventSheet.csv";

            String attributes = "Event ID,Event Type,Name,Date,Time,VIP Price,Gold Price,Silver Price,Bronze Price,General Admission Price,Venue Name,Pct Seats Unavailable,Venue Type,Capacity,Cost,VIP Pct,Gold Pct,Silver Pct,Bronze Pct,General Admission Pct,Reserved Extra Pct,Fireworks Planned,Fireworks Cost,VIP Seats Sold,Gold Seats Sold,Silver Seats Sold,Bronze Seats Sold,General Admission Seats Sold,Total VIP Revenue,Total Gold Revenue,Total Silver Revenue,Total Bronze Revenue,Total General Admission Revenue\n";
            FileWriter eventOutput = new FileWriter(updatedEList);
            eventOutput.write(attributes);

            for (Map.Entry<String, Sport> se : sportMap.entrySet()) {

                String[] splitKey = se.getKey().split(" ");

                Sport sportTemp = se.getValue();

                String sID = splitKey[0];

                ObjectAsString sportString = new ObjectAsString();

                String restOfSportObj = sportString.eventAsString(sportTemp);

                String sportRow = sID + "," + restOfSportObj;

                eventOutput.write(sportRow);

            }

            // All Concert objects and their information will be printed, second.
            for (Map.Entry<String, Concert> ce : concertMap.entrySet()) {

                String[] splitKey = ce.getKey().split(" ");

                Concert concertTemp = ce.getValue();

                String cID = splitKey[0];

                ObjectAsString concertString = new ObjectAsString();

                String restOfConcertObj = concertString.eventAsString(concertTemp);

                String concertRow = cID + "," + restOfConcertObj;

                eventOutput.write(concertRow);
            }

            // All Festival objects and their information will be printed, last.
            for (Map.Entry<String, Festival> fe : festivalMap.entrySet()) {

                String[] splitKey = fe.getKey().split(" ");

                Festival festivalTemp = fe.getValue();

                String fID = splitKey[0];

                ObjectAsString festivalString = new ObjectAsString();

                String restOfFestivalObj = festivalString.eventAsString(festivalTemp);

                String festivalRow = fID + "," + restOfFestivalObj;

                eventOutput.write(festivalRow);
            }
            eventOutput.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }
}
