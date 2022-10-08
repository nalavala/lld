package design_parking_lot.controller;

import design_parking_lot.model.Ticket;
import design_parking_lot.model.Vehicle;

public class TicketCreateResponseDTO {

    private Ticket ticket;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
