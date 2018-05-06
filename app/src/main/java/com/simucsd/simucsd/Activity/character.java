package com.simucsd.simucsd.Activity;

public class character {
    double GPA = 4.0;
    double height = 175.0;
    double weight = 70.0;

    int mood = 100;
    int health = 100;

    int relationship = 100;
    int friendship = 100;

    String name;
    boolean male;
    boolean gay;

    int IQ;
    int EQ;
    int money;
    int attraction;

    final int totalpoints1 = 100;
    final int totalpoints2 = 75;
    final int totalpoints3 = 50;

    character(){

    }

    character(String name){

        this.name = name;
    }

    character(String name, boolean male, int IQ, int EQ, int money, int attraction){
        this.name = name;
        this.male = male;
        this.IQ = IQ;
        this.EQ = EQ;
        this.money = money;
        this.attraction = attraction;
    }

    void IQup(int a){
        IQ += a;
    }

    void IQdown(int a){
        IQ -= a;
    }

    void EQup(int a){
        EQ += a;
    }

    void EQdown(int a){
        EQ -= a;
    }

    void attractionup(int a){
        attraction += a;
    }

    void attractiondown(int a){
        attraction -= a;
    }

    void moneyup(int a){
        money += a;
    }

    void moneydown(int a){
        money -= a;
    }

}
