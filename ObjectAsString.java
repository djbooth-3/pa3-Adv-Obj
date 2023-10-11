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
 * - ObjectAsString.java
 * 
 * - The following file contains a class which contains a method for converting all event attributes to a String, 
 * which will compose a row of the updated Event csv file.
 * 
 * This work was done individually and completely on my own. I did not share, reproduce, or alter any part of this 
 * assignment for any purpose. I did not share code, upload this assignment online in any form, or 
 * view/received/modified code written from anyone else. All deliverables were produced entirely on my own. This 
 * assignment is part of an academic course at The University of Texas at El Paso and a grade will be assigned for 
 * the work I produced.
 * 
 */

public class ObjectAsString {

    /**
     * The following method will take the attributes of an event and convert them to a
     * csv string to be inserted into each row of the the updated EventList csv file.
     * @param eventTemp
     * @return
     */
    public String eventAsString(Event eventTemp) {

        RevenueCalculator revCalc = new RevenueCalculator();

        String eType = eventTemp.getEventType();
        String eName = eventTemp.getEventName();
        String eDate = eventTemp.getDate();
        String eTime = eventTemp.getTime();
        String eVPrc = String.valueOf(eventTemp.getVipPrice());
        String eGPrc = String.valueOf(eventTemp.getGoldPrice());
        String eSPrc = String.valueOf(eventTemp.getSilverPrice());
        String eBPrc = String.valueOf(eventTemp.getBronzePrice());
        String eGAPrc = String.valueOf(eventTemp.getGeneralPrice());
        String eVenName = eventTemp.getVenue().getVName();
        String ePctUn = String.valueOf(eventTemp.getVenue().getSeatsUn());
        String eVenType = eventTemp.getVenue().getVType();
        String eVCpcty = String.valueOf(eventTemp.getVenue().getCapacity());
        String eVCost = String.valueOf(eventTemp.getVenue().getCost());
        String eVIPPct = String.valueOf(eventTemp.getVenue().getVIPPct());
        String eGoldPct = String.valueOf(eventTemp.getVenue().getGoldPct());
        String eSilverPct = String.valueOf(eventTemp.getVenue().getSilverPct());
        String eBronzePct = String.valueOf(eventTemp.getVenue().getBronzePct());
        String eGenPct = String.valueOf(eventTemp.getVenue().getGenPct());
        String eResPct = String.valueOf(eventTemp.getVenue().getResPct());
        String eFWPlanned = String.valueOf(eventTemp.getFireworks());
        String eFWCost = String.valueOf(eventTemp.getFireWorksCost());
        String eVIPSold = String.valueOf(eventTemp.getSoldVip());
        String eGoldSold = String.valueOf(eventTemp.getSoldGold());
        String eSilverSold = String.valueOf(eventTemp.getSoldSilver());
        String eBronzeSold = String.valueOf(eventTemp.getSoldBronze());
        String eGenSold = String.valueOf(eventTemp.getSoldGen());
        String eVIPRev = String.valueOf(revCalc.getVipRev(eventTemp));
        String eGoldRev = String.valueOf(revCalc.getGoldRev(eventTemp));
        String eSilverRev = String.valueOf(revCalc.getSilverRev(eventTemp));
        String eBronzeRev = String.valueOf(revCalc.getBronzeRev(eventTemp));
        String eGenRev = String.valueOf(revCalc.getGenRev(eventTemp));

        String csvRow = eType + "," + eName + "," + eDate + "," + eTime + "," + eVPrc + ","
        + eGPrc + "," + eSPrc + "," + eBPrc + "," + eGAPrc + "," + eVenName + "," + ePctUn + ","
        + eVenType + "," + eVCpcty + "," + eVCost + "," + eVIPPct + "," + eGoldPct + "," + eSilverPct
        + "," + eBronzePct + "," + eGenPct + "," + eResPct + "," + eFWPlanned + "," + eFWCost + ","
        + eVIPSold + "," + eGoldSold + "," + eSilverSold + "," + eBronzeSold + "," + eGenSold + ","
        + eVIPRev + "," + eGoldRev + "," + eSilverRev + "," + eBronzeRev + "," + eGenRev + "\n";

        return csvRow;
    }

}
