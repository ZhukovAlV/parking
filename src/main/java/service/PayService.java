package service;

import model.Pay;

import java.time.LocalTime;

public interface PayService {
    Pay paySum (LocalTime time);
}
