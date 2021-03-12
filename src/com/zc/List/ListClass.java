package com.zc.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
* List接口特点：
*   有序的 存储元素和取出元素的顺序是一致的
*   有索引
*   允许存储重复的元素
*
* List接口带索引的特有方法
*   add(index,item);
*   get(index);
*   remove(index);
*   set(index,item);
* */
public class ListClass {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); //多态
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(1,"abc");
        System.out.println(list);

        String remove = list.remove(1);
        System.out.println(list+"被移除元素:"+remove);

        String abc = list.set(1, "abc");
        System.out.println(list+"被替换的元素："+abc);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("=========================");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
