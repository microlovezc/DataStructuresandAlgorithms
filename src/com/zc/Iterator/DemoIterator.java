package com.zc.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
* java.util.iterator接口：迭代器（对集合进行遍历）
*   有两个常用的方法：
*       hasNext（）如果仍有元素可以迭代就返回 true，如果没有返回false
*       next（）返回迭代的下一个元素。
*   iterator是一个接口，需要使用iterator接口的实现类对象，获取实现类的方式比较特殊
*   Collection接口中有一个方法，叫iterator（），这个方法返回的就是迭代器的实现类对象
* */

public class DemoIterator {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("张三");
        collection.add("李四");

        Iterator<String> iterator = collection.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (String item : collection){ //增强for循环：底层实现的也是迭代器。使用for循环的格式，简化了迭代器的书写jdk1.5出现的新特性
            System.out.println(item);    //增强for：用来遍历集合和数组

        }
    }
}
