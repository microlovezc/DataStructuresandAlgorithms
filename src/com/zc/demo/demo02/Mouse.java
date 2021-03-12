package com.zc.demo.demo02;

import java.util.HashMap;

public  class Mouse implements Usb{

    /**
     * 开启usb设备
     */
    @Override
    public void turnOn() {
        System.out.println("打开鼠标！");
    }

    public void turnOn(int i) {
        System.out.println("打开鼠标！");
    }


    /**
     * 关闭usb设备
     */
    @Override
    public void turnOff() {
        System.out.println("关闭鼠标！");
    }

    public void click(){
        System.out.println("点击！");
    }
}
