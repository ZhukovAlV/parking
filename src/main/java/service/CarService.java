package service;

import model.AreaPark;
import model.Car;
import model.Pay;
import server.ServerException;

public interface CarService {
    AreaPark parkingStart (AreaPark park, Car car, Pay pay) throws ServerException;
    AreaPark parkingEnd (AreaPark park, Car car) throws ServerException;
}
