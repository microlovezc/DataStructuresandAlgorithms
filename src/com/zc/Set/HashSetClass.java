package com.zc.Set;

import java.util.HashSet;

/*
* set集合不允许存储重复元素的原理
* */
public class HashSetClass {
    public static void main(String[] args) {
        //创建hashSet集合对象
        HashSet<String> hashSet = new HashSet<>();
        String s = new String("abc");
        String s1 = new String("abc");
        hashSet.add(s);
        hashSet.add(s1);
        hashSet.add("重地");
        hashSet.add("通话");
        hashSet.add("abc");
        System.out.println(hashSet);
    }
}
