package model;

public class Car {
    private String carNum;
    private TypeCar carType;

	public Car(String carNum, TypeCar carType) {
		this.carNum = carNum;
		this.carType = carType;
	}

	public String getCarNum() {
		return carNum;
	}

	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}

	public TypeCar getCarType() {
		return carType;
	}

	public void setCarType(TypeCar carType) {
		this.carType = carType;
	}
}
