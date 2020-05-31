package serviceimpl;

import exception.ErrorCode;
import model.*;
import server.ServerException;
import service.CarService;

import java.util.Iterator;
import java.util.Map;

public class CarServiceImpl implements CarService {

    @Override
    public AreaPark parkingStart(AreaPark park, Car car, Pay pay) throws ServerException {
        if (park.getPlaces().containsKey(car)) throw new ServerException(ErrorCode.CAR_IS_PARKING);
        for (Map.Entry<Car, Place> entry : park.getPlaces().entrySet()) {
            if ((entry.getValue().getPlaceType().equals(TypeCar.PASSENGER) || entry.getValue().getPlaceType().equals(car.getCarType())) && entry.getValue().getFreeStatus())
                entry.getValue().setPlacePay(pay);
                park.getPlaces().put(car,entry.getValue());
        }
        if (park.getPlaces().containsKey(car)) throw new ServerException(ErrorCode.AREA_HAVE_NOT_PLACE);
        return park;
    }

    @Override
    public AreaPark parkingEnd(AreaPark park, Car car) throws ServerException {
        if (!park.getPlaces().containsKey(car)) throw new ServerException(ErrorCode.CAR_IS_NOT_PARKING);
        Iterator<Map.Entry<Car, Place>> entryIterator = park.getPlaces().entrySet().iterator();
        while (entryIterator.hasNext()) {
            entryIterator.remove();
        }
        return park;
    }
}
