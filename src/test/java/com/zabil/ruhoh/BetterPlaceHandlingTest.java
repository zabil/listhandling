package com.zabil.ruhoh;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BetterPlaceHandlingTest {

    private Places places;

    @Before
    public void setUp() throws Exception {
        places = new Places();
        places.add("London", "Capital of England");
        places.add("Washington DC", "Capital of USA");
    }

    @Test
    public void findPlace() throws Exception {
        Place place = places.find("London");
        assertThat(place.name, is("London"));
        assertThat(place.description, is("Capital of England"));
    }

    @Test(expected = PlaceNotFoundException.class)
    public void placeNotFound() throws Exception {
        places.find("Atlantis");
    }

}
