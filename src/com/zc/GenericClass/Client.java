package com.zc.GenericClass;

public class Client {
    public static void main(String[] args) {
        GenericClass<Integer> genericClass = new GenericClass<>();
        genericClass.setName(1);
        genericClass.setPassword("123456");
        System.out.println(genericClass.getName());
        System.out.println(genericClass.getPassword());
    }


}
