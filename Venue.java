/**
 * @author Darien Booth 
 * @version 1.3
 */

 /**
  * Venue class for structuring information of a venue
  */
public abstract class Venue {

    /**
     * Attribute for class
     */
    private String venueName;
    private String venueType;
    private int pctSeatsUA;
    private int capacity;
    private int availCapacity;
    private int cost;
    private double vipPct;
    private double goldPct;
    private double silverPct;
    private double bronzePct;
    private double genAdmPct;
    private double resExtraPct;
    private String fireworksPlanned;
    private int fireworksCost;  

    // created getters and setters for all attributes

    /**
     * getting venue name
     * @return string of name 
     */
    public String getVenueName() {
        return this.venueName;
    }

    /**
     * setting venue name 
     * @param venueName string for name 
     */
    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    /**
     * getting venue type
     * @return string of venue type
     */
    public String getVenueType() {
        return this.venueType;
    }

    /**
     * setting venue type
     * @param venueType string for venue type
     */
    public void setVenueType(String venueType) {
        this.venueType = venueType;
    }

    /**
     * getting percentage of seats unavailable 
     * @return integer of seats unavailable
     */
    public int getPctSeatsUA() {
        return this.pctSeatsUA;
    }

    /**
     * setting percentage of seats unavailable
     * @param pctSeatsUA integer for seats unavailable 
     */
    public void setPctSeatsUA(int pctSeatsUA) {
        this.pctSeatsUA = pctSeatsUA;
    }

    /**
     * getting capacity of venue
     * @return double of capacity 
     */
    public int getCapacity() {
        return this.capacity;
    }

    /**
     * setting capacity of venue
     * @param capacity double for capacity 
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * getting available capacity 
     * @return integer of available capacity 
     */
    public int getAvailCapacity() {
        return this.availCapacity;
    }

    /**
     * setting available capacity 
     * @param availCapacity integer of available capacity 
     */
    public void setAvailCapacity(int availCapacity) {
        this.availCapacity = availCapacity;
    }

    /**
     * getting venue cost 
     * @return integer of cost 
     */
    public int getCost() {
        return this.cost;
    }

    /**
     * setting venue cost 
     * @param cost integer for cost
     */
    public void setCost(int cost) {
        this.cost = cost;
    }

    /**
     * getting vip percentage of seats 
     * @return double of percentage
     */
    public double getVipPct() {
        return this.vipPct;
    }

    /**
     * setting vip percentage of seats
     * @param vipPct double of percentage
     */
    public void setVipPct(double vipPct) {
        this.vipPct = vipPct;
    }

    /**
     * getting gold percentage of seats 
     * @return double of percentage
     */
    public double getGoldPct() {
        return this.goldPct;
    }

    /**
     * setting gold percentage of seats
     * @param goldPct double of percentage
     */
    public void setGoldPct(double goldPct) {
        this.goldPct = goldPct;
    }

    /**
     * getting silver percentage of seats 
     * @return double of percentage
     */
    public double getSilverPct() {
        return this.silverPct;
    }

    /**
     * setting silver percentage of seats
     * @param silverPct double of percentage
     */
    public void setSilverPct(double silverPct) {
        this.silverPct = silverPct;
    }

    /**
     * getting bronze percentage of seats 
     * @return double of percentage
     */
    public double getBronzePct() {
        return this.bronzePct;
    }

    /**
     * setting bronze percentage of seats
     * @param bronzePct double of percentage
     */
    public void setBronzePct(double bronzePct) {
        this.bronzePct = bronzePct;
    }

    /**
     * getting general admission percentage of seats 
     * @return double of percentage
     */
    public double getGenAdmPct() {
        return this.genAdmPct;
    }

    /**
     * setting general admission percentage of seats
     * @param genAdmPct double of percentage
     */
    public void setGenAdmPct(double genAdmPct) {
        this.genAdmPct = genAdmPct;
    }

    /**
     * getting reserved percentage of seats 
     * @return double of percentage
     */
    public double getResExtraPct() {
        return this.resExtraPct;
    }

    /**
     * setting reserved percentage of seats
     * @param resExtraPct double of percentage
     */
    public void setResExtraPct(double resExtraPct) {
        this.resExtraPct = resExtraPct;
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
    public int getFireworksCost() {
        return this.fireworksCost;
    }

    /**
     * settting cost of fireworks
     * @param fireworksCost int for cost 
     */
    public void setFireworksCost(int fireworksCost) {
        this.fireworksCost = fireworksCost;
    }
}
