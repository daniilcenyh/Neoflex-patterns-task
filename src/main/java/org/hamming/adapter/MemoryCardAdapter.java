package org.hamming.adapter;

public class MemoryCardAdapter implements USB{
    private MemoryCard memoryCard;

    public MemoryCardAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void readFromUSB() {
        memoryCard.readFromCard();
    }

    @Override
    public String getData() {
        return memoryCard.getCardData();
    }
}
