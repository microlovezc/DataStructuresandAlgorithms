package com.zc.demo.demo02;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Mouse usb = new Mouse();
        Usb usb2 = new Keyboard();
        computer.powerOn();

        computer.useDevice(usb);
        computer.useDevice(usb2);

        computer.powerOff();

    }
}
