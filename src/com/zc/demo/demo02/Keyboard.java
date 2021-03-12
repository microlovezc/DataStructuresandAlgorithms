package com.zc.demo.demo02;

public class Keyboard implements Usb{
    /**
     * 开启usb设备
     */
    @Override
    public void turnOn() {
        System.out.println("打开键盘！");
    }

    /**
     * 关闭usb设备
     */
    @Override
    public void turnOff() {
        System.out.println("关闭键盘！");
    }

    public void input(){
        System.out.println("打字！");
    }
}
