package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int number=1;
        Tram t1=new Tram(number,60,100,"Valentina","Детский центр", "ул. Краснознаменская", "Аллея Героев", "ул. Комсомольская", "ул. Порт-Саида");
        System.out.println("Вместимость="+t1.getMaxPlaces());
        System.out.println("Оборот="+t1.getOborot());
    t1.addPassangers(55);
        System.out.println("Пассажиров="+t1.getPassangers());
        System.out.println("Оборот="+t1.getOborot());
        t1.addPassangers(45);
        System.out.println("Пассажиров="+t1.getPassangers());
        System.out.println("Оборот="+t1.getOborot());
        t1.subPassangers(46);
        System.out.println("Пассажиров="+t1.getPassangers());
        System.out.println("Оборот="+t1.getOborot());
        t1.addPassangers(45);
        System.out.println("Пассажиров="+t1.getPassangers());
        System.out.println("Оборот="+t1.getOborot());
    }
}
