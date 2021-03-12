package com.zc.Calendar;

import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Calendar;

import static com.zc.Date.DemoDate.demo3;

public class DemoCalendar {

    public static void main(String[] args) {

//        demo();
//        demo1();
//        demo2();
        demo3();
    }

    private static void demo3() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR,2);
        System.out.println(calendar.get(Calendar.YEAR));
        calendar.add(Calendar.YEAR,-3);
        System.out.println(calendar.get(Calendar.YEAR));
    }

    private static void demo2() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,2088);
        System.out.println(calendar.get(Calendar.YEAR));

        calendar.set(2088,8,8,12,25);

    }

    private static void demo1() {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(Calendar.YEAR);
        System.out.println(i);
        System.out.println(calendar.get(Calendar.MONTH)+1);

    }

    private static void demo() {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(calendar.getTime());

        System.out.println(format);

    }
}
