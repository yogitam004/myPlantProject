package com.myproject;

public class Oak extends Trees {

    //attributes
    private int branches;
    private String texture;

    //constructor

    public Oak(int age, String texture, String species, int branches) {
        super(species, age);
        this.texture = texture;
        this.branches = branches;
    }

    //behaviors

    public void data() {
        System.out.println("This" + species + " tree is " + age + " years old." + " It is " + texture + " and has " + branches + " branches.");
    }

    public void fall() {
        System.out.println("The" + species + " tree has dropped all of its branches: " + branches);
    }

}