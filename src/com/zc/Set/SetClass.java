package com.zc.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
* Set接口的特点
*   不允许有重复的元素
*   没有索引，没有带索引的方法，也不能使用普通的for循环进行遍历
*
* HashSet特点
*   不允许存储重复的元素
*   没有索引
*   是一个无序的集合，存储元素和取出元素的顺序有可能不一致
*   底层是一个hash表结构（查询速度非常快）
* */
public class SetClass {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("================");
        for (String s : set) {
            System.out.println(s);
        }

        System.out.println(set.hashCode());
    }
}
