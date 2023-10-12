/**
 * @author Darien Booth 
 * @version 1.0
 */

public class Factory {

    /**
     * Creating instance of the class
     */
    public Factory() {

    }

    /**
     * Creating event type instance of a child class depending on input
     * @param eventType String for event type
     * @return event based on string input
     */
    public Event createEvent(String eventType) {
        if (eventType.equals("Sport")) {
            return new Sport();
        } else if (eventType.equals("Concert")) {
            return new Concert();
        } else {
            return new Festival();
        }
    }

    /**
     * Creating venue type instance of a child class depending on input 
     * @param venueType String for venue type
     * @return venue based on string input 
     */
    public Venue createVenue(String venueType) {
        if (venueType.equals("Arena")) {
            return new Arena();
        } else if (venueType.equals("Auditorium")) {
            return new Auditorium();
        } else if (venueType.equals("Stadium")) {
            return new Stadium();
        } else {
            return new OpenAir();
        }
    }
}
