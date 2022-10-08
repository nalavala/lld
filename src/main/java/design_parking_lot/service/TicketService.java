package design_parking_lot.service;

import design_parking_lot.model.*;
import design_parking_lot.respository.ParkingLotRepository;
import design_parking_lot.respository.TicketRepository;
import design_parking_lot.strategies.SpotAllotmentStrategy;

public class TicketService {
    private ParkingLotRepository parkingLotRepository;
    private TicketRepository ticketRepository;

    private SpotAllotmentStrategy spotAllotmentStrategy;

    public TicketService(ParkingLotRepository parkingLotRepository, TicketRepository ticketRepository, SpotAllotmentStrategy spotAllotmentStrategy) {
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
        this.spotAllotmentStrategy = spotAllotmentStrategy;
    }

    public Ticket createTicket(Long parkingLotId, Vehicle vehicle, Operator operator, EntryGate entryGate) {


        ParkingLot parkingLot = parkingLotRepository.getParkingLot(parkingLotId);
        ParkingSpot availableParkingSpot = spotAllotmentStrategy.getAvailableParkingSpot(getSpotTypeFromVehicle(vehicle), parkingLot);
        Ticket ticket = new Ticket();
        ticket.setOperator(operator);
        ticket.setParkingLot(parkingLot);
        ticket.setEntryGate(entryGate);
        ticket.setSpot(availableParkingSpot);

        return  ticketRepository.createTicket(ticket);
    }


    private SpotType getSpotTypeFromVehicle(Vehicle vehicle) {
        switch (vehicle.getType()) {
            case BIKE:
                return SpotType.SMALL;
            case CAR:
                return SpotType.MEDIUM;
            default:
                return SpotType.MEDIUM;
        }

    }
}
