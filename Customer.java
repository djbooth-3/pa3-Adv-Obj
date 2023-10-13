
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
     */
    private int id;
    private String fName;
    private String lName;
    private double availableMoney;
    private boolean ticketMinerMemb;
    private String userName;
    private String passWord;
    private ArrayList<String> numOfPurchasedEvents = new ArrayList<String>();
    private ArrayList<VipT> vipTickets = new ArrayList<VipT>();
    private ArrayList<GoldT> goldTickets = new ArrayList<GoldT>();
    private ArrayList<SilverT> silverTickets = new ArrayList<SilverT>();
    private ArrayList<BronzeT> bronzeTickets = new ArrayList<BronzeT>();
    private ArrayList<GeneralT> generalTickets = new ArrayList<GeneralT>();
    private ArrayList<GeneralT> resExtraTickets = new ArrayList<GeneralT>();
    private ArrayList<Invoice> customerInvoices = new ArrayList<Invoice>();
    private double saved;

    /**
     * Constructor for a Customer object
     * 
     * @param none
     */
    public Customer() {
    }

    /**
     * Adds VIP tickets to a customer's VIP ticket ArrayList
     * 
     * @param ticketIn
     * @return none
     */
    public void addVIPTicket(VipT ticketIn) {
        vipTickets.add(ticketIn);
    }

    /**
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
     * Adds Gold tickets to a customer's Gold ticket ArrayList
     * 
     * @param ticketIn
     * @return none
     */
    public void addGoldTicket(GoldT ticketIn) {
        goldTickets.add(ticketIn);
    }

    /**
     * Adds Silver tickets to a customer's Silver ticket ArrayList
     * 
     * @param ticketIn
     * @return none
     */
    public void addSilverTicket(SilverT ticketIn) {
        silverTickets.add(ticketIn);
    }

    /**
     * Adds Bronze tickets to a customer's Bronze ticket ArrayList
     * 
     * @param ticketIn
     * @return none
     */
    public void addBronzeTicket(BronzeT ticketIn) {
        bronzeTickets.add(ticketIn);
    }

    /**
     * Adds General Admission tickets to a customer's General Admission ticket ArrayList
     * 
     * @param ticketIn
     * @return none
     */
    public void addGeneralTicket(GeneralT ticketIn) {
        generalTickets.add(ticketIn);
    }

    /**
     * Adds invoices to a customer's Invoice ArrayList
     * 
     * @param invoiceIn
     * @return none
     */
    public void addInvoice(Invoice invoiceIn) {
        customerInvoices.add(invoiceIn);
    }

    /**
     * Prints all of the information of every invoice a customer has, if they have
     * any.
     * 
     * @param none
     * @return none
     */
    public void printInvoices() {
        System.out.println("Invoices: " + customerInvoices.size());
        for (int i = 0; i < customerInvoices.size(); i++) {
            Invoice temp = customerInvoices.get(i);
            System.out.println("Customer Last Name and Event Name: " + temp.getCustomerLastNameandEventName()
                    + ", Confirmation Number: " + temp.getConNum()
                    + ", Type: " + temp.getTicketType() + ", Quantity: " + temp.getTicketQuantity() + ", Total: $"
                    + (Math.floor(temp.getTotal()*100))/100);
        }
    }

    /**
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
        customer.setID(Integer.parseInt(customerInfoRow[customerAtts.searchForIDCol(customers)]));
        customer.setFName(customerInfoRow[customerAtts.searchForFNameCol(customers)]);
        customer.setLName(customerInfoRow[customerAtts.searchForLNameCol(customers)]);
        customer.setAvailableMoney(Double.valueOf(customerInfoRow[customerAtts.searchForMoneyAvailCol(customers)]));
        if (customerInfoRow[customerAtts.searchForMemberCol(customers)].equalsIgnoreCase("TRUE")) {
            customer.setTMMS(true);
        } else {
            customer.setTMMS(false);
        }
        customer.setUserN(customerInfoRow[customerAtts.searchForUNameCol(customers)]);
        customer.setPassW(customerInfoRow[customerAtts.searchForPassWCol(customers)]);

        return customer;
    }

    /**
     * Gets savings due to TM Membership
     * @return
     */
    public double getSaved() {
        return saved;
    }

    /**
     * Sets savings due to TM Membership
     * @param saved
     */
    public void setSaved(double saved) {
        this.saved = saved;
    }

    /**
     * Getter for Customer ID
     * @param none
     * @return this.id
     */
    public int getID() {
        return this.id;
    }

    /**
     * Setter for Customer ID
     * @param id
     * @return none
     */
    public void setID(int id) {
        this.id = id;
    }

    /**
     * Getter for Customer First Name
     * @param none
     * @return this.fName
     */
    public String getFName() {
        return this.fName;
    }

    /**
     * Setter for Customer First Name
     * @param fName
     * @return none
     */
    public void setFName(String fName) {
        this.fName = fName;
    }

    /**
     * Getter for Customer Last Name
     * @param none
     * @return this.lName
     */
    public String getLName() {
        return this.lName;
    }

    /**
     * Setter for Customer Last Name
     * @param lName
     * @return none
     */
    public void setLName(String lName) {
        this.lName = lName;
    }

    /**
     * Getter for Customer balance
     * @param none
     * @return this.availableMoney
     */
    public double getAvailableMoney() {
        return this.availableMoney;
    }

    /**
     * Setter for Customer balance
     * @param availableMoney
     * @return none
     */
    public void setAvailableMoney(double availableMoney) {
        this.availableMoney = availableMoney;
    }

    /**
     * Getter for Customer TM Membership
     * @param none
     * @return this.ticketMinerMeb
     */
    public boolean getTMMS() {
        return this.ticketMinerMemb;
    }

    /**
     * Setter for Customer TM Membership
     * @param ticketMinerMemb
     * @return none
     */
    public void setTMMS(boolean ticketMinerMemb) {
        this.ticketMinerMemb = ticketMinerMemb;
    }

    /**
     * Getter for Customer Username
     * @param none
     * @return this.userName
     */
    public String getUserN() {
        return this.userName;
    }

    /**
     * Setter for Customer Username
     * @param userName
     * @return none
     */
    public void setUserN(String userName) {
        this.userName = userName;
    }

    /**
     * Getter for Customer Password
     * @param none
     * @return this.passWord
     */
    public String getPassW() {
        return this.passWord;
    }

    /**
     * Setter for Customer Password
     * @param passWord
     * @return none
     */
    public void setPassW(String passWord) {
        this.passWord = passWord;
    }

    /**
     * Returns the number of events a Customer has purchased for.
     * @return
     */
    public int getNumOfPurchasedEvents() {
        return this.numOfPurchasedEvents.size();
    }
}