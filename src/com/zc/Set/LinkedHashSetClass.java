package com.zc.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
* LinkedHashSet特点
*   底层是一个哈希表（数组+链表/红黑树）+链表：多了一条链表（记录元素存储顺序），保证元素有序
* */
public class LinkedHashSetClass {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("www");
        hashSet.add("abc");
        hashSet.add("abc");
        hashSet.add("itcast");
        System.out.println(hashSet);//无序不重复

        LinkedHashSet<String> hashSet1= new LinkedHashSet<>();
        hashSet1.add("www");
        hashSet1.add("abc");
        hashSet1.add("abc");
        hashSet1.add("itcast");
        System.out.println(hashSet1);//有序不重复
    }
}
