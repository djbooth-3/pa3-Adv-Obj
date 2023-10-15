
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
 * - Venue.java
 * 
 * - The following file defines an abstract "Venue" class and its attributes.  There is also a method for creating
 * a Venue object from a String ArrayList, the data structure that will represent each row of the EventList csv file.
 * 
 * This work was done individually and completely on my own. I did not share, reproduce, or alter any part of this 
 * assignment for any purpose. I did not share code, upload this assignment online in any form, or 
 * view/received/modified code written from anyone else. All deliverables were produced entirely on my own. This 
 * assignment is part of an academic course at The University of Texas at El Paso and a grade will be assigned for 
 * the work I produced.
 * 
 */

import java.util.*;

public abstract class Venue {
    /**
     * These are the attributes for every Venue object, as well as its children.
     * 
     * 
     */
    private String venueName;
    private String venueType;
    private int capacity;
    private double cost;
    private String fireworksPlanned;
    private double fireworksCost;
    private double pctSeatsUA;
    private double vipPct;
    private double goldPct;
    private double silverPct;
    private double bronzePct;
    private double genAdmPct;
    private double resExtraPct;

    /**
     * Venue constructor
     * @param none
     */
    public Venue() {
    }

    /**
     * Getter for venue name
     * @param none
     * @return this.venueName
     */
    public String getVenueName() {
        return this.venueName;
    }

    /**
     * Setter for venue name
     * @return none
     * @param venueName
     */
    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    /**
     * Getter for venue type
     * @param none
     * @return this.venueType
     */
    public String getVenueType() {
        return this.venueType;
    }

    /**
     * Setter for venue type
     * @return none
     * @param venueType
     */
    public void setVenueType(String venueType) {
        this.venueType = venueType;
    }

    /**
     * Getter for venue capacity
     * @param none
     * @return this.capacity
     */
    public int getCapacity() {
        return this.capacity;
    }

    /**
     * Setter for venue capacity
     * @return none
     * @param capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Getter for venue cost
     * @param none
     * @return this.cost
     */
    public double getCost() {
        return this.cost;
    }

    /**
     * Setter for venue cost
     * @return none
     * @param cost
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * Getter for percentage of seats unavailable
     * @param none
     * @return this.pcntOfSeatsUnavailable
     */
    public double getPctSeatsUA() {
        return this.pctSeatsUA;
    }

    /**
     * Setter for percentage of seats unavailable
     * @param pctSeatsUA
     * @return none
     */
    public void setSeatsUA(double pctSeatsUA) {
        this.pctSeatsUA = pctSeatsUA;
    }

    /**
     * Getter for percentage of VIP seats
     * @param none
     * @return this.pcntOfVIP
     */
    public double getVipPct() {
        return this.vipPct;
    }

    /**
     * Setter for percentage of VIP seats
     * @param vipPct
     * @return none
     */
    public void setVipPct(double vipPct) {
        this.vipPct = vipPct;
    }

    /**
     * Getter for percentage of Gold seats
     * @param none
     * @return this.goldPct
     */
    public double getGoldPct() {
        return this.goldPct;
    }

    /**
     * Setter for percentage of Gold seats
     * @param pcntOfGold
     * @return none
     */
    public void setGoldPct(double pcntOfGold) {
        this.goldPct = pcntOfGold;
    }

    /**
     * Getter for percentage of Silver seats
     * @param none
     * @return this.pcntOfSilver
     */
    public double getSilverPct() {
        return this.silverPct;
    }

    /**
     * Setter for percentage of Silver seats
     * @param pcntOfSilver
     * @return none
     */
    public void setSilverPct(double pcntOfSilver) {
        this.silverPct = pcntOfSilver;
    }

    /**
     * Getter for percentage of Bronze seats
     * @param none
     * @return this.pcntOfBronze
     */
    public double getBronzePct() {
        return this.bronzePct;
    }

    /**
     * Setter for percentage of Bronze seats
     * @param pcntOfBronze
     * @return none
     */
    public void setBronzePct(double pcntOfBronze) {
        this.bronzePct = pcntOfBronze;
    }

    /**
     * Getter for percetage of General Admission seats
     * @param none
     * @return this.pcntOfGen
     */
    public double getGenPct() {
        return this.genAdmPct;
    }

    /**
     * Setter for percentage of General Admission seats
     * @param pcntOfGen
     * @return none
     */
    public void setGenPct(double pcntOfGen) {
        this.genAdmPct = pcntOfGen;
    }

    /**
     * Getter for percentage of Reserved Extra seats
     * @param none
     * @return this.pcntOfRes
     */
    public double getResPct() {
        return this.resExtraPct;
    }

    /**
     * Setter for percentage of Reserved Extra seats
     * @param pcntOfRes
     * @return none
     */
    public void setResPct(double pcntOfRes) {
        this.resExtraPct = pcntOfRes;
    }

    /**
     * getting desicion of fireworks plan
     * @return string of the decision
     */
    public String getFireworksPlanned() {
        return this.fireworksPlanned;
    }

    /**
     * setting decision of fireworks plan
     * @param fireworksPlanned string for the decision
     */
    public void setFireworksPlanned(String fireworksPlanned) {
        this.fireworksPlanned = fireworksPlanned;
    }

    /**
     * getting cost of fireworks
     * @return int of cost 
     */
    public double getFireworksCost() {
        return this.fireworksCost;
    }

    /**
     * settting cost of fireworks
     * @param fireworksCost int for cost 
     */
    public void setFireworksCost(double fireworksCost) {
        this.fireworksCost = fireworksCost;
    }

    /**
     * Refactoring was accomplished by Rafael Ayala to adapt to Darien 
     * Booth's implementation for the MakeVenue method
     * 
     * The following method will obtain a Venue object from the string
     * ArrayList that composes the values of the original Event HashMap.
     * 
     * @param events
     * @return eventVenue
     */
    public Venue obtainVenueAttributes(ArrayList<String> events, ArrayList<String>attributes, Venue eventVenue) {

        ColumnAttributes venueAtts = new ColumnAttributes();

        if (attributes.size() < 23){
        } else if (events.get(venueAtts.searchForFireWorksCol(attributes)).equalsIgnoreCase("Yes")) {
            eventVenue.setFireworksPlanned("Yes");
            eventVenue.setFireworksCost(Double.valueOf(events.get(venueAtts.searchForFireWorksCostCol(attributes))));
        } else {
            eventVenue.setFireworksPlanned("No");
            eventVenue.setFireworksCost(0.0);
        }
        eventVenue.setVenueName(events.get(venueAtts.searchForVenueName(attributes)));
        eventVenue.setVenueType(events.get(venueAtts.searchForVenueType(attributes)));
        eventVenue.setCapacity(Integer.parseInt(events.get(venueAtts.searchForCapacity(attributes))));
        eventVenue.setCost(Double.valueOf(events.get(venueAtts.searchForVenueCost(attributes))));
        eventVenue.setSeatsUA(Double.valueOf(events.get(venueAtts.searchForPctSeatsUn(attributes))));
        eventVenue.setVipPct(Double.valueOf(events.get(venueAtts.searchForVIPPctCol(attributes))));
        eventVenue.setGoldPct(Double.valueOf(events.get(venueAtts.searchForGoldPctCol(attributes))));
        eventVenue.setSilverPct(Double.valueOf(events.get(venueAtts.searchForSilverPctCol(attributes))));
        eventVenue.setBronzePct(Double.valueOf(events.get(venueAtts.searchForBronzePctCol(attributes))));
        eventVenue.setGenPct(Double.valueOf(events.get(venueAtts.searchForGeneralPctCol(attributes))));
        eventVenue.setResPct(Double.valueOf(events.get(venueAtts.searchForReservedExtraCol(attributes))));

        return eventVenue;
    }
}