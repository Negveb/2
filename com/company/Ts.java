package com.company;

public interface Ts {
    int getMaxSpeed();
    int getMaxPlaces();
    default int freePlaces(int places,int a){
        return places-a;
    }
}
