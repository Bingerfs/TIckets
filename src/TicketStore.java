import java.util.ArrayList;

public class TicketStore {
    private ArrayList<Event> availableEvents = null;
    public TicketStore(ArrayList<Event> availableEvents){
        this.availableEvents = availableEvents;
    }

    private Boolean isEventAvailable(Event event){
        return availableEvents.contains(event);
    }


    public void buyTicket(Event event, String ticketType){
        if(isEventAvailable(event))
            event.buyTicket(ticketType);
        else
            System.out.println("event not available");
    }
}
