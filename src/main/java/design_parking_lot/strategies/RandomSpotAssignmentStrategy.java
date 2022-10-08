package design_parking_lot.strategies;

import design_parking_lot.model.*;

public class RandomSpotAssignmentStrategy implements SpotAllotmentStrategy {

    @Override
    public ParkingSpot getAvailableParkingSpot(SpotType type, ParkingLot parkingLot) {
        for(ParkingFloor floors : parkingLot.getFloors()) {
            for(ParkingSpot spot : floors.getParkingSpots()) {
                if(spot.getType() == type && spot.getStatus() == ParkingSpotStatus.AVAILABLE) {
                    return spot;
                }
            }
        }
        return null;
    }
}
