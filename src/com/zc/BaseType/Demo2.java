package com.zc.BaseType;
/*
* 基本类型与字符串类型之间的相互转换
* 基本类型-》字符串（String）
*   1.基本类型+"";
*   2.包装类的静态方法toString（参数），不是Object的toString方法
*   3.String类的静态方法valueOf（参数）
* 字符串（String）-》基本类型
*   1.使用包装类的静态方法parseXXX（“数值类型的字符串”）；
*           Integer类；static int parseInt（String s）
*           Double类；static int parseDouble（String s）
* */
public class Demo2 {
    public static void main(String[] args) {
        int i = 1;
        String s1 = i + "";
        System.out.println(s1 + 200);

        String s = Integer.toString(i);
        System.out.println(s+200);

        String s2 = String.valueOf(i);
        System.out.println(s2+2000);

        Integer.parseInt(s2);
        Double.parseDouble(s2);
    }
}
