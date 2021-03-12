package com.zc.Collections;

import java.util.ArrayList;
import java.util.Collections;

/*
*
*   sort(list) 将集合中的元素按照默认规则排序
*
*   注意：
*   使用前提：被排序的集合里面存储的元素，必须实现Comparable，重写接口中的方法compareTo定义的排序规则
*
*   Comparable接口的排序规则
*       自己（this）-参数 就是升序 反之则 降序
* */
public class Demo01Sort {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(5);
        integers.add(4);
        System.out.println(integers);
        Collections.sort(integers);
        System.out.println(integers);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("c");
        arrayList.add("b");
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("ZC",15));
        people.add(new Person("WT",17));
        people.add(new Person("FG",17));
        people.add(new Person("CG",16));
        System.out.println(people);
        Collections.sort(people);
        System.out.println(people);
    }
}
