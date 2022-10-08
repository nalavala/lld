package design_parking_lot.controller;

import design_parking_lot.model.Ticket;
import design_parking_lot.service.TicketService;

public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public TicketCreateResponseDTO createTicket(TicketCreateDTO ticketCreateDTO) {
        Ticket ticket = ticketService.createTicket(ticketCreateDTO.getParkingSLotId(), ticketCreateDTO.getVehicle(), ticketCreateDTO.getOperator(), ticketCreateDTO.getGate());
        TicketCreateResponseDTO ticketCreateResponseDTO = new TicketCreateResponseDTO();
        ticketCreateResponseDTO.setTicket(ticket);
        return ticketCreateResponseDTO;
    }
}
