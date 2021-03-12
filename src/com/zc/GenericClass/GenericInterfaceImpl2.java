package com.zc.GenericClass;

public class GenericInterfaceImpl2<E> implements GenericInterface<E>{
    @Override
    public void show(E e) {
        System.out.println(e);
    }
}
