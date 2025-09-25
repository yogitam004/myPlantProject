package com.myproject;

public class Trees {

    //attributes
    public String species;
    public int age;

    //constructors
    public Trees(String species,int age) {
        this.species = species;
        this.age = age;
    }

    //behaviors

    public void getSpecies() {
        System.out.println("This tree is a " + species);
    }

    public void getAge() {
        System.out.println("This tree is " + age + "years old.")
    }
    
    }