package org.hamming.factory;

public abstract class Coffee {
    protected String name;
    protected int strength;

    public abstract void prepare();

    public void display() {
        System.out.println("Preparing " + name + " (Strength: " + strength + "/10)");
    }
}
