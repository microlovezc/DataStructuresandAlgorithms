package com.zc.HashCode;
/*
*   哈希值：是一个十进制的整数，由系统随机给出
*   native:调用本地操作系统的方法
*
* */
public class HashCode {
    public static void main(String[] args) {
        /*
        * String类的哈希值
        *   String类重写了Object类的hashcode方法
        * */
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
