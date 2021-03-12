package com.zc.Map.LinkedHashMap;

import java.util.HashMap;
import java.util.Hashtable;

/*
* HashTable implements Map<K,V>接口
* HashTable：底层也是一个哈希表 是一个线程安全的集合，是单线程集合 速度慢
* HashTable 不可以存储NULL值NUll键
* HashTable 和 Vector 集合一样在jdk1，2之后被更先进的集合（HashMap,ArrayList ）给取代了
* HashTable 的子类 Properties依然活跃在历史舞台
* Properties集合是一个唯一和IO流相结合的集合
* */
public class Demo02HashTable {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put(null,"a");
        map.put("a",null);
        map.put(null,null);
        System.out.println(map);

        Hashtable<String, String> hashtable = new Hashtable<>();
//        hashtable.put(null,"a");
//        hashtable.put("a",null); 都不允许 会报空指针异常
//        hashtable.put(null,null);
        System.out.println(hashtable);
    }
}
