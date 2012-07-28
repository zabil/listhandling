package com.zabil.ruhoh;

import java.util.ArrayList;
import java.util.List;

public class Places {

    private final List<Place> places;

    public Places() {
        places = new ArrayList<Place>();
    }

    public void add(String place, String description) {
        places.add(new Place(place, description));
    }

    public Place find(String name) {
        for(Place place: places){
            if(place.name.equals(name)){
                return place;
            }
        }
        throw new PlaceNotFoundException();
    }
}
