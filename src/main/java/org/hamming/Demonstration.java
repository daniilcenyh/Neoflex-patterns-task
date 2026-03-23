package org.hamming;

import org.hamming.adapter.Computer;
import org.hamming.adapter.MemoryCard;
import org.hamming.adapter.MemoryCardAdapter;
import org.hamming.adapter.USB;
import org.hamming.factory.Coffee;
import org.hamming.factory.CoffeeFactory;
import org.hamming.proxy.DataBase;
import org.hamming.proxy.PostgreSqlProxy;
import org.hamming.singleton.Logger;

public class Demonstration {
    public static void main(String[] args) {
        System.out.println("Singleton Pattern: ");
        Logger logger = Logger.getInstance();
        logger.classLog(new Demonstration(), "Application started");
        logger.classLog(new Demonstration(), "User logged in");

        System.out.println("\nFactory Pattern: ");
        Coffee espresso = CoffeeFactory.createCoffee("espresso");
        espresso.prepare();

        Coffee americano = CoffeeFactory.createCoffee("americano");
        americano.prepare();

        System.out.println("\nAdapter Pattern: ");
        Computer computer = new Computer();
        MemoryCard memoryCard = new MemoryCard();
        USB adapter = new MemoryCardAdapter(memoryCard);
        computer.readUSB(adapter);

        System.out.println("\nProxy Pattern: ");
        DataBase postgreSqlProxy = new PostgreSqlProxy("user_db");
        System.out.println("Getting connection URL through proxy: " + postgreSqlProxy.getConnectionUrl());
        postgreSqlProxy.connect();
    }
}
