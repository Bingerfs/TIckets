import java.util.ArrayList;
import java.util.Map;

public class EventA implements Event {
    private Map<String, Integer> ticketStock = null;
    private ArrayList<Ticket> soldTickets = null;

    public EventA(Map<String, Integer> ticketStock){
        this.ticketStock = ticketStock;
        this.soldTickets = new ArrayList<Ticket>();
    }

    @Override
    public void buyTicket(String ticketType) {
        try {
            Integer newTicketQuantity = ticketStock.get(ticketType) - 1;
            ticketStock.put(ticketType, newTicketQuantity);
            FactoryTicket factoryTicket = new FactoryTicket();  
            soldTickets.add(factoryTicket.get(ticketType));
        } catch (Exception e) {
            System.out.println("Error while buying");
        }
    }
    
}
