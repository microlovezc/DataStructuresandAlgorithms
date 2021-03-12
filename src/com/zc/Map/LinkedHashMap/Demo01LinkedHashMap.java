package com.zc.Map.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
* LinkedHashMap继承了HashMap集合
* Map 接口有哈希表+链接列表实现，具有可预知的迭代顺序
* 底层原理：
*      哈希表+链表（记录元素的顺序）
* */
public class Demo01LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a","a");
        map.put("c","c");
        map.put("b","b");
        map.put("d","d");
        System.out.println(map);//key不允许重复，无序
        LinkedHashMap<String, String> linked = new LinkedHashMap<>();
        linked.put("a","a");
        linked.put("c","c");
        linked.put("b","b");
        linked.put("d","d");
        System.out.println(linked);//key不允许重复，有序
    }
}
