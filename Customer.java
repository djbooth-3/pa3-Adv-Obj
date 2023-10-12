/**
 * @author Darien Booth 
 * @version 1.2
 */

 //imports
import java.util.ArrayList;

/**
 * Customer class for structuring information of a customer
 */
public class Customer {

    /**
     * Attributes for class
     */
    private int customerID;
    private String firstName;
    private String lastName;
    private double moneyAvailable;
    private int concertsPurchased;
    private boolean membership;
    private String username;
    private String password;
    private ArrayList<Invoice> invoice = new ArrayList<Invoice>(); 

    /**
     * for creating instance of the class
     */
    public Customer() {

    }

    // created getters and setters for all attributes

    /**
     * getting id of customer
     * @return integer of id
     */
    public int getCustomerID() {
        return this.customerID;
    }

    /**
     * setting id of customer
     * @param customerID integer for id 
     */
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    /**
     * getting first name 
     * @return string of first name 
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * setting first name 
     * @param firstName string for first name 
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * getting last name 
     * @return string of last name 
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * setting last name 
     * @param lastName string for lastname 
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * getting balance
     * @return double of balance 
     */
    public double getMoneyAvailable() {
        return this.moneyAvailable;
    }

    /**
     * setting amount balance
     * @param moneyAvailable double for balance
     */
    public void setMoneyAvailable(double moneyAvailable) {
        this.moneyAvailable = moneyAvailable;
    }

    /**
     * getting total of concerts purchased 
     * @return integer of total 
     */
    public int getConcertsPurchased() {
        return this.concertsPurchased;
    }

    /**
     * setting total concerts purchased 
     * @param concertsPurchased integer for total 
     */
    public void setConcertsPurchased(int concertsPurchased) {
        this.concertsPurchased = concertsPurchased;
    }

    /**
     * getting membership status
     * @return boolean of status
     */
    public boolean getMembership() {
        return this.membership;
    }

    /**
     * setting membership status
     * @param membership boolean for status
     */
    public void setMembership(boolean membership) {
        this.membership = membership;
    }

    /**
     * getting username
     * @return string of username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * setting username 
     * @param username string for username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * getting password
     * @return string of password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * setting password 
     * @param password string for password 
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * getting invoice infomration 
     */
    public void getInvoice() {
        for(int i = 0; i < invoice.size(); i++) {
            this.invoice.get(i).printInvoice();
        } 
    }

    /**
     * setting an invoice
     * @param invoice structure of invoice
     */
    public void setInvoice(Invoice invoice) {
        this.invoice.add(invoice); 
    }

    /**
     * printing information of a customer
     */
    public void printInfo() {
        System.out.println("-----Account Info-----");
        System.out.println(this.firstName + this.lastName);
        System.out.println("Membership: " + this.membership);
        System.out.println("Balance: " + String.format("%.2f",this.moneyAvailable));
        System.out.println("Concerts Purchased: " + this.concertsPurchased);
        System.out.println("-------------------------");
    }

    /**
     * making a purchase 
     * @param amount double for how much the purchase is 
     */
    public void purchase(double amount) {
        this.moneyAvailable -= amount;
    }
}