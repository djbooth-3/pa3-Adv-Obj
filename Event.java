
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
 * - Event.java
 * 
 * - The following file creates an abstract "Event" class with attributes that more specialized "Event" classes can
 * inherit from, as well as some additional methods.
 * 
 * This work was done individually and completely on my own. I did not share, reproduce, or alter any part of this 
 * assignment for any purpose. I did not share code, upload this assignment online in any form, or 
 * view/received/modified code written from anyone else. All deliverables were produced entirely on my own. This 
 * assignment is part of an academic course at The University of Texas at El Paso and a grade will be assigned for 
 * the work I produced.
 * 
 */

import java.util.*;
import java.text.*;
import java.lang.*;

public abstract class Event {
    /**
     * These are the attributes for every Event object, as well as its children.
     * 
     * The following attributes were implemented by Darien Booth, as well as their
     * setters and getters.
     */
    private String name;
    private String date;
    private String time;
    private int idEvent;
    private String eventType;
    private Venue venue;
    private double vipPrice;
    private double goldPrice;
    private double silverPrice;
    private double bronzePrice;
    private double genAdmPrice;

    /**
     * The following attributes were implemented by Rafael Ayala, as well as their
     * setters and getters.
     */
    private double taxCharged;
    private double vipRev;
    private double goldRev;
    private double silverRev;
    private double bronzeRev;
    private double genRev;
    private ArrayList<VipT> vipTicketsPurchased = new ArrayList<VipT>();
    private ArrayList<GoldT> goldTicketsPurchased = new ArrayList<GoldT>();
    private ArrayList<SilverT> silverTicketsPurchased = new ArrayList<SilverT>();
    private ArrayList<BronzeT> bronzeTicketsPurchased = new ArrayList<BronzeT>();
    private ArrayList<GeneralT> generalTicketsPurchased = new ArrayList<GeneralT>();
    private double discounted;

    /**
     * Constructor for Event
     * @param none
     */
    public Event() {
    }

    /**
     * Will return the number of VIP tickets sold for an event
     * @return
     */
    public int getSoldVip(){
        return this.vipTicketsPurchased.size();
    }

    /**
     * Will return the number of Gold tickets sold for an event
     * @return
     */
    public int getSoldGold(){
        return this.goldTicketsPurchased.size();
    }

    /**
     * Will return the number of Silver tickets sold for an event
     * @return
     */
    public int getSoldSilver(){
        return this.silverTicketsPurchased.size();
    }

    /**
     * Will return the number of Bronze tickets sold for an event
     * @return
     */
    public int getSoldBronze(){
        return this.bronzeTicketsPurchased.size();
    }

    /**
     * Will return the number of General Admission tickets sold for an event
     * @return
     */
    public int getSoldGen(){
        return this.generalTicketsPurchased.size();
    }

    /**
     * Will return the total number of every type of ticket sold for an event.
     * @return
     */
    public int getTotalSold(){
        return this.getSoldVip() + this.getSoldGold() + this.getSoldSilver() + this.getSoldBronze() + this.getSoldGen();
    }

    /**
     * Will add a VIP ticket to an event's collection of sold VIP tickets.
     * @param vipIn
     * @return none
     */
    public void addVip(VipT vipIn) {
        vipTicketsPurchased.add(vipIn);
    }

    /**
     * Will add a Gold ticket to an event's collection of sold Gold tickets.
     * @param vipIn
     * @return none
     */
    public void addGold(GoldT goldIn) {
        goldTicketsPurchased.add(goldIn);
    }

    /**
     * Will add a Silver ticket to an event's collection of sold Silver tickets.
     * @param vipIn
     * @return none
     */
    public void addSilver(SilverT silverIn) {
        silverTicketsPurchased.add(silverIn);
    }

    /**
     * Will add a Bronze ticket to an event's collection of sold Bronze tickets.
     * @param vipIn
     * @return none
     */
    public void addBronze(BronzeT bronzeIn) {
        bronzeTicketsPurchased.add(bronzeIn);
    }

    /**
     * Will add a General Admission ticket to an event's collection of sold General Admission tickets.
     * @param vipIn
     * @return none
     */
    public void addGeneral(GeneralT genIn) {
        generalTicketsPurchased.add(genIn);
    }

    /**
     * Gets the total tax charged for an event
     * @return
     */
    public double getTaxCharged() {
        return taxCharged;
    }

    /**
     * Sets the total tax charged for an event
     * @param taxCharged
     */
    public void setTaxCharged(double taxCharged) {
        this.taxCharged = taxCharged;
    }

    /**
     * Will return the Venue corresponding to an event.
     * @param none
     * @return this.venue
     */
    public Venue getVenue() {
        return this.venue;
    }

    /**
     * Will create Venue object corresponding to an event.
     * @param venue
     * @return none
     */
    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    /**
     * Getter for Event Name
     * @param none
     * @return this.eventName
     */
    public String getname() {
        return this.name;
    }
    /**
     * Setter for Event Name
     * @param name
     * @return none
     */
    public void setname(String name) {
        this.name = name;
    }

    /**
     * Getter for Event Date
     * @param none
     * @return this.eventDate
     */
    public String getdate() {
        return this.date;
    }

    /**
     * Setter for Event Date
     * @param date
     * @return none
     */
    public void setdate(String date) {
        this.date = date;
    }

    /**
     * Getter for Event Time
     * @param none
     * @return this.eventTime
     */
    public String gettime() {
        return this.time;
    }
    /**
     * Setter for Event TIme
     * @param time
     * @return none
     */
    public void settime(String time) {
        this.time = time;
    }

    /**
     * Getter for Event Type
     * @param none
     * @return this.eventType
     */
    public String getEventType() {
        return this.eventType;
    }
    /**
     * Setter for Event Type
     * @param eventType
     * @return none
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * Getter for Event ID
     * @param none
     * @return this.eventID
     */
    public int getidEvent() {
        return this.idEvent;
    }
    /**
     * Setter for Event ID
     * @param idEvent
     * @return none
     */
    public void setidEvent(int idEvent) {
        this.idEvent = idEvent;
    }

    /**
     * Getter for VIP Price of an event.
     * @param none
     * @return vipPrice
     */
    public double getVipPrice() {
        return vipPrice;
    }
    /**
     * Setter for VIP Price of an event.
     * @param vipPrice
     * @return none
     */
    public void setVipPrice(double vipPrice) {
        this.vipPrice = vipPrice;
    }

    /**
     * Getter for Gold Price of an event.
     * @param none
     * @return goldPrice
     */
    public double getGoldPrice() {
        return goldPrice;
    }
    /**
     * Setter for Gold Price of an event.
     * @param goldPrice
     * @return none
     */
    public void setGoldPrice(double goldPrice) {
        this.goldPrice = goldPrice;
    }

    /**
     * Getter for Silver Price of an event.
     * @param none
     * @return silverPrice
     */
    public double getSilverPrice() {
        return silverPrice;
    }
    /**
     * Setter for Silver Price of an event.
     * @return none
     * @param silverPrice
     */
    public void setSilverPrice(double silverPrice) {
        this.silverPrice = silverPrice;
    }

    /**
     * Getter for Bronze Price of an event.
     * @return getBronzePrice
     * @param none
     */
    public double getBronzePrice() {
        return bronzePrice;
    }
    /**
     * Setter for Bronze Price of an event.
     * @return none
     * @param bronzePrice
     */
    public void setBronzePrice(double bronzePrice) {
        this.bronzePrice = bronzePrice;
    }

    /**
     * Getter for General Admission Price of an event.
     * @param none
     * @return generalPrice
     */
    public double getGenAdmPrice() {
        return genAdmPrice;
    }
    /**
     * Setter for General Admission Price of an event.
     * @return none
     * @param genAdmPrice
     */
    public void setGenAdmPrice(double genAdmPrice) {
        this.genAdmPrice = genAdmPrice;
    }

    /**
     * Getter for Vip revenue
     * @return
     */
    public double getVipRev() {
        return vipRev;
    }

    /**
     * Setter for Vip Revenue
     * @param vipRev
     */
    public void setVipRev(double vipRev) {
        this.vipRev = vipRev;
    }

    /**
     * Getter for Gold Revenue
     * @return
     */
    public double getGoldRev() {
        return goldRev;
    }

    /**
     * Setter for Gold Revenue
     * @param goldRev
     */
    public void setGoldRev(double goldRev) {
        this.goldRev = goldRev;
    }

    /**
     * Getter for Silver Revenue
     * @return
     */
    public double getSilverRev() {
        return silverRev;
    }

    /**
     * Setter for Silver Revenue
     * @param silverRev
     */
    public void setSilverRev(double silverRev) {
        this.silverRev = silverRev;
    }

    /**
     * Getter for Bronze Revenue
     * @return
     */
    public double getBronzeRev() {
        return bronzeRev;
    }

    /**
     * Setter for Bronze Revenue
     * @param bronzeRev
     */
    public void setBronzeRev(double bronzeRev) {
        this.bronzeRev = bronzeRev;
    }

    /**
     * Getter for General Admission Revenue
     * @return
     */
    public double getGenRev() {
        return genRev;
    }

    /**
     * Setter for General Admission Revenue
     * @param genRev
     */
    public void setGenRev(double genRev) {
        this.genRev = genRev;
    }

    /**
     * Getter for Total Discounted
     * @return
     */
    public double getDiscounted() {
        return discounted;
    }

    /**
     * Setter for Total Discounted
     * @param discounted
     */
    public void setDiscounted(double discounted) {
        this.discounted = discounted;
    }

    /**
     * The following method will simply print all of the event information of an
     * event.
     * 
     * This method was originally created by Rafael Ayala, but was modified to
     * accomodate for Darien Booth's implementation of certain attributes, such
     * as the event's name, date, and time.
     * 
     * @param event
     * @return none
     */
    public void printEventInfo(Event event, String eventKey) {

        int totalTickets = event.getTotalSold();

        RevenueCalculator revenueCalc = new RevenueCalculator();

        double totalRev = event.getVipRev() + event.getGoldRev() + event.getSilverRev() + event.getBronzeRev() + event.getGenRev();

        System.out.println("ID and Name: "+eventKey);
        System.out.println("Date: " + event.getdate());
        System.out.println("Time: " + event.gettime());
        System.out.println("Event Type: " + event.getEventType());
        System.out.println("Fireworks? " + event.getVenue().getFireworksPlanned());
        System.out.println("Fireworks cost: $"+event.getVenue().getFireworksCost());
        System.out.println(
                "Venue: " + event.getVenue().getVenueName() + ", Type: " + event.getVenue().getVenueType() + ", Capacity: "
                        + event.getVenue().getCapacity() + ", Venue Cost: $" + event.getVenue().getCost());
        System.out.println("Total Seats Sold: " + totalTickets+", Remaining: "+(event.getVenue().getCapacity() - totalTickets));
        System.out.println("Total VIP seats sold: " + event.getSoldVip()+", Remaining: "+(((event.getVenue().getVipPct()/100)*event.getVenue().getCapacity()) - event.getSoldVip()));
        System.out.println("Total Gold seats sold: " + event.getSoldGold()+", Remaining: "+(((event.getVenue().getGoldPct()/100)*event.getVenue().getCapacity()) - event.getSoldGold()));
        System.out.println("Total Silver seats sold: " + event.getSoldSilver()+", Remaining: "+(((event.getVenue().getSilverPct()/100)*event.getVenue().getCapacity()) - event.getSoldSilver()));
        System.out.println("Total Bronze seats sold: " + event.getSoldBronze()+", Remaining: "+(((event.getVenue().getBronzePct()/100)*event.getVenue().getCapacity()) - event.getSoldBronze()));
        System.out.println("Total General Admission seats sold: " + event.getSoldGen()+", Remaining: "+(((event.getVenue().getGenPct()/100)*event.getVenue().getCapacity()) - event.getSoldGen()));
        
        double expectedProfit = revenueCalc.getExpectedProfit(event);
        DecimalFormat expectedProfitUgly = new DecimalFormat("#,##0");
        String expectedProfitNice = expectedProfitUgly.format(expectedProfit);

        System.out.println("Total revenue for VIP tickets: $" + Math.floor(event.getVipRev()*100)/100);
        System.out.println("Total revenue for Gold tickets: $" + Math.floor(event.getGoldRev()*100)/100);
        System.out.println("Total revenue for Silver tickets: $" + Math.floor(event.getSilverRev()*100)/100);
        System.out.println("Total revenue for Bronze tickets: $" + Math.floor(event.getBronzeRev()*100)/100);
        System.out.println("Total revenue for General Admission tickets: $" + Math.floor(event.getGenRev()*100)/100);
        System.out.println("Total revenue for all tickets: $"+Math.floor(totalRev*100)/100);
        System.out.println("Expected Profit(Sell Out) $"+expectedProfitNice);
        System.out.println("Actual Profit: $" + Math.floor((totalRev - event.getVenue().getCost() - event.getVenue().getFireworksCost() - (totalRev*0.0825))*100)/100);
        System.out.println("Total tax charged: $"+(Math.floor(event.getTaxCharged()*100))/100);
        System.out.println("Total Discounted: $"+(Math.floor(event.getDiscounted()*100))/100);
    }
}
