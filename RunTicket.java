/**
 * Course: Adv. Object-Oriented Programming (CS 3331)
 * Instructor: Dr. Mejia 
 * Assignment: Programming Assignment 2
 * Lab description: Adding to the previous assigment, we add an administrator login where they can inquire about event information and then write to two new csv files (New EventList and New Customer List). 
 * Honesty Statment: I Darien Booth, completed this work entirely on my own without any outside sources including peers, experts, onlines sources, or the like. 
 * @author Darien Booth 
 * @since 10/2/2023
 *
*/

//imports
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RunTicket {

    /**
     * Stores the information read from scanner line in object venue  
     * @param arr string array that is being sliced and stored
     * @return the object Venue that contains stored information
     */
    public static Venue makeVenue(String[] arr) {
        Factory factory = new Factory(); 
        switch (arr[12]) {
            case "Stadium":     // for stadium 
                Venue stadium = factory.createVenue("Stadium");
                stadium.setVenueName(arr[10]);
                stadium.setPctSeatsUA(Integer.parseInt(arr[11]));
                stadium.setVenueType(arr[12]);
                stadium.setCapacity(Integer.parseInt(arr[13]));
                stadium.setAvailCapacity(stadium.getCapacity() - (stadium.getCapacity() * (stadium.getPctSeatsUA() / 100)));
                stadium.setCost(Integer.parseInt(arr[14]));
                stadium.setVipPct(Integer.parseInt(arr[15]));
                stadium.setGoldPct(Integer.parseInt(arr[16]));
                stadium.setSilverPct(Integer.parseInt(arr[17]));
                stadium.setBronzePct(Integer.parseInt(arr[18]));
                stadium.setGenAdmPct(Integer.parseInt(arr[19]));
                stadium.setResExtraPct(Integer.parseInt(arr[20]));
                try {
                    stadium.setFireworksPlanned(arr[21]);
                } catch (ArrayIndexOutOfBoundsException e) {         // exception for if fireworks planned is empty 
                    stadium.setFireworksPlanned("No");
                    stadium.setFireworksCost(0);
                    return stadium;
                }
                if (arr[21].equals("No")) {        // if statment to check if fireworks planned is no so i can auto set cost to 0 
                    stadium.setFireworksCost(0);
                    return stadium;
                }
                stadium.setFireworksCost(Integer.parseInt(arr[22]));
                return stadium;
            case "Arena":      // for arena
                Venue arena = factory.createVenue("Arena");
                arena.setVenueName(arr[10]);
                arena.setPctSeatsUA(Integer.parseInt(arr[11]));
                arena.setVenueType(arr[12]);
                arena.setCapacity(Integer.parseInt(arr[13]));
                arena.setAvailCapacity(arena.getCapacity() - (arena.getCapacity() * (arena.getPctSeatsUA() /  100)));
                arena.setCost(Integer.parseInt(arr[14]));
                arena.setVipPct(Integer.parseInt(arr[15]));
                arena.setGoldPct(Integer.parseInt(arr[16]));
                arena.setSilverPct(Integer.parseInt(arr[17]));
                arena.setBronzePct(Integer.parseInt(arr[18]));
                arena.setGenAdmPct(Integer.parseInt(arr[19]));
                arena.setResExtraPct(Integer.parseInt(arr[20]));
                try {
                    arena.setFireworksPlanned(arr[21]);
                } catch (ArrayIndexOutOfBoundsException e) {       // exception for if fireworks planned is empty 
                    arena.setFireworksPlanned("No");
                    arena.setFireworksCost(0);
                    return arena;
                }
                if (arr[21].equals("No")) {          // if statment to check if fireworks planned is no so i can auto set cost to 0 
                    arena.setFireworksCost(0);
                    return arena;
                }
                arena.setFireworksCost(Integer.parseInt(arr[22]));
                return arena;
            case "Auditorium":   // for auditorium
                Venue auditorium = factory.createVenue("Auditorium");
                auditorium.setVenueName(arr[10]);
                auditorium.setPctSeatsUA(Integer.parseInt(arr[11]));
                auditorium.setVenueType(arr[12]);
                auditorium.setCapacity(Integer.parseInt(arr[13]));
                auditorium.setAvailCapacity(auditorium.getCapacity() - (auditorium.getCapacity() * (auditorium.getPctSeatsUA() / 100)));
                auditorium.setCost(Integer.parseInt(arr[14]));
                auditorium.setVipPct(Integer.parseInt(arr[15]));
                auditorium.setGoldPct(Integer.parseInt(arr[16]));
                auditorium.setSilverPct(Integer.parseInt(arr[17]));
                auditorium.setBronzePct(Integer.parseInt(arr[18]));
                auditorium.setGenAdmPct(Integer.parseInt(arr[19]));
                auditorium.setResExtraPct(Integer.parseInt(arr[20]));
                try {
                    auditorium.setFireworksPlanned(arr[21]);
                } catch (ArrayIndexOutOfBoundsException e) {      // exception for if fireworks planned is empty 
                    auditorium.setFireworksPlanned("No");
                    auditorium.setFireworksCost(0);
                    return auditorium;
                }
                if (arr[21].equals("No")) {            // if statment to check if fireworks planned is no so i can auto set cost to 0 
                    auditorium.setFireworksCost(0);
                    return auditorium;
                }
                auditorium.setFireworksCost(Integer.parseInt(arr[22]));
                return auditorium;
            case "Open Air":    // for open air
                Venue openAir = factory.createVenue("OpenAir");
                openAir.setVenueName(arr[10]);
                openAir.setPctSeatsUA(Integer.parseInt(arr[11]));
                openAir.setVenueType(arr[12]);
                openAir.setCapacity(Integer.parseInt(arr[13]));
                openAir.setAvailCapacity(openAir.getCapacity() - (openAir.getCapacity() * (openAir.getPctSeatsUA() / 100)));
                openAir.setCost(Integer.parseInt(arr[14]));
                openAir.setVipPct(Integer.parseInt(arr[15]));
                openAir.setGoldPct(Integer.parseInt(arr[16]));
                openAir.setSilverPct(Integer.parseInt(arr[17]));
                openAir.setBronzePct(Integer.parseInt(arr[18]));
                openAir.setGenAdmPct(Integer.parseInt(arr[19]));
                openAir.setResExtraPct(Integer.parseInt(arr[20]));
                try {
                    openAir.setFireworksPlanned(arr[21]);
                } catch (ArrayIndexOutOfBoundsException e) {    // exception for if fireworks planned is empty 
                    openAir.setFireworksPlanned("No");
                    openAir.setFireworksCost(0);
                    return openAir;
                }
                if (arr[21].equals("No")) {       // if statment to check if fireworks planned is no so i can auto set cost to 0 
                    openAir.setFireworksCost(0);
                    return openAir;
                }
                openAir.setFireworksCost(Integer.parseInt(arr[22]));
                return openAir;
            default:
                Venue temp = factory.createVenue("Stadium");
                return temp;
        }
    }

    /**
     * Checks if customer or administrator is loginning in 
     * @param events arraylist of events that contains their information
     * @param customers arraylist of customers that contains their information
     * @param res arraylist of the actions that are being logged 
     */
    public static void identifyUser(ArrayList<Event> events, ArrayList<Customer> customers, ArrayList<String> res) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you a customer or administrator?");
        System.out.println("If you wish to leave enter EXIT");
        String role = sc.nextLine();
        if(role.equals("customer")) {  // user is a customer
            login(events, customers, 0, 0, res); 
        } else if(role.equals("administrator")) { // user is a administrator
            res.add("Administrator has logged in."); // add action of logged in
            mainMenuAdm(events, customers, res);
        } else if(role.equals("EXIT")) { // user whats to log out 
            System.out.println("You have logged out!");
        } else {
            System.out.println("Invalid entry!");
            identifyUser(events, customers, res); // invalid entry
        }
    }

    /**
     * Main menu of administrator, listing possible options
     * @param events arraylist of events that contains their information
     * @param customers arraylist of customers that contains their information
     * @param res arraylist of the actions that are being logged 
     */
    public static void mainMenuAdm(ArrayList<Event> events, ArrayList<Customer> customers, ArrayList<String> res) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What would you like to do?");
        System.out.println("A. Inquire event by ID");
        System.out.println("B. Inquire event by name");
        System.out.println("Enter EXIT to leave.");
        String action = sc.nextLine();
        if(action.toUpperCase().equals("A")) {  // administrator whats to search by ID
            inquire(events, customers, 1, 0, res);
        } else if(action.toUpperCase().equals("B")) { // administrator whats to search by name
            inquire(events, customers, 2, 0, res);
        } else if(action.equals("EXIT")) { // adminstrator whats to exit 
            res.add("Administrator has logged out."); // add action of log out
            identifyUser(events, customers, res);
        } else {
            System.out.println("Invalid entry!");
            mainMenuAdm(events, customers, res); // invalid entry
        }
    }

    /**
     * Asks for id or name and provides the information on the event 
     * @param events arraylist of events that contains their information
     * @param customers arraylist of customers that contains their information
     * @param choice integer for which way wish to inquire event info by ID or name 
     * @param evntID integer for event ID 
     * @param res arraylist of the actions that are being logged 
     */
    public static void inquire(ArrayList<Event> events, ArrayList<Customer> customers, int choice, int evntID, ArrayList<String> res) {
        Scanner sc = new Scanner(System.in);
        boolean loop = true; 
        while(loop) {
            switch(choice){
                case 1:      // for inquireing by event ID 
                    try{
                        System.out.println("Please enter event ID between 1 - " + (events.size() - 1) + ":");
                        evntID = sc.nextInt();
                    } catch (InputMismatchException e) {          // user does not in put a integer
                        System.out.println("Invalid entry!");
                        inquire(events, customers, choice, evntID, res);
                    }
                    if(evntID < 1 || evntID >= events.size()){   // user input is below 1 or above event size 
                        System.out.println("Invalid entry!");
                        break;
                    }
                    loop = false; // if everything passes set loop to false and move on 
                    break;
                case 2: 
                    System.out.println("Please enter event name:");
                    String evntName = sc.nextLine();
                    for(int i = 0; i < events.size();i++) {  // finding name in list and setting to event id 
                        if(evntName.equals(events.get(i).getname())){
                            evntID = events.get(i).getidEvent();
                        }
                    }
                    if(evntID == 0) {   //event id was not set so name is not list 
                        System.out.println("Invalid entry!");
                        break;
                    }
                    loop = false; // if everything passes set loop to false and move on 
                    break;
            }
        }
        // loop for setting/updating information on number of seats sold for each and current profit 
        for(int i = 0; i < events.size(); i++) {
            events.get(i).setVipSold((events.get(i).getVenue().getAvailCapacity() * (events.get(i).getVenue().getVipPct() / 100)) - events.get(i).getNumOfVS());
            events.get(i).setGoldSold((events.get(i).getVenue().getAvailCapacity() * (events.get(i).getVenue().getGoldPct() / 100)) - events.get(i).getNumOfGS());
            events.get(i).setSilverSold((events.get(i).getVenue().getAvailCapacity() * (events.get(i).getVenue().getSilverPct() / 100)) - events.get(i).getNumOfSS());
            events.get(i).setBronzeSold((events.get(i).getVenue().getAvailCapacity() * (events.get(i).getVenue().getBronzePct() / 100)) - events.get(i).getNumOfBS());
            events.get(i).setGenAdmSold((events.get(i).getVenue().getAvailCapacity() * (events.get(i).getVenue().getGenAdmPct() / 100)) - events.get(i).getNumOfGNS());
            events.get(i).setCurrentProfit(((events.get(i).getVipSold() * events.get(i).getVipPrice()) + (events.get(i).getGoldSold() * events.get(i).getGoldPrice()) + (events.get(i).getSilverSold() * events.get(i).getSilverPrice()) + (events.get(i).getBronzeSold() * events.get(i).getBronzePrice()) + (events.get(i).getGenAdmSold() * events.get(i).getGenAdmPrice())) - (events.get(i).getVenue().getCost() + events.get(i).getVenue().getFireworksCost()));
        }
        res.add("Administrator has inquired about event " + evntID); // log action 
        events.get(evntID-1).printEventInfo();  // print info 
        mainMenuAdm(events, customers, res); // back to main menu for admin
    }

    /**
     * Checks that the information on a customer is correct
     * @param customers arraylist of customers that contains their information
     * @param s string containing what needs to be checked
     * @param n integer that is the id of the individual 
     * @return returns true or false if information is present or correct
     */
    public static boolean infoCheck(ArrayList<Customer> customers, String s, int n) {
        if(s.equals(customers.get(n).getLastName())) { // checks last name is correct
            return true; 
        }
        else if(s.equals(customers.get(n).getUsername())) { // checks username is correct
            return true; 
        }
        else if(s.equals(customers.get(n).getPassword())) { // checks password is correct 
            return true; 
        }
        return false; 
    }

    /**
     * Method is the login for the customer that wants to buy a ticket
     * @param events arraylist of events that contains their information
     * @param customers arraylist of customers that contains their information
     * @param state integer of the state of switch statement
     * @param id integer that is the id of the indiviudal (default is 0 until first name is inputed)
     * @param res arraylist of the actions that are being logged 
     */
    public static void login(ArrayList<Event> events, ArrayList<Customer> customers, int state, int id, ArrayList<String> res) {
        Scanner sc = new Scanner(System.in);
        boolean loop = true; // too keep loop for switch statement
        while(loop) {
            switch(state) {
                case 0: // first name 
                    System.out.println("Please enter your first name:");
                    String fn = sc.nextLine();
                    for(int x = 0; x < customers.size(); x++) {
                        if(fn.equals(customers.get(x).getFirstName())) {
                            state = 1; // transition to next state
                            id = x; // set id for the user
                        }
                    }
                    if(state == 0) {
                        System.out.println("First name not found! Please try again."); // first name does not exist   
                    } 
                    break;
                case 1: // last name
                    System.out.println("Please enter your last name:");
                    String ln = sc.nextLine();
                    if(!infoCheck(customers, ln, id)) {
                        System.out.println("Last name not found! Please try again."); // last name is not found
                        break; 
                    }
                    state = 2; // transition to next state if correct
                    break;
                case 2: // username
                    System.out.println("Please enter your username:");
                    String usr = sc.nextLine(); 
                    if(!infoCheck(customers, usr, id)) {
                        System.out.println("Username Incorrect! Please try again."); // username is incorrect
                        break; 
                    }
                    state = 3;
                    break; // transition to next state if correct
                case 3: // password
                    System.out.println("Please enter your password:");
                    String pas = sc.nextLine(); 
                    if(!infoCheck(customers, pas, id)) {
                        System.out.println("Password Incorrect! Please try again."); // password is incorrect
                        break; 
                    }
                    loop = false; // everything is correctly answered so stop loop and move on
                    break; // exit 
                }
            }
            res.add(customers.get(id).getFirstName() + " " + customers.get(id).getLastName() + " has logged in."); // add action of who logged in 
            mainMenu(events, customers, id, 1, res); // move to main menu
    }

    /**
     * Method is the main menu for the customer that displays infomation and possible actions
     * @param events arraylist of events that contains their information
     * @param customers arraylist of customers that contains their information
     * @param id integer that is the id of the indiviudal 
     * @param transactionNum integer that keeps track of transaction number  
     * @param res arraylist of the actions that are being logged 
     */
    public static void mainMenu(ArrayList<Event> events, ArrayList<Customer> customers, int id, int transactionNum, ArrayList<String> res) {
        Scanner sc = new Scanner(System.in);
        customers.get(id).printInfo(); // displays customer info like name, membership, money, and concerts purchased 
        System.out.println("Would you like to view the event list?");
        System.out.println("Enter yes to view or EXIT to leave.");
        String ans = sc.nextLine();
        if(ans.equals("EXIT")) {  // user wants to EXIT
            System.out.println("Bye Bye!"); 
            res.add(customers.get(id).getFirstName() + " " + customers.get(id).getLastName() + " has logged out."); // add exit action
            identifyUser(events, customers, res);
        } else if(ans.toLowerCase().equals("yes") == false) { // user enters anything other than the two possible actions
            System.out.println("Invalid Entry! Try again");
            mainMenu(events, customers, id, transactionNum, res);
        } else {
            eventDisplay(events, customers, id, transactionNum, res); // entry is yes and moves on 
        }
    }

    /**
     * Method displays all events for customer
     * @param events arraylist of events that contains their information
     * @param customers arraylist of customers that contains their information
     * @param id integer that is the id of the indiviudal 
     * @param transactionNum integer that keeps track of transaction number  
     * @param res arraylist of the actions that are being logged 
     */
    public static void eventDisplay(ArrayList<Event> events, ArrayList<Customer> customers, int id, int transactionNum, ArrayList<String> res) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------");  // display events
        for(int i = 0; i < events.size(); i++) {
            events.get(i).printEvents(); 
        }
        System.out.println("-----------------------");
        while(true){
            try{
                System.out.println("which event would you like to look at?"); 
                int response = sc.nextInt();
                if(response < 1 || response >= events.size()) {
                    System.out.println("Please pick between 1 - " + (events.size() - 1));  // user enters number below 1 or above 71
                    eventDisplay(events, customers, id, transactionNum, res);
                }
                else {  // user picks event and moves on
                    startTransaction(events, customers, id, transactionNum, response, false, false, false, false, false, 0, 0, res);
                    break;
                }
            } catch (InputMismatchException e) {  // input mismatch exception for if user does not enter integer 
                System.out.println("Please enter an integer between 1 -!" + (events.size() - 1));
                eventDisplay(events, customers, id, transactionNum, res);
            }
        }
    }

    /**
     * Method that displays the price tickets for each event
     * @param events arraylist of events that contains their information
     * @param customers arraylist of customers that contains their information
     * @param id integer that is the id of the indiviudal 
     * @param transactionNum integer that keeps track of transaction number
     * @param eventNum integer of the event the customer wants to look at 
     * @param vipPur boolean for if user already purchased a vip ticket 
     * @param goldPur boolean for if user already purchased a gold ticket 
     * @param silPur boolean for if user already purchased a silver ticket 
     * @param bronPur boolean for if user already purchased a bronze ticket 
     * @param genPur boolean for if user already purchased a general admission ticket 
     * @param count integer to keep track of the number of tickets purchased
     * @param total integer to keep track of the total amount 
     * @param res arraylist of the actions that are being logged
     */
    public static void startTransaction(ArrayList<Event> events, ArrayList<Customer> customers, int id, int transactionNum, int eventNum, boolean vipPur, boolean goldPur, boolean silPur, boolean bronPur, boolean genPur, int count, int total, ArrayList<String> res) {
        Scanner sc = new Scanner(System.in); 
        int eventTemp = eventNum - 1; // event temp number since we start counting at 0 in the arraylist of events
        int ans = 0; // for users answer
        boolean loop = true;  // for while loop 
        if(count == 6) {  // when user has reached the max amount of tickets (6) for a transaction
            loop = false;  // set while loop to false 
            invoice(customers, id, transactionNum, count, total, res);
            mainMenu(events, customers, id, transactionNum, res);
        }
        while(loop) {
            try {
                System.out.println("Event: "+ events.get(eventTemp).getname()); // display event and ticket prices 
                events.get(eventTemp).printPrices();
                System.out.println("6. To exit"); 
                System.out.println("Which ticket would you like to purchase?");
                ans = sc.nextInt();
                if(ans < 1 || ans > 6) { // user enters a number below 1 or above 6
                    System.out.println("Please pick between 1 - 6");
                    startTransaction(events, customers, id, transactionNum, eventNum, vipPur, goldPur, silPur, bronPur, genPur, count, total, res);
                }
                if(ans == 6) { // user wants to quit and have purchased a ticket 
                    if(count > 0) {
                        invoice(customers, id, transactionNum, count, total, res);
                        mainMenu(events, customers, id, transactionNum, res);
                    }
                    else { // user wants to quit and has not purchased anything
                        mainMenu(events, customers, id, transactionNum, res);
                    }
                }
                break;
            } catch (InputMismatchException e) { // input mismatch exception for if user does not enter integer 
                System.out.println("Please enter an integer between 1 - 6!");
                startTransaction(events, customers, id, transactionNum, eventNum, vipPur, goldPur, silPur, bronPur, genPur, count, total, res);
            } 
        }
        switch(ans) { // switch case for each ticket type 
            case 1: // VIP ticket
                if(vipPur == true) { // user has already purchased a vip ticket
                    System.out.println("You cannot make another VIP ticket purchase for this transaction");
                    System.out.println("----------------------------------------");
                    startTransaction(events, customers, id, transactionNum, eventNum, vipPur, goldPur, silPur, bronPur, genPur, count, total, res);
                }
                else if(events.get(eventTemp).getNumOfVS() == 0) { // for no seats available 
                    System.out.println("No seat available for this ticket type. Sorry!");
                    startTransaction(events, customers, id, transactionNum, eventNum, vipPur, goldPur, silPur, bronPur, genPur, count, total, res);
                }
                else if(customers.get(id).getMoneyAvailable() > events.get(eventTemp).getVipPrice() && events.get(eventTemp).getNumOfVS() > 0) { // user has enough money and seats are available
                    customers.get(id).purchase(events.get(eventTemp).getVipPrice()); // purchase ticket
                    count++; // increase count of tickets
                    vipPur = true; // set purchase to true
                    total += events.get(eventTemp).getVipPrice();  // add to total 
                    events.get(eventTemp).setNumOfVS(events.get(eventTemp).getNumOfVS() - 1); // decrease available seats by 1 
                    res.add("Purchased VIP ticket for " + events.get(eventTemp).getname()); // log action 
                    events.get(eventTemp).setPurchasedTickets("1 VIP Ticket Purchased"); // add which ticket was purchased to the event 
                    startTransaction(events, customers, id, transactionNum, eventNum, vipPur, goldPur, silPur, bronPur, genPur, count, total, res);
                }
                else{ // user does not have enought money 
                    System.out.println("You do not have enough money!");
                    startTransaction(events, customers, id, transactionNum, eventNum, vipPur, goldPur, silPur, bronPur, genPur, count, total, res);
                }
                break; 
            case 2: // Gold ticket
                if(goldPur == true) { // user has already purchased a gold ticket
                    System.out.println("You cannot make another gold ticket purchase for this transaction");
                    System.out.println("----------------------------------------");
                    startTransaction(events, customers, id, transactionNum, eventNum, vipPur, goldPur, silPur, bronPur, genPur, count, total, res);
                }
                else if(events.get(eventTemp).getNumOfGS() == 0) { // for no seats available 
                    System.out.println("No seat available for this ticket type. Sorry!");
                    startTransaction(events, customers, id, transactionNum, eventNum, vipPur, goldPur, silPur, bronPur, genPur, count, total, res);
                }
                else if(customers.get(id).getMoneyAvailable() > events.get(eventTemp).getGoldPrice() && events.get(eventTemp).getNumOfGS() > 0) { // user has enough money and seats are available
                    customers.get(id).purchase(events.get(eventTemp).getGoldPrice()); // purchase ticket
                    count++; // increase count of tickets
                    goldPur = true; // set pruchase to true
                    total += events.get(eventTemp).getGoldPrice(); // add to total
                    events.get(eventTemp).setNumOfGS(events.get(eventTemp).getNumOfGS() - 1); // decrease available seats by 1
                    res.add("Purchased gold ticket for " + events.get(eventTemp).getname()); // log action
                    events.get(eventTemp).setPurchasedTickets("1 Gold Ticket Purchased"); // add which ticket was purchased to the event 
                    startTransaction(events, customers, id, transactionNum, eventNum, vipPur, goldPur, silPur, bronPur, genPur, count, total, res);
                }
                else{ // user does not have enought money 
                    System.out.println("You do not have enough money!");
                    startTransaction(events, customers, id, transactionNum, eventNum, vipPur, goldPur, silPur, bronPur, genPur, count, total, res);
                }
                break;
            case 3: // Silver ticket
                if(silPur == true) { // user has already purchased a silver ticket
                    System.out.println("You cannot make another silver ticket purchase for this transaction");
                    System.out.println("----------------------------------------");
                    startTransaction(events, customers, id, transactionNum, eventNum, vipPur, goldPur, silPur, bronPur, genPur, count, total, res);
                }
                else if(events.get(eventTemp).getNumOfSS() == 0) { // for no seats available 
                    System.out.println("No seat available for this ticket type. Sorry!");
                    startTransaction(events, customers, id, transactionNum, eventNum, vipPur, goldPur, silPur, bronPur, genPur, count, total, res);
                }
                else if(customers.get(id).getMoneyAvailable() > events.get(eventTemp).getSilverPrice() && events.get(eventTemp).getNumOfSS() > 0) { // user has enough money and seats are available
                    customers.get(id).purchase(events.get(eventTemp).getSilverPrice()); // purchase ticket
                    count++; // increase count of tickets
                    silPur = true; // set purchase to true 
                    total += events.get(eventTemp).getSilverPrice(); // add to total  
                    events.get(eventTemp).setNumOfGS(events.get(eventTemp).getNumOfGS() - 1); // decrease available seats by 1 
                    res.add("Purchased silver ticket for " + events.get(eventTemp).getname()); // log action 
                    events.get(eventTemp).setPurchasedTickets("1 Silver Ticket Purchased"); // add which ticket was purchased to the event 
                    startTransaction(events, customers, id, transactionNum, eventNum, vipPur, goldPur, silPur, bronPur, genPur, count, total, res);
                }
                else{ // user does not have enought money 
                    System.out.println("You do not have enough money!");
                    startTransaction(events, customers, id, transactionNum, eventNum, vipPur, goldPur, silPur, bronPur, genPur, count, total, res);
                }
                break; 
            case 4: // Bronze ticket
                if(bronPur == true) {
                    System.out.println("You cannot make another bronze ticket purchase for this transaction");
                    System.out.println("----------------------------------------");
                    startTransaction(events, customers, id, transactionNum, eventNum, vipPur, goldPur, silPur, bronPur, genPur, count, total, res);
                }
                else if(events.get(eventTemp).getNumOfBS() == 0) { // for no seats available 
                    System.out.println("No seat available for this ticket type. Sorry!");
                    startTransaction(events, customers, id, transactionNum, eventNum, vipPur, goldPur, silPur, bronPur, genPur, count, total, res);
                }
                else if(customers.get(id).getMoneyAvailable() > events.get(eventTemp).getBronzePrice() && events.get(eventTemp).getNumOfBS() > 0) { // user has enough money and seats are available
                    customers.get(id).purchase(events.get(eventTemp).getBronzePrice()); // purchase ticket
                    count++; // increase count of tickets
                    bronPur = true; // set purchase to true 
                    total += events.get(eventTemp).getBronzePrice(); // add to total
                    events.get(eventTemp).setNumOfBS(events.get(eventTemp).getNumOfBS() - 1); // decrease available seats by 1
                    res.add("Purchased bronze ticket for " + events.get(eventTemp).getname()); // log action 
                    events.get(eventTemp).setPurchasedTickets("1 Bronze Ticket Purchased"); // add which ticket was purchased to the event 
                    startTransaction(events, customers, id, transactionNum, eventNum, vipPur, goldPur, silPur, bronPur, genPur, count, total, res);
                }
                else{ // user does not have enought money 
                    System.out.println("You do not have enough money!");
                    startTransaction(events, customers, id, transactionNum, eventNum, vipPur, goldPur, silPur, bronPur, genPur, count, total, res);
                }
                break;
            case 5: // General Admission ticket
                if(genPur == true) {
                    System.out.println("You cannot make another general admission ticket purchase for this transaction");
                    System.out.println("----------------------------------------");
                    startTransaction(events, customers, id, transactionNum, eventNum, vipPur, goldPur, silPur, bronPur, genPur, count, total, res);
                }
                else if(events.get(eventTemp).getNumOfGNS() == 0) { // for no seats available 
                    System.out.println("No seat available for this ticket type. Sorry!");
                    startTransaction(events, customers, id, transactionNum, eventNum, vipPur, goldPur, silPur, bronPur, genPur, count, total, res);
                }
                else if(customers.get(id).getMoneyAvailable() > events.get(eventTemp).getGenAdmPrice() && events.get(eventTemp).getNumOfGNS() > 0) { // user has enough money and seats are available
                    customers.get(id).purchase(events.get(eventTemp).getGenAdmPrice()); // purchase ticket
                    count++; // increase count of tickets
                    genPur = true; // set purchase to true 
                    total += events.get(eventTemp).getGenAdmPrice(); // add to total
                    events.get(eventTemp).setNumOfGNS(events.get(eventTemp).getNumOfGNS() - 1); // decrease available seats by 1
                    res.add("Purchased general addmission ticket for " + events.get(eventTemp).getname()); // log action 
                    events.get(eventTemp).setPurchasedTickets("1 General Admission Ticket Purchased"); // add which ticket was purchased to the event 
                    startTransaction(events, customers, id, transactionNum, eventNum, vipPur, goldPur, silPur, bronPur, genPur, count, total, res);
                }
                else{ // user does not have enought money 
                    System.out.println("You do not have enough money!");
                    startTransaction(events, customers, id, transactionNum, eventNum, vipPur, goldPur, silPur, bronPur, genPur, count, total, res);
                }
                break;
        }
    }

    /**
     * Invoice for customer 
     * @param customers arraylist of customers that contains their information
     * @param id integer that is the id of the indiviudal
     * @param transactionNum integer that keeps track of transaction number
     * @param count integer to keep track of the number of tickets purchased
     * @param total integer to keep track of the total amount 
     * @param res arraylist of the actions that are being logged
     */
    public static void invoice(ArrayList<Customer> customers, int id, int transactionNum, int count, int total, ArrayList<String> res) {
        Invoice invoice = new Invoice(); // create invoice 
        customers.get(id).setInvoice(invoice);
        invoice.setNumOfTickets(count);
        invoice.setTotalPrice(total);
        invoice.setConfirmationNum((int)Math.floor(Math.random() * (9000000 - 10000000 + 1) + 10000000)); // for creating confirmation number
        invoice.printInvoice(); // print invoice
        customers.get(id).setInvoice(invoice); // add invoice to customer
        res.add("^^^^^^^^^^^Transaction " + transactionNum + "^^^^^^^^^^^"); // add action of transaction
        transactionNum++; // increment transaction 
        customers.get(id).setConcertsPurchased(customers.get(id).getConcertsPurchased() + 1); // increment concert purchased
    }

    public static void main(String[] args) {

        String path = "EventListPA2.csv"; // file path
        String line = "";

        try {
            Scanner sc = new Scanner(new File(path));

            ArrayList<Event> events = new ArrayList<Event>(); // initialize data array of object Event
            sc.nextLine(); // skipping over first line of titles

            Factory factory = new Factory();

            while (sc.hasNext()) {
                line = sc.nextLine(); // next line
                String[] arr = line.split(",");
                // setting everything
                switch (arr[1]) {
                    case "Sport": // for sport events
                        Event utepSport = factory.createEvent("Sport");
                        utepSport.setidEvent(Integer.parseInt(arr[0]));
                        utepSport.setEventType(arr[1]);
                        utepSport.setname(arr[2]);
                        utepSport.setdate(arr[3]);
                        utepSport.settime(arr[4]);
                        utepSport.setVipPrice(Double.parseDouble(arr[5]));
                        utepSport.setGoldPrice(Double.parseDouble(arr[6]));
                        utepSport.setSilverPrice(Double.parseDouble(arr[7]));
                        utepSport.setBronzePrice(Double.parseDouble(arr[8]));
                        utepSport.setGenAdmPrice(Double.parseDouble(arr[9]));
                        Venue temp = makeVenue(arr);
                        utepSport.setVenue(temp);
                        // setting the number of seats available for each ticket
                        utepSport.setNumOfVS(utepSport.getVenue().getAvailCapacity() * (utepSport.getVenue().getVipPct() /  100));
                        utepSport.setNumOfGS(utepSport.getVenue().getAvailCapacity() * (utepSport.getVenue().getGoldPct() / 100));
                        utepSport.setNumOfSS(utepSport.getVenue().getAvailCapacity() * (utepSport.getVenue().getSilverPct() / 100));
                        utepSport.setNumOfBS(utepSport.getVenue().getAvailCapacity() * (utepSport.getVenue().getBronzePct() / 100));
                        utepSport.setNumOfGNS(utepSport.getVenue().getAvailCapacity() * (utepSport.getVenue().getGenAdmPct() / 100));
                        utepSport.setExpectedProfit(((utepSport.getNumOfVS()*utepSport.getVipPrice()) + (utepSport.getNumOfGS()*utepSport.getGoldPrice()) + (utepSport.getNumOfSS()*utepSport.getSilverPrice()) + (utepSport.getNumOfBS()*utepSport.getBronzePrice()) + (utepSport.getNumOfGNS()*utepSport.getGenAdmPrice())) - (utepSport.getVenue().getCost() + utepSport.getVenue().getFireworksCost()));
                        events.add(utepSport);
                        break;
                    case "Concert":   // for concert events
                        Event Concert = factory.createEvent("Concert");
                        Concert.setidEvent(Integer.parseInt(arr[0]));
                        Concert.setEventType(arr[1]);
                        Concert.setname(arr[2]);
                        Concert.setdate(arr[3]);
                        Concert.settime(arr[4]);
                        Concert.setVipPrice(Double.parseDouble(arr[5]));
                        Concert.setGoldPrice(Double.parseDouble(arr[6]));
                        Concert.setSilverPrice(Double.parseDouble(arr[7]));
                        Concert.setBronzePrice(Double.parseDouble(arr[8]));
                        Concert.setGenAdmPrice(Double.parseDouble(arr[9]));
                        temp = makeVenue(arr);
                        Concert.setVenue(temp);
                        // setting the number of seats available for each ticket
                        Concert.setNumOfVS(Concert.getVenue().getAvailCapacity() * (Concert.getVenue().getVipPct() / 100));
                        Concert.setNumOfGS(Concert.getVenue().getAvailCapacity() * (Concert.getVenue().getGoldPct() / 100));
                        Concert.setNumOfSS(Concert.getVenue().getAvailCapacity() * (Concert.getVenue().getSilverPct() / 100));
                        Concert.setNumOfBS(Concert.getVenue().getAvailCapacity() * (Concert.getVenue().getBronzePct() / 100));
                        Concert.setNumOfGNS(Concert.getVenue().getAvailCapacity() * (Concert.getVenue().getGenAdmPct() / 100));
                        Concert.setExpectedProfit(((Concert.getNumOfVS()*Concert.getVipPrice()) + (Concert.getNumOfGS()*Concert.getGoldPrice()) + (Concert.getNumOfSS()*Concert.getSilverPrice()) + (Concert.getNumOfBS()*Concert.getBronzePrice()) + (Concert.getNumOfGNS()*Concert.getGenAdmPrice())) - (Concert.getVenue().getCost() + Concert.getVenue().getFireworksCost()));
                        events.add(Concert);
                        break;
                    case "Festival":   // for festival events
                        Event Festival = factory.createEvent("Festival");
                        Festival.setidEvent(Integer.parseInt(arr[0]));
                        Festival.setEventType(arr[1]);
                        Festival.setname(arr[2]);
                        Festival.setdate(arr[3]);
                        Festival.settime(arr[4]);
                        Festival.setVipPrice(Double.parseDouble(arr[5]));
                        Festival.setGoldPrice(Double.parseDouble(arr[6]));
                        Festival.setSilverPrice(Double.parseDouble(arr[7]));
                        Festival.setBronzePrice(Double.parseDouble(arr[8]));
                        Festival.setGenAdmPrice(Double.parseDouble(arr[9]));
                        temp = makeVenue(arr);
                        Festival.setVenue(temp);
                        // setting the number of seats available for each ticket
                        Festival.setNumOfVS(Festival.getVenue().getAvailCapacity() * (Festival.getVenue().getVipPct() / 100));
                        Festival.setNumOfGS(Festival.getVenue().getAvailCapacity() * (Festival.getVenue().getGoldPct() / 100));
                        Festival.setNumOfSS(Festival.getVenue().getAvailCapacity() * (Festival.getVenue().getSilverPct() / 100));
                        Festival.setNumOfBS(Festival.getVenue().getAvailCapacity() * (Festival.getVenue().getBronzePct() / 100));
                        Festival.setNumOfGNS(Festival.getVenue().getAvailCapacity() * (Festival.getVenue().getGenAdmPct() / 100));
                        Festival.setExpectedProfit(((Festival.getNumOfVS()*Festival.getVipPrice()) + (Festival.getNumOfGS()*Festival.getGoldPrice()) + (Festival.getNumOfSS()*Festival.getSilverPrice()) + (Festival.getNumOfBS()*Festival.getBronzePrice()) + (Festival.getNumOfGNS()*Festival.getGenAdmPrice())) - (Festival.getVenue().getCost() + Festival.getVenue().getFireworksCost()));
                        events.add(Festival);
                        break;
                }
            }

            // setting path for customer list csv file 
            path = "CustomerListPA2.csv";
            line = "";
            sc = new Scanner(new File(path));

            ArrayList<Customer> customers = new ArrayList<Customer>(); // initialize data array of object Customer
            sc.nextLine(); // skipping over first line of titles
            line = sc.nextLine();

            while(sc.hasNext()) {
                String[] arr2 = line.split(",");
                // setting everything
                Customer customer = new Customer(); 
                customer.setCustomerID(Integer.parseInt(arr2[0]));
                customer.setFirstName(arr2[1]);
                customer.setLastName(arr2[2]);
                customer.setMoneyAvailable(Double.parseDouble(arr2[3]));
                customer.setConcertsPurchased(Integer.parseInt(arr2[4]));
                customer.setMembership(Boolean.parseBoolean(arr2[5]));
                customer.setUsername(arr2[6]);
                customer.setPassword(arr2[7]);
                customers.add(customer);
                line = sc.nextLine();
            }

            ArrayList<String> res = new ArrayList<>(); // initializing result arraylist for log file
            identifyUser(events, customers, res);
            File file = new File("Log.txt");
            FileWriter fw = new FileWriter(file); 
            for(int i = 0; i < res.size(); i++) {  // looping through result arraylist to write to log file
                fw.write(res.get(i)+ "\n");
            }
            fw.close();

            ArrayList<String> updatedEventList = new ArrayList<>(); // add new arraylist for information to new event csv file 
            updatedEventList.add(" Event ID,Event Type,Name,Date,Time,VIP Price,Gold Price,Silver Price,Bronze Price,General Admission Price,Venue Name,Pct Seats Unavailable,Venue Type,Capacity,Cost,VIP Pct,Gold Pct,Silver Pct,Bronze Pct,General Admission Pct,Reserved Extra Pct,Fireworks Planned,Fireworks Cost,VIP Seats Sold,Gold Seats Sold,Silver Seats Sold,Bronze Seats Sold,General Admission Seats Sold,Total VIP Revenue,Total Gold Revenue,Total Silver Revenue,Total Bronze Revenue,Total General Admission Revenue"); // adding headers
            for(int i = 0; i < events.size(); i++) { // looping through events and adding information for each part 
                String pt1 = Integer.toString(events.get(i).getidEvent());
                String pt2 = events.get(i).getEventType();
                String pt3 = events.get(i).getname();
                String pt4 = events.get(i).getdate();
                String pt5 = events.get(i).gettime();
                String pt6 = Double.toString(events.get(i).getVipPrice());
                String pt7 = Double.toString(events.get(i).getGoldPrice());
                String pt8 = Double.toString(events.get(i).getSilverPrice());
                String pt9 = Double.toString(events.get(i).getBronzePrice());
                String pt10 = Double.toString(events.get(i).getGenAdmPrice());
                String pt11 = events.get(i).getVenue().getVenueName();
                String pt12 = Integer.toString(events.get(i).getVenue().getPctSeatsUA());
                String pt13 = events.get(i).getVenue().getVenueType();
                String pt14 = Integer.toString(events.get(i).getVenue().getCapacity());
                String pt15 = Integer.toString(events.get(i).getVenue().getCost());
                String pt16 = Integer.toString((int)events.get(i).getVenue().getVipPct());
                String pt17 = Integer.toString((int)events.get(i).getVenue().getGoldPct());
                String pt18 = Integer.toString((int)events.get(i).getVenue().getSilverPct());
                String pt19 = Integer.toString((int)events.get(i).getVenue().getBronzePct());
                String pt20 = Integer.toString((int)events.get(i).getVenue().getGenAdmPct());
                String pt21 = Integer.toString((int)events.get(i).getVenue().getResExtraPct());
                String pt22 = events.get(i).getVenue().getFireworksPlanned();
                String pt23 = Integer.toString(events.get(i).getVenue().getFireworksCost());
                String pt24 = Integer.toString(events.get(i).getVipSold());
                String pt25 = Integer.toString(events.get(i).getGoldSold());
                String pt26 = Integer.toString(events.get(i).getSilverSold());
                String pt27 = Integer.toString(events.get(i).getBronzeSold());
                String pt28 = Integer.toString(events.get(i).getGenAdmSold());
                String pt29 = Double.toString(events.get(i).getVipSold() * events.get(i).getVipPrice());
                String pt30 = Double.toString(events.get(i).getGoldSold() * events.get(i).getGoldPrice());
                String pt31 = Double.toString(events.get(i).getSilverSold() * events.get(i).getSilverPrice());
                String pt32 = Double.toString(events.get(i).getBronzeSold() * events.get(i).getBronzePrice());
                String pt33 = Double.toString(events.get(i).getGenAdmSold() * events.get(i).getGenAdmPrice());
                updatedEventList.add(pt1+","+pt2+","+pt3+","+pt4+","+pt5+","+pt6+","+pt7+","+pt8+","+pt9+","+pt10+","+pt11+","+pt12+","+pt13+","+pt14+","+pt15+","+pt16+","+pt17+","+pt18+","+pt19+","+pt20+","+pt21+","+pt22+","+pt23+","+pt24+","+pt25+","+pt26+","+pt27+","+pt28+","+pt29+","+pt30+","+pt31+","+pt32+","+pt33);  // putting all together 
            }
            file = new File("Updated Event Sheet.csv");  // updating file path 
            FileWriter csvw = new FileWriter(file);  
            for(int i = 0; i < updatedEventList.size(); i++){  // loop adding each line of new updated event list to the csv file 
                csvw.write(updatedEventList.get(i) + "\n");
            }
            csvw.close();

            ArrayList<String> updatedCustomerList = new ArrayList<>(); // add new arraylist for information to new customer csv file 
            updatedCustomerList.add("ID,First Name,Last Name,Money Available,Concerts Purchased,TicketMiner Membership,Username,Password"); // adding headers
            for(int i = 0; i < customers.size(); i++) {  // looping through customers and adding information for each part 
                String pt1 = Integer.toString(customers.get(i).getCustomerID());
                String pt2 = customers.get(i).getFirstName();
                String pt3 = customers.get(i).getLastName();
                String pt4 = String.format("%.2f",customers.get(i).getMoneyAvailable());
                String pt5 = Integer.toString(customers.get(i).getConcertsPurchased());
                String pt6 = Boolean.toString(customers.get(i).getMembership());
                String pt7 = customers.get(i).getUsername();
                String pt8 = customers.get(i).getPassword();
                updatedCustomerList.add(pt1 + "," + pt2 + "," + pt3 + "," + pt4 + "," + pt5 + "," + pt6 + "," + pt7 + "," + pt8); // putting all together
            }
            file = new File("Updated Customer Sheet.csv"); // updating file path 
            csvw = new FileWriter(file);
            for(int i = 0; i < updatedCustomerList.size(); i++){  // loop adding each line of new updated customer list to the csv file 
                csvw.write(updatedCustomerList.get(i) + "\n"); 
            }
            csvw.close();


            // if there was an error i wanted to see where it went wrong 
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception Error");
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {               
            System.out.println("Array Index Out of Bounds Exception Error");
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found Exception Error");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IO Exception Error");
            e.printStackTrace();
        }

    }

}
