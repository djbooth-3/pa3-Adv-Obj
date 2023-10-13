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
 *        - TicketMinerSingleton.java
 * 
 *        - The following file defines a singleton for the TicketMiner system,
 *        consisting of a Sport HashMap, a Concert HashMap, a Festival HashMap,
 *        and a Customer ArrayList.  The purpose is to maintain consist information
 *        for all events and customers for each instance that the system runs.
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

import java.util.*;

public class TicketMinerSingleton {

    private static TicketMinerSingleton obj;

    /**
     * These are the attributes for the TicketMinerSingleton.
     */
    private ArrayList<Customer> customerList;
    private HashMap<String, Sport>sportMap;
    private HashMap<String, Concert>concertMap;
    private HashMap<String, Festival>festivalMap;

    private TicketMinerSingleton(){}

    /**
     * For each instance that the system runs, there will be only one instance
     * of the Events and Customers being utilized, throughout.  In other words,
     * all information for the sportMap, concertMap, festivalMap, and
     * customerList will remain consistent in the lifespan of the program.
     * @return
     */
    public static synchronized TicketMinerSingleton getInstance(){

        if(obj==null){
            obj = new TicketMinerSingleton();
        }
        return obj;
    }

    /**
     * Getter for singleton instance of Sport HashMap
     * @return
     */
    public HashMap<String, Sport> getSportMap() {
        return sportMap;
    }

    /**
     * Setter for singleton instance of Sport HashMap
     * @param sportMap
     */
    public void setSportMap(HashMap<String, Sport> sportMap) {
        this.sportMap = sportMap;
    }

    /**
     * Getter for singleton instance of Concert HashMap
     * @return
     */
    public HashMap<String, Concert> getConcertMap() {
        return concertMap;
    }

    /**
     * Setter for singleton instance of Concert HashMap
     * @param concertMap
     */
    public void setConcertMap(HashMap<String, Concert> concertMap) {
        this.concertMap = concertMap;
    }

    /**
     * Getter for singleton instance of Festival HashMap
     * @return
     */
    public HashMap<String, Festival> getFestivalMap() {
        return festivalMap;
    }

    /**
     * Setter for singleton instance of Festival HashMap
     * @param festivalMap
     */
    public void setFestivalMap(HashMap<String, Festival> festivalMap) {
        this.festivalMap = festivalMap;
    }

    /**
     * Getter for singleton instance of Customer ArrayList
     * @return
     */
    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    /**
     * Setter for singleton instance of Customer ArrayList
     * @param customerList
     */
    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
   
}