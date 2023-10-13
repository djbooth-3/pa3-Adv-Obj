
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
 *        - LoginPage.java
 * 
 *        - The following file defines a class with a method for processing 
 *        entry information at the start of the run of the TicketMiner 
 *        system.  If the user identifies as a standard user, they will need
 *        to login, and the respective Customer information will be returned.
 *        otherwise, if the user identifies as an administrator, they will
 *        be redirected to an administrator interface.
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
import java.io.*;

public class LoginPage {

    /**
     * Constructor for LoginPage
     */
    public LoginPage() {
    }

    /**
     * Checks that the information on a customer is correct
     * @param customerList arraylist of customers that contains their information
     * @param s string containing what needs to be checked
     * @param n integer that is the id of the individual 
     * @return returns true or false if information is present or correct
     */
    public static boolean infoCheck(ArrayList<Customer> customerList, String info, int id) {
        if(info.equals(customerList.get(id).getLName())) { // checks last name is correct
            return true; 
        }
        else if(info.equals(customerList.get(id).getUserN())) { // checks username is correct
            return true; 
        }
        else if(info.equals(customerList.get(id).getPassW())) { // checks password is correct 
            return true; 
        }
        return false; 
    }

    /**
     * The following method will run at the start of the run of the system.  If the user
     * identifies as a standard user,  the user logs in and, if their information is valid, the respective
     * customer information will be returned.  Otherwise, if they identify as an administrator,
     * they will be redirected to an administrator interface.
     * @param customerList
     * @param sportMap
     * @param concertMap
     * @param festivalMap
     * @return
     */
    public Customer userLoginInterface(ArrayList<Customer> customerList, HashMap<String, Sport> sportMap,
            HashMap<String, Concert> concertMap, HashMap<String, Festival> festivalMap) {

        // The user will be pitted against various conditions to ensure their
        // credentials are valid. First, they will be asked for their first name, then
        // their last name, then their username, and lastly, their password. For every
        // credential test, the customer can keep on trying until they get it right.

        System.out.println(
                "Welcome to TicketMiner! Press 'ENTER' to continue, or type 'EXIT' if you no longer want to participate.");

        String firstInput = System.console().readLine();
        WriteToFile updatedSheet = new WriteToFile();

        if (firstInput.equalsIgnoreCase("EXIT")) {
            updatedSheet.writeNewEventList(concertMap, sportMap, festivalMap);
            updatedSheet.writeNewCustomerList(customerList);
            System.exit(0);
        }

        boolean validUserChoice = false;
        while (!validUserChoice) {

            System.out.println(
                    "====================================================================================================");
            System.out.println("Main Menu");
            System.out.println(
                    "Do you identify as a customer or an administrator?  Select the number corresponding to your choice. Or just type 'EXIT' to exit.");
            System.out.println("1. Customer");
            System.out.println("2. Admin");
            System.out.println(
                    "====================================================================================================");
            String userChoice = System.console().readLine();
            if (userChoice.equals("1")) {
                validUserChoice = true;
                break;
            } else if (userChoice.equals("2")) {
                AdminInterface admin = new AdminInterface();
                admin.adminInterface(sportMap, concertMap, festivalMap);
            } else if (userChoice.equalsIgnoreCase("EXIT")) {
                updatedSheet.writeNewEventList(concertMap, sportMap, festivalMap);
                updatedSheet.writeNewCustomerList(customerList);
                System.exit(0);
            }
            if (!validUserChoice) {
                continue;
            }
        }

        Customer customer = new Customer();
        int state = 0; 
        int id = 0; 

        boolean loop = true; // too keep loop for switch statement
        while(loop) {
            switch(state) {
                case 0: // first name 
                    System.out.println("Please enter your first name:");
                    String fn = System.console().readLine(); 
                    for(int x = 0; x < customerList.size(); x++) {
                        if(fn.equals(customerList.get(x).getFName())) {
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
                    String ln = System.console().readLine();
                    if(!infoCheck(customerList, ln, id)) {
                        System.out.println("Last name not found! Please try again."); // last name is not found
                        break; 
                    }
                    state = 2; // transition to next state if correct
                    break;
                case 2: // username
                    System.out.println("Please enter your username:");
                    String usr = System.console().readLine();
                    if(!infoCheck(customerList, usr, id)) {
                        System.out.println("Username Incorrect! Please try again."); // username is incorrect
                        break; 
                    }
                    state = 3;
                    break; // transition to next state if correct
                case 3: // password
                    System.out.println("Please enter your password:");
                    String pas = System.console().readLine();
                    if(!infoCheck(customerList, pas, id)) {
                        System.out.println("Password Incorrect! Please try again."); // password is incorrect
                        break; 
                    }
                    loop = false; // everything is correctly answered so stop loop and move on
                    break; // exit 
                }
            }
            // Darien's res.add 
            //res.add(customers.get(id).getFirstName() + " " + customers.get(id).getLastName() + " has logged in."); // add action of who logged in\
            customer = customerList.get(id); 
            return customer;
        }

}
