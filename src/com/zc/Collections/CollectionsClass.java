package com.zc.Collections;

import java.util.ArrayList;
import java.util.Collections;

/*
* addAll（collection<T> c,T... elements）往集合中增加一些元素
* shuffer（list）打乱顺序
* */
public class CollectionsClass {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,"a","b","c");
        System.out.println(arrayList);
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
    }
}
