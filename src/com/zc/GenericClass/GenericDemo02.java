package com.zc.GenericClass;

import java.util.ArrayList;
import java.util.Collection;

/*
* 泛型的上限限定：？extends E 代表使用的泛型只能是E的子类或者E本身
* 泛型的下限限定：？super E 代表使用的泛型只能是E的父类或者E本身
* */
public class GenericDemo02 {
    public static void main(String[] args) {
        Collection<Integer> collection1 = new ArrayList<>();
        Collection<String> collection2 = new ArrayList<>();
        Collection<Number> collection3 = new ArrayList<>();
        Collection<Object> collection4 = new ArrayList<>();

        getElements1(collection1);
//        getElements1(collection2);
        getElements1(collection3);
//        getElements1(collection4);

//        getElements2(collection1);
//        getElements2(collection2);
        getElements2(collection3);
        getElements2(collection4);


    }

    public static void getElements1(Collection<? extends Number> collection){}

    public static void getElements2(Collection<? super Number> collection){}
}
