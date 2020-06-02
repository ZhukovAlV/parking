package parking;

import model.Car;
import model.TypeCar;
import model.Place;
import org.junit.Assert;
import org.junit.Test;
import server.Server;
import server.ServerException;
import service.CarService;
import service.PayService;
import serviceimpl.CarServiceImpl;
import serviceimpl.PayServiceImpl;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class TestParking {

    /*    Реализуем кейс
    1. приехала легковая машина
    2. запарковалась на место
    3. приехала еще одна, но мест нет
    4. приехала грузовая машина
    5. запарковалась на место
    6. парковка легковой машины закончилась
    7. легковая оплатила парковку и уехала*/

    /*    Реализуем кейс
    1. приехала легковая машина
    2. запарковалась на место
    3. легковая завершила парковку и освободила место
    */
    @Test
    public void startParking() throws ServerException {
        Server.startServer();
        Map<Place, Car> map = new HashMap<>();
        map.put(new Place(1, TypeCar.PASSENGER),null);
        map.put(new Place(2, TypeCar.PASSENGER),null);
        map.put(new Place(3, TypeCar.PASSENGER),null);
        map.put(new Place(4, TypeCar.TRUCK),null);
        map.put(new Place(5, TypeCar.TRUCK),null);
        Car car1 = new Car("A777AA" ,TypeCar.PASSENGER);
        CarService carService = new CarServiceImpl();
        PayService payService = new PayServiceImpl();
        LocalTime time = LocalTime.now();
        carService.parkingStart(map,car1,payService.paySum(time));
        Assert.assertTrue(map.containsValue(car1));
        carService.parkingEnd(map,car1);
        Assert.assertFalse(map.containsValue(car1));
    }



}
