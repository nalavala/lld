package design_parking_lot.controller;

import design_parking_lot.model.EntryGate;
import design_parking_lot.model.Operator;
import design_parking_lot.model.Vehicle;

public class TicketCreateDTO {
    private Vehicle vehicle;
    private EntryGate gate;
    private Operator operator;

    private Long parkingSLotId;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public EntryGate getGate() {
        return gate;
    }

    public void setGate(EntryGate gate) {
        this.gate = gate;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Long getParkingSLotId() {
        return parkingSLotId;
    }

    public void setParkingSLotId(Long parkingSLotId) {
        this.parkingSLotId = parkingSLotId;
    }
}
