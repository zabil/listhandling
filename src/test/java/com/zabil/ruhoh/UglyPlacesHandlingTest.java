package com.zabil.ruhoh;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UglyPlacesHandlingTest {

    private List<Place> places;
    private Place london;

    @Before
    public void setUp() throws Exception {
        london = new Place("London", "Capital of England");
        Place washingtonDc = new Place("Washington DC", "Capital of USA");
        places = new ArrayList<Place>();
        places.add(london);
        places.add(washingtonDc);
    }

    @Test
    public void findPlace() throws Exception {
        Place place = null;
        for (Place availablePlace : places) {
            if (availablePlace.name.equals("London")) {
                place = availablePlace;
            }
        }
        assertThat(place, is(london));
    }

    @Test(expected = PlaceNotFoundException.class)
    public void placeNotFound() throws Exception {
        Place place = null;
        for (Place availablePlace : places){
            if(availablePlace.name.equals("Atlantis")){
                place = availablePlace;
            }
        }
        if(place == null){
            throw new PlaceNotFoundException();
        }
    }

}
