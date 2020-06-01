package serviceimpl;

import model.Pay;
import service.PayService;

import java.time.LocalTime;

public class PayServiceImpl implements PayService {

    @Override
    public Pay paySum(LocalTime time) {
        if (time.getHour() >= 9 && time.getHour() <= 18) return new Pay(100.0);
        else return new Pay(50.0);
    }
}
