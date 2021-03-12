package com.zc.demo.demo02;

public class Computer {

    public void powerOn(){
        System.out.println("开机！");
    }

    public void powerOff(){
        System.out.println("关机！");
    }

    public void useDevice(Usb usb){
        usb.turnOn();
        if (usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }else if (usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard) usb;
            keyboard.input();
        }
        usb.turnOff();
    }

}
