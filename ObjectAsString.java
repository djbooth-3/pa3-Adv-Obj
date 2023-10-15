/**
 * @author Darien Booth, Rafael Ayala
 * 
 * @since October 12, 2023
 * 
 * - CS 3331 - Advanced Object-Oriented Programming
 * 
 * - Dr. Daniel Mejia
 * 
 * - Programming Assignment 3
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

        String pt1 = eventTemp.getEventType();
        String pt2 = eventTemp.getname();
        String pt3 = eventTemp.getdate();
        String pt4 = eventTemp.gettime();
        String pt5 = String.valueOf(eventTemp.getVipPrice());
        String pt6 = String.valueOf(eventTemp.getGoldPrice());
        String pt7 = String.valueOf(eventTemp.getSilverPrice());
        String pt8 = String.valueOf(eventTemp.getBronzePrice());
        String pt9 = String.valueOf(eventTemp.getGenAdmPrice());
        String pt10 = eventTemp.getVenue().getVenueName();
        String pt11 = String.valueOf(eventTemp.getVenue().getPctSeatsUA());
        String pt12 = eventTemp.getVenue().getVenueType();
        String pt13 = String.valueOf(eventTemp.getVenue().getCapacity());
        String pt14 = String.valueOf(eventTemp.getVenue().getCost());
        String pt15 = String.valueOf(eventTemp.getVenue().getVipPct());
        String pt16 = String.valueOf(eventTemp.getVenue().getGoldPct());
        String pt17 = String.valueOf(eventTemp.getVenue().getSilverPct());
        String pt18 = String.valueOf(eventTemp.getVenue().getBronzePct());
        String pt19 = String.valueOf(eventTemp.getVenue().getGenPct());
        String pt20 = String.valueOf(eventTemp.getVenue().getResPct());
        String pt21 = String.valueOf(eventTemp.getVenue().getFireworksPlanned());
        String pt22 = String.valueOf(eventTemp.getVenue().getFireworksCost());
        String pt23 = String.valueOf(eventTemp.getSoldVip());
        String pt24 = String.valueOf(eventTemp.getSoldGold());
        String pt25 = String.valueOf(eventTemp.getSoldSilver());
        String pt26 = String.valueOf(eventTemp.getSoldBronze());
        String pt27 = String.valueOf(eventTemp.getSoldGen());
        String pt28 = String.valueOf(revCalc.getVipRev(eventTemp));
        String pt29 = String.valueOf(revCalc.getGoldRev(eventTemp));
        String pt30 = String.valueOf(revCalc.getSilverRev(eventTemp));
        String pt31 = String.valueOf(revCalc.getBronzeRev(eventTemp));
        String pt32 = String.valueOf(revCalc.getGenRev(eventTemp));

        String csvRow = pt1 + "," + pt2 + "," + pt3 + "," + pt4 + "," + pt5 + ","
        + pt6 + "," + pt7 + "," + pt8 + "," + pt9 + "," + pt10 + "," + pt11 + ","
        + pt12 + "," + pt13 + "," + pt14 + "," + pt15 + "," + pt16 + "," + pt17
        + "," + pt18 + "," + pt19 + "," + pt20 + "," + pt21 + "," + pt22 + ","
        + pt23 + "," + pt24 + "," + pt25 + "," + pt26 + "," + pt27 + ","
        + pt28 + "," + pt29 + "," + pt30 + "," + pt31 + "," + pt32 + "\n";

        return csvRow;
    }

}
