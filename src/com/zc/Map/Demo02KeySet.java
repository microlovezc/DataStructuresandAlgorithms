package com.zc.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
* Map集合第一种遍历方式：通过键找值的方式：过使用keySet方法取出Key值的set集合然后遍历集合得到key值在利用map的get方法取出value值
*
* Map集合第一种遍历方式：
* */
public class Demo02KeySet {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("1",1);
        map.put("2",2);
        map.put("3",3);
        map.put("4",4);

        Set<String> set = map.keySet();
        Iterator<String> iterator = set.iterator(); //通过使用keySet方法取出Key值的set集合然后遍历集合得到key值在利用map的get方法取出value值
        while (iterator.hasNext()){
            System.out.println(map.get(iterator.next()));
        }
        //使用增强for
        for (String s : map.keySet()) {
            System.out.println(map.get(s));
        }
    }
}
