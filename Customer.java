
/**
 * @author Rafael Ayala, Darien Booth
 * 
 * @since October 5, 2023
 * 
 * - CS 3331 - Advanced Object-Oriented Programming
 * 
 * - Dr. Daniel Mejia
 * 
 * - Programming Assignment 2
 * 
 * - Customer.java
 * 
 * - The following file defines a "Customer" class and its attributes.  There will also be collection 
 * structures (ArrayLists) to collect and store items for users, those items being the customer's invoices and tickets.
 * There are additional methods to manipulate and obtain values from these structures.
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

public class Customer {

    /**
     * These are the attributes for every customer object
     * The following attributes were implemented by Darien Booth,
     * as well as their getters and setters.
     */
    private int customerID;
    private String firstName;
    private String lastName;
    private double moneyAvailable;
    private boolean membership;
    private String username;
    private String password;
    private ArrayList<Invoice> invoice = new ArrayList<Invoice>();
    /**
     * The following methods were implemented by Rafael Ayala,
     * as well as their getters and setters.
     */
    private ArrayList<String> numOfPurchasedEvents = new ArrayList<String>();
    private ArrayList<VipT> vipTickets = new ArrayList<VipT>();
    private ArrayList<GoldT> goldTickets = new ArrayList<GoldT>();
    private ArrayList<SilverT> silverTickets = new ArrayList<SilverT>();
    private ArrayList<BronzeT> bronzeTickets = new ArrayList<BronzeT>();
    private ArrayList<GeneralT> generalTickets = new ArrayList<GeneralT>();
    private ArrayList<GeneralT> resExtraTickets = new ArrayList<GeneralT>();
    private double saved;

    /**
     * Creator: Rafael Ayala
     * Constructor for a Customer object
     * 
     * @param none
     */
    public Customer() {
    }

    /**
     * Creator: Rafael Ayala
     * Adds VIP tickets to a customer's VIP ticket ArrayList
     * 
     * @param ticketIn
     * @return none
     */
    public void addVIPTicket(VipT ticketIn) {
        vipTickets.add(ticketIn);
    }

    /**
     * Creator: Rafael Ayala
     * Adds Events to a Customer's account; ArrayList of Customer events.
     * 
     * @param mapKey
     */
    public void addEvent(String mapKey) {
        if (!(numOfPurchasedEvents.contains(mapKey))) {
            numOfPurchasedEvents.add(mapKey);
        }
    }

    /**
     * Creator: Rafael Ayala
     * Adds Gold tickets to a customer's Gold ticket ArrayList
     * 
     * @param ticketIn
     * @return none
     */
    public void addGoldTicket(GoldT ticketIn) {
        goldTickets.add(ticketIn);
    }

    /**
     * Creator: Rafael Ayala
     * Adds Silver tickets to a customer's Silver ticket ArrayList
     * 
     * @param ticketIn
     * @return none
     */
    public void addSilverTicket(SilverT ticketIn) {
        silverTickets.add(ticketIn);
    }

    /**
     * Creator: Rafael Ayala
     * Adds Bronze tickets to a customer's Bronze ticket ArrayList
     * 
     * @param ticketIn
     * @return none
     */
    public void addBronzeTicket(BronzeT ticketIn) {
        bronzeTickets.add(ticketIn);
    }

    /**
     * Creator: Rafael Ayala
     * Adds General Admission tickets to a customer's General Admission ticket ArrayList
     * 
     * @param ticketIn
     * @return none
     */
    public void addGeneralTicket(GeneralT ticketIn) {
        generalTickets.add(ticketIn);
    }

    /**
     * Creator: Darien Booth
     * Adds invoices to a customer's Invoice ArrayList
     * 
     * @param invoice
     * @return none
     */
    public void setInvoice(Invoice invoice) {
        invoice.add(invoice);
    }

    /**
     * Creator: Rafael Ayala
     * 
     * Prints all of the information of every invoice a customer has, if they have
     * any.
     * 
     * @param none
     * @return none
     */
    public void printInvoices() {
        System.out.println("Invoices: " + invoice.size());
        for (int i = 0; i < invoice.size(); i++) {
            Invoice temp = invoice.get(i);
            System.out.println("Customer Last Name and Event Name: " + temp.getCustomerLastNameandEventName()
                    + ", Confirmation Number: " + temp.getConfirmationNum()
                    + ", Type: " + temp.getTicketType() + ", Quantity: " + temp.getNumOfTickets() + ", Total: $"
                    + (Math.floor(temp.getTotalPrice()*100))/100);
        }
    }

    /**
     * Creator: Rafael Ayala
     * 
     * The following method simply prints the number of tickets of each type that a
     * customer has and the
     * information of each ticket.
     * 
     * @param none
     * @return none
     */
    public void printTicketList() {

        System.out.println("VIP Tickets: " + vipTickets.size());
        if (1 <= vipTickets.size()) {
            for (int i = 0; i < vipTickets.size(); i++) {
                VipT temp = vipTickets.get(i);
                System.out.println("ID and Name: " + temp.getId() + ", Price: " + temp.getTicketPrice());
            }
        }
        System.out.println();
        System.out.println("Gold Tickets: " + goldTickets.size());
        if (1 <= goldTickets.size()) {
            for (int i = 0; i < goldTickets.size(); i++) {
                GoldT temp = goldTickets.get(i);
                System.out.println("ID and Name: " + temp.getId() + ", Price: " + temp.getTicketPrice());
            }
        }
        System.out.println();
        System.out.println("Silver Tickets: " + silverTickets.size());
        if (1 <= silverTickets.size()) {
            for (int i = 0; i < silverTickets.size(); i++) {
                SilverT temp = silverTickets.get(i);
                System.out.println("ID and Name: " + temp.getId() + ", Price: " + temp.getTicketPrice());
            }
        }
        System.out.println();
        System.out.println("Bronze Tickets: " + bronzeTickets.size());
        if (1 <= bronzeTickets.size()) {
            for (int i = 0; i < bronzeTickets.size(); i++) {
                BronzeT temp = bronzeTickets.get(i);
                System.out.println("ID and Name: " + temp.getId() + ", Price: " + temp.getTicketPrice());
            }
        }
        System.out.println();
        System.out.println("General Tickets: " + generalTickets.size());
        if (1 <= generalTickets.size()) {
            for (int i = 0; i < generalTickets.size(); i++) {
                GeneralT temp = generalTickets.get(i);
                System.out.println("ID and Name: " + temp.getId() + ", Price: " + temp.getTicketPrice());
            }
        }
        System.out.println();
        System.out.println("Reserved Extra Tickets: " + resExtraTickets.size());
        if (1 <= resExtraTickets.size()) {
            for (int i = 0; i < resExtraTickets.size(); i++) {
                GeneralT temp = resExtraTickets.get(i);
                System.out.println("ID and Name: " + temp.getId() + ", Price: " + temp.getTicketPrice());
            }
        }
    }

    /**
     * Creator: Rafael Ayala
     * The following method will take the 2D array obtained from the customer list
     * csv file and convert each row into a "Customer" object.
     * 
     * @param customers
     * @return customer
     */
    public Customer generateCustomer(String[][] customers, int i) {

        Customer customer = new Customer();
        ColumnAttributes customerAtts = new ColumnAttributes();

        String[] customerInfoRow = customers[i];
        customer.setCustomerID(Integer.parseInt(customerInfoRow[customerAtts.searchForIDCol(customers)]));
        customer.setFirstName(customerInfoRow[customerAtts.searchForFNameCol(customers)]);
        customer.setLastName(customerInfoRow[customerAtts.searchForLNameCol(customers)]);
        customer.setMoneyAvailable(Double.valueOf(customerInfoRow[customerAtts.searchForMoneyAvailCol(customers)]));
        if (customerInfoRow[customerAtts.searchForMemberCol(customers)].equalsIgnoreCase("TRUE")) {
            customer.setMembership(true);
        } else {
            customer.setMembership(false);
        }
        customer.setUsername(customerInfoRow[customerAtts.searchForUNameCol(customers)]);
        customer.setPassword(customerInfoRow[customerAtts.searchForPassWCol(customers)]);

        return customer;
    }

    /**
     * Creator: Rafael Ayala
     * Gets savings due to TM Membership
     * @return
     */
    public double getSaved() {
        return saved;
    }

    /**
     * Creator: Rafael Ayala
     * Sets savings due to TM Membership
     * @param saved
     */
    public void setSaved(double saved) {
        this.saved = saved;
    }

    /**
     * Creator: Darien Booth
     * Getter for Customer ID
     * @param none
     * @return this.id
     */
    public int getCustomerID() {
        return this.customerID;
    }

    /**
     * Creator: Darien Booth
     * Setter for Customer ID
     * @param customerID
     * @return none
     */
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    /**
     * Creator: Darien Booth
     * Getter for Customer First Name
     * @param none
     * @return this.firstName
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Creator: Darien Booth
     * Setter for Customer First Name
     * @param firstName
     * @return none
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Creator: Darien Booth
     * Getter for Customer Last Name
     * @param none
     * @return this.lName
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Creator: Darien Booth
     * Setter for Customer Last Name
     * @param lastName
     * @return none
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Creator: Darien Booth
     * Getter for Customer balance
     * @param none
     * @return this.availableMoney
     */
    public double getMoneyAvailable() {
        return this.moneyAvailable;
    }

    /**
     * Creator: Darien Booth
     * Setter for Customer balance
     * @param availableMoney
     * @return none
     */
    public void setMoneyAvailable(double availableMoney) {
        this.moneyAvailable = availableMoney;
    }

    /**
     * Creator: Darien Booth
     * Getter for Customer TM Membership
     * @param none
     * @return this.membership
     */
    public boolean getMembership() {
        return this.membership;
    }

    /**
     * Creator: Darien Booth
     * Setter for Customer TM Membership
     * @param membership
     * @return none
     */
    public void setMembership(boolean membership) {
        this.membership = membership;
    }

    /**
     * Creator: Darien Booth
     * Getter for Customer Username
     * @param none
     * @return this.userName
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Creator: Darien Booth
     * Setter for Customer Username
     * @param username
     * @return none
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Creator: Darien Booth
     * Getter for Customer Password
     * @param none
     * @return this.passsord
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Creator: Darien Booth
     * Setter for Customer Password
     * @param password
     * @return none
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Creator: Rafael Ayala
     * Returns the number of events a Customer has purchased for.
     * @return
     */
    public int getNumOfPurchasedEvents() {
        return this.numOfPurchasedEvents.size();
    }
}