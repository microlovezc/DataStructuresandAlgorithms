package com.zc.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/*
            使用Class对象的功能
                1.获取成员变量们
                   Field[] getFields();
                   Field getField(String name);
                   Field[] getDeclaredFields();
                   Field getDeclaredField(String name);
                2.获取构造方法们
                   Constructor<?>[] getConstructors();
                   Constructor<T> getConstructor(类<?>...parameterTypes);
                   Constructor<?>[] getDeclaredConstructors();
                   Constructor<T> getDeclaredConstructor(类<?>...parameterTypes);
                3.获取成员方法们
                   Method[]   getMethods();
                   Method  getMethod(String name,类<?>...parameterTypes);
                   Method[] getDeclaredMethods();
                   Method getDeclaredMethod(String name,类<?>...parameterTypes);
                4.获取类名
                   String getName();
* */
public class ReflectDemo3 {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;
        /*
                  获取构造方法们
                   Constructor<?>[] getConstructors();
                   Constructor<T> getConstructor(类<?>...parameterTypes);
                   Constructor<?>[] getDeclaredConstructors();
                   Constructor<T> getDeclaredConstructor(类<?>...parameterTypes);
        * */
        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);

        Person person = constructor.newInstance("张闯", 24);//Constructor 创建对象 newInstance()
        System.out.println(person);

        System.out.println("===================================");
        Constructor<Person> constructor1 = personClass.getConstructor();
        System.out.println(constructor1);

        Person person1 = constructor1.newInstance();//如果使用空参数的构造方法创建对象，操作可以简化：Class对象的newInstance()
        System.out.println(person1);
        System.out.println("===================================");
        Person person2 = personClass.newInstance();
        System.out.println(person2);

    }
}
