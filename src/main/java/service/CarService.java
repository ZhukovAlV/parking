package service;

import model.Car;
import model.Pay;
import model.Place;
import server.ServerException;

import java.util.Map;

public interface CarService {
    Map<Place, Car> parkingStart (Map<Place, Car> map, Car car, Pay pay) throws ServerException;
    Map<Place, Car> parkingEnd (Map<Place, Car> map, Car car) throws ServerException;
}
