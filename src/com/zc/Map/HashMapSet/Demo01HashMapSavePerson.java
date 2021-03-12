package com.zc.Map.HashMapSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
* HashMap存储自定义类型键值
* Map集合保证键值是唯一的：
*   作为key值的元素必须重写hashcode（）和 equals（）方法
* */
public class Demo01HashMapSavePerson {
    public static void main(String[] args) {
//        show01();
        show02();
    }

    private static void show02() {
        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person("张闯",15),"北京");
        map.put(new Person("李四",15),"上海");
        map.put(new Person("王五",15),"西安");
        map.put(new Person("张闯",15),"郑州");
        Set<Person> people = map.keySet();
        for (Person person : people) {
            System.out.println(person.getName() + "===>" + map.get(person));
        }
        Set<Map.Entry<Person, String>> entries = map.entrySet();
        for (Map.Entry<Person, String> entry : entries) {
            System.out.println(entry.getKey().getName()+"===>"+entry.getValue());
        }
    }

    private static void show01() {
        HashMap<String, Person> map = new HashMap<>();
        map.put("上海",new Person("张闯",15));
        map.put("北京",new Person("李四",17));
        map.put("西安",new Person("王五",16));
        map.put("上海",new Person("赵六",13));
        System.out.println(map);

    }
}
