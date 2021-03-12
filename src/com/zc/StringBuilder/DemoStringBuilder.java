package com.zc.StringBuilder;

public class DemoStringBuilder {
    public static void main(String[] args) {
        StringBuilder strA = new StringBuilder();
        StringBuilder strB = new StringBuilder("strB");
        System.out.println("strB:"+strB);
        strB.append("abc");//返回的是this，调用方法的对象strB,this==strB
        System.out.println("strB:"+strB);

        /*
        * 链式编程
        * */
        strB.append(1).append('c').append("f");
    }
}
