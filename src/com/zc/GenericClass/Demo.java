package com.zc.GenericClass;

public class Demo {

    /*
     * 含有泛型的方法
     * */
    public <S> void demo(S s){
        System.out.println(s);
    }
    /*
       * 含有泛型的静态方法
       * */
    public static <S> void demo1(S s){
        System.out.println(s);
    }
}
