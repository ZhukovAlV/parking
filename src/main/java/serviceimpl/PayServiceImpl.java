package serviceimpl;

import model.Pay;
import service.PayService;

import java.util.Date;

public class PayServiceImpl implements PayService {

    @Override
    public Pay paySum(Date date) {
        if (date.after(new Date())) return new Pay(100.0, date);
        else return new Pay(50.0, date);
    }
}
