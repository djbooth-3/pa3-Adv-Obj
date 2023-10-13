
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
 *        - RunTicket.java
 * 
 *        - The following file runs the main method for the entire project. This
 *        file defines a method for combining all of the class files for this
 *        project and utilizing them to run the TicketMiner system.
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
import java.lang.*;

public class RunTicket {
    public static void main(String[] args) {
        runTicket();
    }

    /**
     * This will be Ground Zero for the system, where every class and method
     * will come together to form a user interface. First, the EventList csv file
     * will be converted to a HashMap, where each value is a string consisting of
     * the event's ID and name, and each value is a String ArrayList consisting of
     * each row, and each element of the row is an atribute of an event as a String. This 
     * origial Event HashMap will be utilized to create three new HashMaps for Sports, 
     * Concerts, and Festivals.  The CustomerList csv file will be converted to an ArrayList 
     * of Customer objects. These data structures will be utilzed to process purchases 
     * of tickets based on the information of the event and the information of the event.
     * A singleton will be used to keep information consistent, all activity will be 
     * logged in a text file, and at program execution, new event and customer csv files
     * will be created.
     * 
     * @param none
     * 
     */
    public static void runTicket() {

        TicketMinerSingleton myTicketMinerSingleton = TicketMinerSingleton.getInstance();

        CSVtoStructure readEventFile = new CSVtoStructure();

        HashMap<String, ArrayList<String>> eventMap = new HashMap<>();
        eventMap = readEventFile.eventCSVToHash("EventListPA3.csv");

        CSVtoStructure readCustomerFile = new CSVtoStructure();

        ArrayList<Customer> customerList = new ArrayList<Customer>();
        customerList = readCustomerFile.FiletoCustAL("CustomerListPA3.csv");

        // Based on the original event HashMap, similar HashMaps for Sport, Concert, and
        // Festival objects will be created and follow the same logic; each key will be
        // the event ID and Name, and each value is the respective Sport, Concert, or
        // Festival objects.
        HashMap<String, Sport> sportMap = new HashMap<>();
        HashMap<String, Concert> concertMap = new HashMap<>();
        HashMap<String, Festival> festivalMap = new HashMap<>();
        for (Map.Entry<String, ArrayList<String>> entry : eventMap.entrySet()) {
            if (entry.getValue().contains("Sport")) {
                String key = entry.getKey();
                Sport sport = new Sport();
                sportMap.put(key, sport.generateSportEvent(eventMap.get(key), eventMap.get("Event ID Name")));
            } else if (entry.getValue().contains("Concert")) {
                String key = entry.getKey();
                Concert concert = new Concert();
                concertMap.put(key, concert.generateConcertEvent(eventMap.get(key), eventMap.get("Event ID Name")));
            }

            else if (entry.getValue().contains("Festival")) {
                String key = entry.getKey();
                Festival festival = new Festival();
                festivalMap.put(key,
                        festival.generateFestivalEvent(eventMap.get(key), eventMap.get("Event ID Name")));
            }
        }

        // Information will remain consistent with a singleton.
        myTicketMinerSingleton.setSportMap(sportMap);
        myTicketMinerSingleton.setConcertMap(concertMap);
        myTicketMinerSingleton.setFestivalMap(festivalMap);
        myTicketMinerSingleton.setCustomerList(customerList);

        while (true) {

            LoginPage userLogin = new LoginPage();
            Customer customer = new Customer();
            customer = userLogin.userLoginInterface(myTicketMinerSingleton.getCustomerList(),
                    myTicketMinerSingleton.getSportMap(), myTicketMinerSingleton.getConcertMap(),
                    myTicketMinerSingleton.getFestivalMap());

            boolean exit = false;
            while (!exit) {
                try {

                    System.out.println(
                            "================================================================================");
                            // The purpose of this format is to round the value to two decimal places.
                    System.out.println("Your current balance: " + Math.floor(customer.getAvailableMoney() * 100) / 100);
                    System.out.println(
                            "Enter the number of the type of event you would like to purchase a ticket for or the information you would like to view: ");

                    // The user can work with any of the options below.
                    System.out.println("1. Sport");
                    System.out.println("2. Concert");
                    System.out.println("3. Festival");
                    System.out.println("4. Your invoices and tickets");
                    System.out.println("5. Exit");
                    System.out.println(
                            "================================================================================");

                    int eventChoice = Integer.parseInt(System.console().readLine());

                    switch (eventChoice) {
                        case 1:
                            // The Sport HashMap will be utilized to obtain the appropriate event the user
                            // wants to buy a ticket for.
                            System.out.println(
                                    "Enter the ID of the event you would like to purchase for followed by a space, followed by the event's name.\nFormat: ID Event Name");
                            String sKey = System.console().readLine();

                            if (sportMap.get(sKey).getVenue().getSeatsUn() == 100) {
                                System.out.println(
                                        "Sorry, but there are no more tickets available for this event.  You will be redirected to the start.");
                                break;
                            }

                            ProcessPurchase sportPurchase = new ProcessPurchase();
                            sportPurchase.processPurchase(customer, sportMap.get(sKey), sKey);

                            break;
                        case 2:
                            // The Concert HashMap will be utilized to obtain the appropriate event the user
                            // wants to buy a ticket for.
                            System.out.println(
                                    "Enter the ID of the event you would like to purchase for followed by a space, followed by the event's name.\nFormat: ID Event Name");
                            String cKey = System.console().readLine();

                            if (concertMap.get(cKey).getVenue().getSeatsUn() == 100) {
                                System.out.println(
                                        "Sorry, but there are no more tickets available for this event.  You will be redirected to the start.");
                                break;
                            }

                            ProcessPurchase concertPurchase = new ProcessPurchase();
                            concertPurchase.processPurchase(customer, concertMap.get(cKey), cKey);

                            break;
                        case 3:
                            // The Festival HashMap will be utilized to obtain the appropriate event the
                            // user wants to buy a ticket for.
                            System.out.println(
                                    "Enter the ID of the event you would like to purchase for followed by a space, followed by the event's name.\nFormat: ID Event Name");
                            String fKey = System.console().readLine();

                            if (festivalMap.get(fKey).getVenue().getSeatsUn() == 100) {
                                System.out.println(
                                        "Sorry, but there are no more tickets available for this event.  You will be redirected to the start.");
                                break;
                            }

                            ProcessPurchase festivalPurchase = new ProcessPurchase();
                            festivalPurchase.processPurchase(customer, festivalMap.get(fKey), fKey);
                            break;
                        case 4:
                            // The user will be able to view information about all of their invoices.
                            customer.printInvoices();
                            customer.printTicketList();
                            System.out.println("Saved: $"+customer.getSaved());
                            break;
                        case 5:
                        // This is done to keep information and activity consistent.
                            myTicketMinerSingleton.setSportMap(sportMap);
                            myTicketMinerSingleton.setConcertMap(concertMap);
                            myTicketMinerSingleton.setFestivalMap(festivalMap);
                            myTicketMinerSingleton.setCustomerList(customerList);
                            exit = true;
                            break;
                        default:
                            break;
                    }
                } catch (NumberFormatException f) {
                    System.out.println(
                            "Input error. Make sure you appropriately put in letters or numbers where you are supposed to.  You will have to restart the process");
                    System.out.println();
                } catch (NullPointerException b) {
                    System.out
                            .println(
                                    "This event does not exist.  You will have to restart the process.");
                    System.out.println();
                }
            }
        }
    }
}