package com.zabil.ruhoh;

public class Place {
    protected final String name;
    protected final String description;

    public Place(String name, String description) {
        this.name = name;
        this.description = description;
    }

}

class PlaceNotFoundException extends RuntimeException {
}