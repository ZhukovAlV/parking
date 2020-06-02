package model;

public class Place {
    private int placeNum;
    private TypeCar placeType;
    private Boolean isFreeStatus;

    public Place(int placeNum, TypeCar placeType) {
        this.placeNum = placeNum;
        this.placeType = placeType;
        this.isFreeStatus = true;
    }

    public Place(int placeNum, TypeCar placeType, Boolean isFreeStatus) {
        this.placeNum = placeNum;
        this.placeType = placeType;
        this.isFreeStatus = isFreeStatus;
    }

    public int getPlaceNum() {
        return placeNum;
    }

    public void setPlaceNum(int placeNum) {
        this.placeNum = placeNum;
    }

    public Boolean getFreeStatus() {
        return isFreeStatus;
    }

    public void setFreeStatus(Boolean freeStatus) {
        isFreeStatus = freeStatus;
    }

    public TypeCar getPlaceType() {
        return placeType;
    }

    public void setPlaceType(TypeCar placeType) {
        this.placeType = placeType;
    }
}
