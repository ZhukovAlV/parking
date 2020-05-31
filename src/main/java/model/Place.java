package model;

public class Place {
    private Boolean isFreeStatus;
    private int placeNum;
    private TypeCar placeType;
    private Pay placePay;

    public Boolean getFreeStatus() {
        return isFreeStatus;
    }

    public void setFreeStatus(Boolean freeStatus) {
        isFreeStatus = freeStatus;
    }

    public int getPlaceNum() {
        return placeNum;
    }

    public void setPlaceNum(int placeNum) {
        this.placeNum = placeNum;
    }

    public TypeCar getPlaceType() {
        return placeType;
    }

    public void setPlaceType(TypeCar placeType) {
        this.placeType = placeType;
    }

    public Pay getPlacePay() {
        return placePay;
    }

    public void setPlacePay(Pay placePay) {
        this.placePay = placePay;
    }
}
