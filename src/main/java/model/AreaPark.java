package model;

import java.util.HashMap;
import java.util.Map;

public class AreaPark {
    Map<Place, Car> places = new HashMap<>();

    public Map<Place, Car> getPlaces() {
        return places;
    }

    public void setPlaces(Map<Place, Car> places) {
        this.places = places;
    }
}
