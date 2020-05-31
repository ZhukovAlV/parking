package model;

import java.util.HashMap;
import java.util.Map;

public class AreaPark {
    Map<Car,Place> places = new HashMap<>();

    public Map<Car, Place> getPlaces() {
        return places;
    }

    public void setPlaces(Map<Car, Place> places) {
        this.places = places;
    }
}
