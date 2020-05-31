package model;

import java.util.Date;

public class Pay {
    private double paySum;
    private Date payDate;

    public Pay(double paySum, Date payDate) {
        this.paySum = paySum;
        this.payDate = payDate;
    }

    public double getPaySum() {
        return paySum;
    }

    public void setPaySum(double paySum) {
        this.paySum = paySum;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }
}
