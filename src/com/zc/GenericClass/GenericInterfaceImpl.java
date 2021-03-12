package com.zc.GenericClass;

public class GenericInterfaceImpl implements GenericInterface<String> {
    @Override
    public void show(String s) {
        System.out.println(s);
    }
}
