package com.zc.List;

import java.util.LinkedList;

/*
*  LinkedList集合的特点：
*   1.底层是一个链表接口  查询慢，增删慢，里面有大量操作首尾元素的方法 使用LinkedList特有方法不能使用多态
* */
public class LinkedListClass {
    public static void main(String[] args) {
//        show01();
//        show02();
        show03();
    }

    private static void show03() {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        String s = strings.removeFirst();
        String s1 = strings.removeLast();
        System.out.println("第一个"+s+"最后一个"+s1);
        System.out.println(strings);
    }

    private static void show02() {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        if (!strings.isEmpty()){
        System.out.println(strings.getFirst());
        System.out.println(strings.getLast());
        }
    }

    private static void show01() {
        LinkedList<String> list = new LinkedList<>();
        list.add("b");
        list.addFirst("a");
        list.addLast("c");
        list.push("www"); // push()==addFirst();
        System.out.println(list);
    }
}
