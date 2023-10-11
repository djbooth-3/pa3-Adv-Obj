
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

        boolean customerExists = false;
        Customer customer = new Customer();

        while (!customerExists) {
            // Prompt the user to enter their first name
            System.out.print(
                    "Please enter your first name, then hit 'ENTER'.\nEnter your last name, then hit 'ENTER'.\nEnter your username, then hit 'ENTER'.\nLastly, enter your password, then hit 'ENTER'.\nPlease do so in that order.");
            System.out.println();
            String fnInput = System.console().readLine();
            String lnInput = System.console().readLine();
            String unInput = System.console().readLine();
            String pwInput = System.console().readLine();

            // Check if all entered values exist in the ArrayList
            for (int i = 0; i < customerList.size(); i++) {
                String firstName = customerList.get(i).getFName();
                String lastName = customerList.get(i).getLName();
                String userName = customerList.get(i).getUserN();
                String passWord = customerList.get(i).getPassW();
                if (fnInput.equalsIgnoreCase(firstName) && lnInput.equalsIgnoreCase(lastName)
                        && unInput.equals(userName) && pwInput.equals(passWord)) {

                    // By this point, we have all the information to obtain the Customer object to
                    // work with.
                    customer = customerList.get(i);

                    customerExists = true;
                    break;
                }
            }

            if (!customerExists) {
                System.out.println("Try again: ");
            }
        }

        return customer;

    }

}
