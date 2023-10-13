
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
 *        - CSVtoStructure.java
 * 
 *        - The following file defines a class with methods for transferring csv file
 *        contents to data structures.  The EventList csv will be converted to a HashMap
 *        where each key is a string consisting of the Event's ID and Name, and each
 *        value is a String ArrayList containing each of the attributes of the event.
 *        There is also a method for converting the CustomerList csv file to an 
 *        ArrayList of Customer objects.
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

import java.io.*;
import java.util.*;

public class CSVtoStructure {

    /**
     * Constructor for CSVtoStructure
     */
    public CSVtoStructure() {
    }

    /**
     * The following method will convert the EventList to a HashMap
     * where each key is a string consisting of the Event's ID and Name, and each
     * value is a String ArrayList containing each of the attributes of the event.
     * 
     * @param fileName
     * @return
     */
    public HashMap<String, ArrayList<String>> eventCSVToHash(String fileName) {

        // The String arraylist will store rows of the csv file.
        HashMap<String, ArrayList<String>> hm = new HashMap<>();

        ColumnAttributes headerAttributes = new ColumnAttributes();

        try {
            String noe; // As in "number of events"
            String [] header = null;

            BufferedReader br1 = new BufferedReader(
                    new FileReader(
                            fileName));

            String headerRow;
            if ((headerRow = br1.readLine()) != null) {
                header = headerRow.split(","); // Assuming CSV uses commas as separators
                ArrayList<String> headerAsAL = new ArrayList<>(Arrays.asList(header));
                hm.put("Event ID Name", headerAsAL);
            }

            while ((noe = br1.readLine()) != null) {
                String[] eventRow = noe.split(","); // Assuming CSV uses commas as separators

                // Check if the line has enough parts (e.g., key and value)
                if (eventRow.length >= 2) {
                    String key = eventRow[headerAttributes.searchForIDColArrayVersion(header)].trim() + " " + eventRow[headerAttributes.searchForNameColArrayVersion(header)].trim();

                    ArrayList<String> stringValue = new ArrayList<String>();

                    // Build the value from the remaining parts
                    for (int i = 0; i < eventRow.length; i++) {
                        stringValue.add(eventRow[i]);
                    }

                    hm.put(key, stringValue);
                }
            }
            br1.close();
            // Any exceptions that occur at any point will be caught here, whether it is for
            // file reading or invalid input. The while(true) loop ensures the user will be
            // brought back to the start.
        } catch (FileNotFoundException a) {
            a.printStackTrace();
        } catch (IOException b) {
            System.out.println("Error; check input");
        }
        return hm;
    }

    /**
     * The following method will convert the CustomerList csv file to an
     * ArrayList of Customer objects.
     * 
     * @param fileName
     * @return
     */
    public ArrayList<Customer> FiletoCustAL(String fileName) {

        // Customer csv file contents will be stored as an ArrayList of Customer
        // objects; csv file will be converted to a 2D array, and each row can be
        // interpreted as an individual Customer object. In other words, the 2D array
        // will be traversed and each row will be converted to an element of an
        // ArrayList of Customer objects.
        ArrayList<Customer> customerList = new ArrayList<Customer>();

        try {

            String noc; // As in "number of customers"

            BufferedReader br2 = new BufferedReader(
                    new FileReader(
                            fileName));

            ArrayList<String> customerRows = new ArrayList<String>();

            // As long as a line is not empty, contents of the file will be obtained.
            while ((noc = br2.readLine()) != null) {
                // The contents of each row in the file will be passed from the string "noc" to
                // a row in the arraylist "events"
                customerRows.add(noc);
            }

            br2.close();

            String[][] customerFileAsArray = new String[customerRows.size()][customerRows.size()];
            for (int i = 0; i < customerRows.size(); i++) {
                String[] customerFileBit = customerRows.get(i).split(",");
                customerFileAsArray[i] = customerFileBit;
            }

            for (int i = 1; i < customerFileAsArray.length - 1; i++) {
                Customer customer = new Customer();
                customerList.add(customer.generateCustomer(customerFileAsArray, i));
            }

        } catch (FileNotFoundException a) {
            a.printStackTrace();
        } catch (IOException b) {
            System.out.println("Error; check input");
        }

        return customerList;
    }

}
