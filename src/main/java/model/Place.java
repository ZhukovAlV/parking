package model;

public class Place {
    Boolean isFreeStatus;
    private int placeNum;
    private TypeCar placeType;

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
}
