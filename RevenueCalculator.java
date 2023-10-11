
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
 * - RevenueCalculator.java
 * 
 * - The following class defines an object for calculating various revenue values for the TicketMiner system,
 * such as the total VIP ticket revenue for an event.
 * 
 * This work was done individually and completely on my own. I did not share, reproduce, or alter any part of this 
 * assignment for any purpose. I did not share code, upload this assignment online in any form, or 
 * view/received/modified code written from anyone else. All deliverables were produced entirely on my own. This 
 * assignment is part of an academic course at The University of Texas at El Paso and a grade will be assigned for 
 * the work I produced.
 * 
 */
import java.lang.*;

public class RevenueCalculator {

    /**
     * Constructor for revenue calculator
     */
    public RevenueCalculator(){}

    /**
     * This method will obtain the total VIP revenue of an event.
     * @param event
     * @return
     */
    public double getVipRev(Event event){
        return (Math.floor(event.getVipPrice() * Double.valueOf(event.getSoldVip() * 100) / 100));
    }

    /**
     * This method will obtain the total Gold revenue of an event.
     * @param event
     * @return
     */
    public double getGoldRev(Event event){
        return (Math.floor(event.getGoldPrice() * Double.valueOf(event.getSoldGold() * 100) / 100));
    }

    /**
     * This method will obtain the total Silver revenue of an event.
     * @param event
     * @return
     */
    public double getSilverRev(Event event){
        return (Math.floor(event.getSilverPrice() * Double.valueOf(event.getSoldSilver() * 100) / 100));
    }
    
    /**
     * This method will obtain the total Bronze revenue of an event.
     * @param event
     * @return
     */
    public double getBronzeRev(Event event){
        return (Math.floor(event.getBronzePrice() * Double.valueOf(event.getSoldBronze() * 100) / 100));
    }

    /**
     * This method will obtain the total General Admission revenue of an event.
     * @param event
     * @return
     */
    public double getGenRev(Event event){
        return (Math.floor(event.getGeneralPrice() * Double.valueOf(event.getSoldGen() * 100) / 100));
    }

    /**
     * This method will calculate the expected profit of an event, which should be the result of subtracting the
     * venue cost and fireworks cost from the total revenue obtained for the event.
     * @param event
     * @return
     */
    public double getExpectedProfit(Event event){
        
        double expVipProfit = ((event.getVenue().getVIPPct()/100) * event.getVenue().getCapacity()) * event.getVipPrice();
        double expGoldProfit = ((event.getVenue().getGoldPct()/100) * event.getVenue().getCapacity()) * event.getGoldPrice();
        double expSilverProfit = ((event.getVenue().getSilverPct()/100) * event.getVenue().getCapacity()) * event.getSilverPrice();
        double expBronzeProfit = ((event.getVenue().getBronzePct()/100) * event.getVenue().getCapacity()) * event.getBronzePrice();
        double expGeneralProfit = ((event.getVenue().getGenPct()/100) * event.getVenue().getCapacity()) * event.getGeneralPrice();

        double ticketTotal = expVipProfit + expGoldProfit + expSilverProfit + expBronzeProfit + expGeneralProfit;

        return (Math.floor(ticketTotal - event.getVenue().getCost() - event.getFireWorksCost())*100)/100;
    }
}