package com.myproject;

public class Main {
    public static void main(String[] args) {

        Trees newPlant = new Trees("Oak", 5);
        newPlant.getSpecies();
        newPlant.getAge();

        Oak newOak = new Oak(10, "bumpy", "Oak", 5);
        newOak.data();
        newOak.fall();
    }
}