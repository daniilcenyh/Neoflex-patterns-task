package org.hamming.factory;

public class CoffeeFactory {
    public static Coffee createCoffee(String type) {
        return switch (type.toLowerCase()) {
            case "espresso" -> new Espresso();
            case "americano" -> new Americano();
            default -> throw new IllegalArgumentException("Unknown coffee type: " + type);
        };
    }
}