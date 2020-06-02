package parking;

import model.Pay;
import org.junit.Assert;
import org.junit.Test;
import service.PayService;
import serviceimpl.PayServiceImpl;

import java.time.LocalTime;

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
