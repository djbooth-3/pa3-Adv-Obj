/**
 * @author Darien Booth 
 * @version 1.3
 */

 /**
  * Invoice class for structuring information of an invoice
  */
public class Invoice {

    /**
     * Attributes for class
     */
    private int numOfTickets;
    private int totalPrice;
    private int confirmationNum; 

    /**
     * for creating instance of the class
     */
    public Invoice() {

    }

    // created getters and setters for all attributes

    /**
     * getting number of tickets purchased
     * @return integer of number of tickets
     */
    public int getNumOfTickets() {
        return this.numOfTickets; 
    }

    /**
     * setting number of tickets purchased 
     * @param numOfTickets integer for number of tickets
     */
    public void setNumOfTickets(int numOfTickets) {
        this.numOfTickets = numOfTickets; 
    }

    /**
     * getting total price
     * @return integer of total
     */
    public int getTotalPrice() {
        return this.totalPrice; 
    }

    /**
     * setting total price
     * @param totalPrice integer for total
     */
    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice; 
    }

    /**
     * getting confirmation number 
     * @return integer 
     */
    public int getConfirmationNum() {
        return this.confirmationNum; 
    }

    /**
     * setting confirmation number
     * @param confirmationNum integer 
     */
    public void setConfirmationNum(int confirmationNum) {
        this.confirmationNum = confirmationNum; 
    }

    /**
     * printing invoice
     */
    public void printInvoice() {
        System.out.println("---------------Invoice-----------------");
        System.out.println("Here is the total number of tickets you purchased: " + this.numOfTickets);
        System.out.println("Here is the total price: " + this.totalPrice);
        System.out.println("Here is your confirmation number: " + this.confirmationNum);
        System.out.println("-----------------------------------------");
    }
}
