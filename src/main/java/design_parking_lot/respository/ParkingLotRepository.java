package design_parking_lot.respository;

import design_parking_lot.model.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {
    private Map<Long, ParkingLot> parkingLots = new HashMap<>();


    public ParkingLot getParkingLot(Long id ) {
        return parkingLots.get(id);
    }

}
