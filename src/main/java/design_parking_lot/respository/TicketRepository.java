package design_parking_lot.respository;

import design_parking_lot.model.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {

    private Map<Long, Ticket> ticketMap = new HashMap<>();
    private long counter = 1;

    public Ticket createTicket(Ticket ticket) {
        counter++;
        ticket.setId(counter);
        ticketMap.put(counter, ticket);
        return ticket;
    }
}
