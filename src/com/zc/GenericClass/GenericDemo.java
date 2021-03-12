package com.zc.GenericClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericDemo {

    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("abc");
        collection.add("abcd");

        Collection<Integer> collection1 = new ArrayList<>();
        collection1.add(1);
        collection1.add(2);
        collection1.add(3);

        print(collection);
        print(collection1);

    }

    public static void print(Collection<?> list){
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
