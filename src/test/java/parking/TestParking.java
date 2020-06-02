package parking;

import model.Car;
import model.TypeCar;
import model.Place;
import org.junit.Assert;
import org.junit.Test;
import server.ServerException;
import service.CarService;
import serviceimpl.CarServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class TestParking {

    /*    Реализуем кейс
    1. приехала легковая машина
    2. запарковалась на место
    3. легковая завершила парковку и освободила место
    */
    @Test
    public void startParkingPassenger() throws ServerException {
        Map<Place, Car> map = new HashMap<>();
        map.put(new Place(1, TypeCar.PASSENGER),null);
        map.put(new Place(2, TypeCar.PASSENGER),null);
        map.put(new Place(3, TypeCar.PASSENGER),null);
        map.put(new Place(4, TypeCar.TRUCK),null);
        map.put(new Place(5, TypeCar.TRUCK),null);
        Car car1 = new Car("A111AA" ,TypeCar.PASSENGER);
        CarService carService = new CarServiceImpl();
        carService.parkingStart(map,car1);
        Assert.assertTrue(map.containsValue(car1));
        carService.parkingEnd(map,car1);
        Assert.assertFalse(map.containsValue(car1));
    }

    /*    Реализуем кейс
    1. приехали 3 грузовых машины
    2. запарковались 2 из них
    3. при парковке 3 грузовой машины ошибка - мест нет
    */
    @Test(expected = ServerException.class)
    public void startParkingTruck() throws ServerException {
        Map<Place, Car> map = new HashMap<>();
        map.put(new Place(1, TypeCar.PASSENGER),null);
        map.put(new Place(2, TypeCar.PASSENGER),null);
        map.put(new Place(3, TypeCar.PASSENGER),null);
        map.put(new Place(4, TypeCar.TRUCK),null);
        map.put(new Place(5, TypeCar.TRUCK),null);
        Car car1 = new Car("A111AA" ,TypeCar.TRUCK);
        Car car2 = new Car("A222AA" ,TypeCar.TRUCK);
        Car car3 = new Car("A333AA" ,TypeCar.TRUCK);
        CarService carService = new CarServiceImpl();
        carService.parkingStart(map,car1);
        carService.parkingStart(map,car2);
        carService.parkingStart(map,car3);
    }

    /*    Реализуем кейс
    1. приехали 4 пассажирских машины
    2. запарковались 3 из них на пассажирские места
    3. при парковке 4 пассажирской машины было свободно место для грузовой, поэтому ее на это место запаркавали
    */
    @Test
    public void startParkingPassToTruck() throws ServerException {
        Map<Place, Car> map = new HashMap<>();
        map.put(new Place(1, TypeCar.PASSENGER),null);
        map.put(new Place(2, TypeCar.PASSENGER),null);
        map.put(new Place(3, TypeCar.PASSENGER),null);
        map.put(new Place(4, TypeCar.TRUCK),null);
        map.put(new Place(5, TypeCar.TRUCK),null);
        Car car1 = new Car("A111AA" ,TypeCar.PASSENGER);
        Car car2 = new Car("A222AA" ,TypeCar.PASSENGER);
        Car car3 = new Car("A333AA" ,TypeCar.PASSENGER);
        Car car4 = new Car("A444AA" ,TypeCar.PASSENGER);
        CarService carService = new CarServiceImpl();
        carService.parkingStart(map,car1);
        carService.parkingStart(map,car2);
        carService.parkingStart(map,car3);
        carService.parkingStart(map,car4);
    }
}
