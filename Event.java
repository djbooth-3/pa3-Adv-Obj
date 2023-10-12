/**
 * @author Darien Booth 
 * @version 1.5
 */

//imports
import java.util.ArrayList;

/**
 * Event class for structuring information of an event
 */
public abstract class Event {

    /**
     * Attriutes for class
     */
    private int idEvent;
    private String eventType;
    private String name;
    private String date;
    private String time;
    private double vipPrice;
    private double goldPrice;
    private double silverPrice;
    private double bronzePrice;
    private double genAdmPrice;
    private Venue venue;
    private int numOfVS;
    private int numOfGS;
    private int numOfSS;
    private int numOfBS;
    private int numOfGNS;
    private ArrayList<String> purchasedTickets = new ArrayList<String>();
    private int vipSold;
    private int goldSold;
    private int silverSold;
    private int bronzeSold;
    private int genAdmSold;
    private double expectedProfit;
    private double currentProfit;

    // created getters and setters for all attributes

    /**
     * setting event id
     * 
     * @param idEvent integer for the id of event
     */
    public void setidEvent(int idEvent) {
        this.idEvent = idEvent;
    }

    /**
     * getting event id
     * 
     * @return integer of the id event
     */
    public int getidEvent() {
        return this.idEvent;
    }

    /**
     * getting event type
     * 
     * @return string for the event type
     */
    public String getEventType() {
        return this.eventType;
    }

    /**
     * setting event type
     * 
     * @param eventType string for event type
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * setting event name
     * 
     * @param name string for the name
     */
    public void setname(String name) {
        this.name = name;
    }

    /**
     * getting event name
     * 
     * @return string of event name
     */
    public String getname() {
        return this.name;
    }

    /**
     * setting event date
     * 
     * @param date string for date
     */
    public void setdate(String date) {
        this.date = date;
    }

    /**
     * getting event date
     * 
     * @return string of date
     */
    public String getdate() {
        return this.date;
    }

    /**
     * setting event time
     * 
     * @param time string for time
     */
    public void settime(String time) {
        this.time = time;
    }

    /**
     * getting event time
     * 
     * @return string of time
     */
    public String gettime() {
        return this.time;
    }

    /**
     * setting vip price
     * 
     * @param vipPrice double for price
     */
    public void setVipPrice(double vipPrice) {
        this.vipPrice = vipPrice;
    }

    /**
     * getting event vip price
     * 
     * @return double of price
     */
    public double getVipPrice() {
        return this.vipPrice;
    }

    /**
     * setting gold price
     * 
     * @param goldPrice double for price
     */
    public void setGoldPrice(double goldPrice) {
        this.goldPrice = goldPrice;
    }

    /**
     * getting event gold price
     * 
     * @return double of price
     */
    public double getGoldPrice() {
        return this.goldPrice;
    }

    /**
     * setting silver price
     * 
     * @param silverPrice double for price
     */
    public void setSilverPrice(double silverPrice) {
        this.silverPrice = silverPrice;
    }

    /**
     * getting event silver price
     * 
     * @return double of price
     */
    public double getSilverPrice() {
        return this.silverPrice;
    }

    /**
     * setting bronze price
     * 
     * @param bronzePrice double of price
     */
    public void setBronzePrice(double bronzePrice) {
        this.bronzePrice = bronzePrice;
    }

    /**
     * getting event bronze price
     * 
     * @return double of price
     */
    public double getBronzePrice() {
        return this.bronzePrice;
    }

    /**
     * setting general admission price
     * 
     * @param genAdmPrice double of price
     */
    public void setGenAdmPrice(double genAdmPrice) {
        this.genAdmPrice = genAdmPrice;
    }

    /**
     * getting event general admissions price
     * 
     * @return double of price
     */
    public double getGenAdmPrice() {
        return this.genAdmPrice;
    }

    /**
     * setting venue information
     * 
     * @param venue structure of venue
     */
    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    /**
     * getting event
     * 
     * @return Venue information
     */
    public Venue getVenue() {
        return this.venue;
    }

    /**
     * setting number of seats available for vip
     * 
     * @param numOfVS double of seats available
     */
    public void setNumOfVS(double numOfVS) {
        this.numOfVS = (int) numOfVS;
    }

    /**
     * getting event seats available for vip
     * 
     * @return int of seats available
     */
    public int getNumOfVS() {
        return this.numOfVS;
    }

    /**
     * setting number of seats available for gold
     * 
     * @param numOfGS double of seats available
     */
    public void setNumOfGS(double numOfGS) {
        this.numOfGS = (int) numOfGS;
    }

    /**
     * getting event seats available for gold
     * 
     * @return int of seats available
     */
    public int getNumOfGS() {
        return this.numOfGS;
    }

    /**
     * setting number of seats available for silver
     * 
     * @param numOfSS double of seats available
     */
    public void setNumOfSS(double numOfSS) {
        this.numOfSS = (int) numOfSS;
    }

    /**
     * getting event seats available for silver
     * 
     * @return int of seats available
     */
    public int getNumOfSS() {
        return this.numOfSS;
    }

    /**
     * setting number of seats available for bronze
     * 
     * @param numOfBS double of seats available
     */
    public void setNumOfBS(double numOfBS) {
        this.numOfBS = (int) numOfBS;
    }

    /**
     * getting event seats available for bronze
     * 
     * @return int of seats available
     */
    public int getNumOfBS() {
        return this.numOfBS;
    }

    /**
     * setting number of seats available for general admission
     * 
     * @param numOfGNS double of seats available
     */
    public void setNumOfGNS(double numOfGNS) {
        this.numOfGNS = (int) numOfGNS;
    }

    /**
     * getting event seats available for general admission
     * 
     * @return int of seats available
     */
    public int getNumOfGNS() {
        return this.numOfGNS;
    }

    /**
     * printing the events
     */
    public void printEvents() {
        System.out.println(this.idEvent + ". " + this.name);
    }

    /**
     * printing the purchased tickets
     */
    public void getPurchasedTickets() {
        for (int i = 0; i < purchasedTickets.size(); i++) {
            System.out.println(this.purchasedTickets.get(i));
        }
    }

    /**
     * setting which ticket was purchased
     * 
     * @param purchasedTicket String of which ticket was pruchased
     */
    public void setPurchasedTickets(String purchasedTicket) {
        this.purchasedTickets.add(purchasedTicket);
    }

    /**
     * getting number of sold vip seats
     * 
     * @return number of sold seats
     */
    public int getVipSold() {
        return this.vipSold;
    }

    /**
     * setting number of sold vip seats
     * 
     * @param vipSold double of sold seats
     */
    public void setVipSold(double vipSold) {
        this.vipSold = (int) vipSold;
    }

    /**
     * getting number of sold gold seats
     * 
     * @return number of sold seats
     */
    public int getGoldSold() {
        return this.goldSold;
    }

    /**
     * setting number of sold gold seats
     * 
     * @param goldSold double of sold seats
     */
    public void setGoldSold(double goldSold) {
        this.goldSold = (int) goldSold;
    }

    /**
     * getting number of sold silver seats
     * 
     * @return number of sold seats
     */
    public int getSilverSold() {
        return this.silverSold;
    }

    /**
     * setting number of sold silver seats
     * 
     * @param silverSold double of sold seats
     */
    public void setSilverSold(double silverSold) {
        this.silverSold = (int) silverSold;
    }

    /**
     * getting number of sold bronze seats
     * 
     * @return number of sold seats
     */
    public int getBronzeSold() {
        return this.bronzeSold;
    }

    /**
     * setting number of sold bronze seats
     * 
     * @param bronzeSold double of sold seats
     */
    public void setBronzeSold(double bronzeSold) {
        this.bronzeSold = (int) bronzeSold;
    }

    /**
     * getting number of sold general admission seats
     * 
     * @return number of sold seats
     */
    public int getGenAdmSold() {
        return this.genAdmSold;
    }

    /**
     * setting number of sold general admission seats
     * 
     * @param genAdmSold double of sold seats
     */
    public void setGenAdmSold(double genAdmSold) {
        this.genAdmSold = (int) genAdmSold;
    }

    /**
     * getting number of expected profit
     * 
     * @return number of expected profit
     */
    public double getExpectedProfit() {
        return this.expectedProfit;
    }

    /**
     * setting number of expected profit
     * 
     * @param expectedProfit double of expected profit
     */
    public void setExpectedProfit(double expectedProfit) {
        this.expectedProfit = expectedProfit;
    }

    /**
     * getting number of current profit
     * 
     * @return number of current profit
     */
    public double getCurrentProfit() {
        return this.currentProfit;
    }

    /**
     * setting number of current profit
     * 
     * @param currentProfit double of current profit 
     */
    public void setCurrentProfit(double currentProfit) {
        this.currentProfit = currentProfit;
    }

    /**
     * printing the ticekt prices and seat available
     */
    public void printPrices() {
        System.out.println("Prices of Tickets:");
        System.out.println("1. Vip Price: " + this.vipPrice + " (" + this.numOfVS + " seats available)");
        System.out.println("2. Gold Price: " + this.goldPrice + " (" + this.numOfGS + " seats available)");
        System.out.println("3. Silver Price: " + this.silverPrice + " (" + this.numOfSS + " seats available)");
        System.out.println("4. Bronze Price: " + this.bronzePrice + " (" + this.numOfBS + " seats available)");
        System.out.println("5. General Admission Price: " + this.genAdmPrice + " (" + this.numOfGNS + " seats available)");
    }

    /**
     * printing information of event
     */
    public void printEventInfo() {
        System.out.println("---------------------------------------------");
        System.out.println("Event ID: " + this.idEvent);
        System.out.println(this.name);
        System.out.println(this.date);
        System.out.println(this.time);
        System.out.println("VIP Price: " + this.vipPrice);
        System.out.println("Gold Price: " + this.goldPrice);
        System.out.println("Silver Price: " + this.silverPrice); 
        System.out.println("Bronze Price: " + this.bronzePrice);
        System.out.println("General Admission Price: " + this.genAdmPrice);
        System.out.println("Event Type: " + this.eventType);
        System.out.println("Venue Name: " + this.venue.getVenueName());
        System.out.println("Venue Type " + this.venue.getVenueType());
        System.out.println("Capacity: " + this.venue.getCapacity());
        System.out.println("Total seats remaining: " + (this.numOfVS + this.numOfGS + this.numOfSS + this.numOfBS + this.numOfGNS));
        System.out.println("Total VIP seats remaining: " + this.numOfVS);
        System.out.println("Total VIP seats sold: " + this.vipSold);
        System.out.println("Total revenue for VIP tickets: $" + (this.vipSold * this.vipPrice));
        System.out.println("Total gold seats remaining: " + this.numOfGS);
        System.out.println("Total gold seats sold: " + this.goldSold);
        System.out.println("Total revenue for gold tickets: $" + (this.goldSold * this.goldPrice));
        System.out.println("Total silver seats remaining: " + this.numOfSS);
        System.out.println("Total silver seats sold: " + this.silverSold);
        System.out.println("Total revenue for silver tickets: $" + (this.silverSold * this.silverPrice));
        System.out.println("Total bronze seats remaining: " + this.numOfBS);
        System.out.println("Total bronze seats sold: " + this.bronzeSold);
        System.out.println("Total revenue for bronze tickets: $" + (this.bronzeSold * this.bronzePrice));
        System.out.println("Total general admission seats remaining: " + this.numOfGNS);
        System.out.println("Total general admission seats sold: " + this.genAdmSold);
        System.out.println("Total revenue for general admission tickets: $" + (this.genAdmSold * this.genAdmPrice));
        System.out.println("Total revenue for all tickets: " + ((this.vipSold * this.vipPrice) + (this.goldSold * this.goldPrice) + (this.silverSold * this.silverPrice) + (this.silverSold * this.silverPrice) + (this.genAdmSold * this.genAdmPrice)));
        System.out.println("Expected profit (Sale Out): " + String.format("%8.2f",this.expectedProfit));
        System.out.println("Actual profit: " + this.currentProfit);
        System.out.println("---------------------------------------------");
    }
}
