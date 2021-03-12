package com.zc.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的出生年月日：");
        String str = scanner.next();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = simpleDateFormat.parse(str);
        long i=(new Date().getTime()-parse.getTime())/86400000L;
        System.out.println(i);


    }

}
