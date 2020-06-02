package parking;

import model.Car;
import model.Pay;
import model.Place;
import model.TypeCar;
import org.junit.Assert;
import org.junit.Test;
import server.ServerException;
import service.CarService;
import service.PayService;
import serviceimpl.CarServiceImpl;
import serviceimpl.PayServiceImpl;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class TestPay {

    /*    Реализуем кейс
    1. Время после 18-00, поэтому сумма 50 руб
    2. Время в интервале c 9-00 до 18-00, поэтому сумма 100 руб
     */
    @Test
    public void startPay() {
        PayService payService = new PayServiceImpl();
        Pay pay = new Pay(50.0);
        Assert.assertEquals(payService.paySum(LocalTime.of(23, 15, 11, 22)).getPaySum(),pay.getPaySum(),0.0);
        pay.setPaySum(100.0);
        Assert.assertEquals(payService.paySum(LocalTime.of(10, 15, 11, 22)).getPaySum(),pay.getPaySum(),0.0);
    }
}
