package com.zc.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
* Map集合是一个双列集合  一个元素包含两个值
* key 和 value的数据类型可以不同，也可以相同
* key是不允许重复的，value是允许重复的
* map中的元素，key 和 value是一一对应的
*
* java。util。HashMap<k,v>集合
* HashMap特点：
*   HashMap底层是哈希表，查询速度非常快
*       jdk1，8之前  数组+单项链表
*       jdk1，8之前  数组+单项链表/红黑树（链表的长度超过8）：提高查询的速度
*   HashMap是无序的集合 存储元素和取出元素的顺序有可能不一致
*
* LinkedHashMap的特点
*   1.LinkedHashMap的底层是哈希表+链表（保证迭代的顺序）
*   2.LinkedHashMap集合是一个有序的集合，存储和取出元素的顺序是一致的
* */
public class Demo01Map {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        //put(key,value)  //key不重复时返回值时null  key重复是新的value会替换老的value 返回值是老的value
        String put = map.put("张闯", "杨锐");
        System.out.println(put);
        String put1 = map.put("张闯", "方文轩");
        System.out.println(put1);
        map.put("十大","asd");
        map.put("十大2","asd");
        map.put("十大3","asd");
        map.put("十大4","asd");
        System.out.println(map);

        //remove(key) 将键值对所对应的元素在map集合中删除 key存在返回值是key值对应的value值 key不存在返回null
        String s = map.remove("十大");
        System.out.println(s);

        //get(key) key存在返回对应的value值，key不存在返回null
        String z = map.get("张闯");
        System.out.println(z);

        //boolean containsKey(Object key)判断map集合中是否包含该key值，如果存在返回true 如果不存在返回false
        boolean b = map.containsKey("张闯");
        System.out.println(b);
        boolean b1 = map.containsKey("张闯1");
        System.out.println(b1);

    }
}
