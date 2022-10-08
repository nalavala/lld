package design_parking_lot.strategies;

import design_parking_lot.model.ParkingLot;
import design_parking_lot.model.ParkingSpot;
import design_parking_lot.model.SpotType;
import design_parking_lot.model.VehicleType;

public interface SpotAllotmentStrategy {

    ParkingSpot getAvailableParkingSpot(SpotType type, ParkingLot parkingLot);
}
