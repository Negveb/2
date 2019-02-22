package com.company;

public abstract class PublicTransport implements Ts {
    private int number;
    private int maxSpeed;
    private int maxPlaces;
    private String[] stations;

    public int getNumber() {
        return number;
    }

    PublicTransport(int number, int maxSpeed, int maxPlaces, String... stations) {
        this.number = number;
        this.maxSpeed = maxSpeed;
        this.maxPlaces = maxPlaces;
        this.stations = stations;

    }

    @Override
    public int getMaxPlaces() {
        return maxPlaces;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }


    public String whatStationIs(int i) {
        return stations[i];
    }
}
