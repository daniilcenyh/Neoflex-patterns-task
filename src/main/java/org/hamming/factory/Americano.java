package org.hamming.factory;

public class Americano extends Coffee {
    public Americano() {
        this.name = "Americano";
        this.strength = 6;
    }

    @Override
    public void prepare() {
        System.out.println("Making espresso with added hot water...");
        display();
    }
}
