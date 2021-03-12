package com.zc.Set;

import java.util.Objects;

/*
* HashSet存储自定义类型元素
*
* 必须重写hashcode（）和equals方法
* */
public class HashSetSavePerson {
    private String name;
    private int age;

    public HashSetSavePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public HashSetSavePerson() {
    }

    @Override
    public String toString() {
        return "HashSetSavePerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashSetSavePerson that = (HashSetSavePerson) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
