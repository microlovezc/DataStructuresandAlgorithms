package com.zc.StringBuilder;

public class StringBuilderToString {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("avaca");//将String转换为StringBuilder
        String s = stringBuilder.toString();  //将StringBuilder转换为String
        System.out.println(s);
    }
}
