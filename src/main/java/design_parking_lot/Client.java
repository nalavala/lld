package design_parking_lot;

import design_parking_lot.controller.TicketController;
import design_parking_lot.controller.TicketCreateDTO;
import design_parking_lot.controller.TicketCreateResponseDTO;
import design_parking_lot.model.DisplayBoard;
import design_parking_lot.model.EntryGate;
import design_parking_lot.model.Vehicle;
import design_parking_lot.respository.ParkingLotRepository;
import design_parking_lot.respository.TicketRepository;
import design_parking_lot.service.TicketService;
import design_parking_lot.strategies.RandomSpotAssignmentStrategy;
import design_parking_lot.strategies.SpotAllotmentStrategy;

public class Client {
    public static void main(String[] args) {
        ObjectRegistry.put("parkingLotRepository", new ParkingLotRepository());
        ObjectRegistry.put("ticketRepository", new TicketRepository());
        ObjectRegistry.put("SpotAllotmentStrategy", new RandomSpotAssignmentStrategy());
        ObjectRegistry.put("ticketService", new TicketService(
                (ParkingLotRepository) ObjectRegistry.get("parkingLotRepository"),
                (TicketRepository) ObjectRegistry.get("ticketRepository"),
                (SpotAllotmentStrategy) ObjectRegistry.get("SpotAllotmentStrategy")
        ));
        ObjectRegistry.put("ticketController", new TicketController(
                (TicketService) ObjectRegistry.get("ticketService")
        ));


        TicketCreateDTO ticketCreateDTO = new TicketCreateDTO();
        ticketCreateDTO.setVehicle(new Vehicle());
        ticketCreateDTO.setGate(new EntryGate(new DisplayBoard()));
        ticketCreateDTO.setParkingSLotId(2343l);

        TicketController ticketController = (TicketController)ObjectRegistry.get("ticketController");
        TicketCreateResponseDTO ticketCreateResponseDTO =  ticketController.createTicket(ticketCreateDTO);


    }
}
