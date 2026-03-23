package org.hamming.factory;

public class Espresso extends Coffee {

    public Espresso() {
        this.name = "Espresso";
        this.strength = 10;
    }

    @Override
    public void prepare() {
        System.out.println("Making strong espresso with high pressure...");
        display();
    }
}
