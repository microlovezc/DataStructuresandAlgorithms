package com.zc.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
* Map的第二种遍历方式：使用entry对象遍历
* Map集合中的方法：
*   set<Map.Entry<K,V>> entrySet() 返回映射中包含的映射关系Set视图
*
*
* */
public class Demo03EntrySet {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("1",1);
        map.put("2",2);
        map.put("3",3);
        map.put("4",4);
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey()+"===>"+entry.getValue());
        }
    }
}
