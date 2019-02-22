package com.company;

public class Tram extends PublicTransport {
    private String conductor;
    private int passangers = 0;
    static int oborot = 0;

    Tram(int number, int maxSpeed, int maxPlaces, String conductor, String... stations) {
        super(number, maxSpeed, maxPlaces, stations);
        this.conductor = conductor;
    }

    public int getPassangers(){
        return passangers;
    };
    public void addPassangers(int k) {
        if (passangers+k <= getMaxPlaces()) {
            this.passangers += k;
            oborot += k;
        } else System.out.println("Мест нет");
    }

    public void subPassangers(int k) {
        if (passangers - k > 0) {
            addPassangers(-k);
            oborot+=k;
        } else System.out.println("Отрицательное количетво пассажиров");
    }

    public int getOborot() {
        return oborot;
    }

}