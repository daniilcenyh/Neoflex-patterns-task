package org.hamming.adapter;

public class MemoryCard {
    private String data;

    public MemoryCard() {
        this.data = "Important photos and documents";
    }

    public void readFromCard() {
        System.out.println("MemoryCard: Reading data from memory card...");
    }

    public String getCardData() {
        return data;
    }
}
