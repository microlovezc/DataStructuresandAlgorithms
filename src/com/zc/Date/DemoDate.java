package com.zc.Date;

import java.util.Date;

public class DemoDate {
    public static void main(String[] args) {
        /*
        * 获取1970到现在时间得毫秒数
        * */
        System.out.println(System.currentTimeMillis());

        demo3();

    }
    /*
    * 获取当前日期
    * */
    public static void demo1(){
        Date date = new Date();
        System.out.println(date);
    }

    /*
    * Date(long date)传递毫秒值，将毫秒值转换为Date日期
    * */
    public static void demo2(){
        Date date = new Date(0L);
        System.out.println(date);

        date = new Date(1614919209052L);
        System.out.println(date);
    }
    /*
    * getTime()把日期转换为毫秒值
    * */
    public static void demo3(){
        Date date = new Date();
        System.out.println(date.getTime());

    }


}
