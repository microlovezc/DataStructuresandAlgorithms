package com.zc.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

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
public class ReflectDemo4 {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;
        /*
                  获取成员方法们
                   Method[]   getMethods();
                   Method  getMethod(String name,类<?>...parameterTypes);
                   Method[] getDeclaredMethods();
                   Method getDeclaredMethod(String name,类<?>...parameterTypes);
        * */
        //获取指定名称的方法
        Method eat = personClass.getMethod("eat");
        Person person = new Person();
        //方法对象：执行方法  invoke();
        eat.invoke(person);

        //获取指定名称的方法
        Method eat2 = personClass.getMethod("eat",String.class);
        Person person2 = new Person();
        //方法对象：执行方法  invoke();
        eat2.invoke(person,"汉堡");
        System.out.println("================");

        //获取所有public修饰的方法
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            //暴力反射 如果是私有的
            method.setAccessible(true);
            System.out.println(method.getName());        //获取方法名称String getName();
        }

        //获取类名
        String name = personClass.getName();
        System.out.println(name);


    }
}
