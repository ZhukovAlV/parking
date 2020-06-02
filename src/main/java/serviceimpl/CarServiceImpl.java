package serviceimpl;

import exception.ErrorCode;
import model.*;
import server.ServerException;
import service.CarService;

import java.util.Map;

public class CarServiceImpl implements CarService {

    @Override
    public  Map<Place, Car> parkingStart (Map<Place, Car> map, Car car) throws ServerException {
        if (map.containsValue(car)) throw new ServerException(ErrorCode.CAR_IS_PARKING);
        for (Place place : map.keySet()) {
            if (place.getPlaceType().equals(car.getCarType()) && place.getFreeStatus()) {
                map.replace(place,car);
                place.setFreeStatus(false);
                break;
            }
        }
        if (!map.containsValue(car) && car.getCarType().equals(TypeCar.PASSENGER))  {
            for (Place place : map.keySet()) {
                if (place.getFreeStatus()) {
                    map.replace(place,car);
                    place.setFreeStatus(false);
                    break;
                }
            }
        }
        if (!map.containsValue(car)) throw new ServerException(ErrorCode.AREA_HAVE_NOT_PLACE);
        return map;
    }

    @Override
    public  Map<Place, Car> parkingEnd (Map<Place, Car> map, Car car) throws ServerException {
        if (!map.containsValue(car)) throw new ServerException(ErrorCode.CAR_IS_NOT_PARKING);
        for (Map.Entry<Place, Car> entry :  map.entrySet()) {
            if (entry.getValue() != null && entry.getValue().equals(car)) {
                entry.getKey().setFreeStatus(true);
                map.replace(entry.getKey(),null);
            }
        }
        if (map.containsValue(car)) throw new ServerException(ErrorCode.CAR_PARKING_END_ERROR);
        return map;
    }
}
