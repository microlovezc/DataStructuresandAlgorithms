package com.zc.BaseType;

import static com.zc.Date.DemoDateFormat.demo;

public class DemoBase {
    public static void main(String[] args) {
//        demo();
        demo1();
    }

    private static void demo1() {
        //自动装箱和自动拆箱  jdk1.5以后出现的新特性
        /*
        * 自动装箱
        * */
        Integer in=1;//直接把int类型的整数赋值包装类 Integer in=1; ==   Integer in=new Integer(1);
        /*
        * 自动拆箱
        * */
        in = in + 2; //in是包装类，无法直接参与运算，可以自动转换为基本数据类型；在进行计算 in + 2 相当于 in.initValue() + 2

    }

    private static void demo() {
        //装箱
        Integer integer = new Integer(1);
        Integer integer1 = new Integer("1111"); //构造方法装箱
        System.out.println(integer);
        System.out.println(integer1);
        Integer integer2 = Integer.valueOf(2);
        Integer integer3 = Integer.valueOf("2222");//静态方法装箱
        System.out.println(integer2);
        System.out.println(integer3);
        //拆箱：在包装类中取出基本类型的数据
        int i = integer.intValue();
        System.out.println(i);
    }
}
