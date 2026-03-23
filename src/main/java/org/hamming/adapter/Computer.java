package org.hamming.adapter;

public class Computer {
    public void readUSB(USB usbDevice) {
        System.out.println("Computer: Reading from USB device...");
        usbDevice.readFromUSB();
        System.out.println("Computer: Data received: " + usbDevice.getData());
    }
}
