package com.zc.reflect;

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
public class ReflectDemo2 {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;
        //获取成员变量
        /*
                   Field[] getFields();
                   Field getField(String name);
                   Field[] getDeclaredFields();
                   Field getDeclaredField(String name);
        * */
        Field[] fields = personClass.getFields();//获取public修饰的成员变量
        Field field = personClass.getField("a");//获取指定的public修饰的成员变量
        //获取成员变量a的值
        Person person = new Person();
        Object o = field.get(person);
        System.out.println(o);
        //设置成员变量a的值
        field.set(person,15);
        System.out.println(person);

        //Field[] getDeclaredFields(); 获取所有的成员变量
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        //Field getDeclaredField(String name);获取特有的成员变量
        Field name = personClass.getDeclaredField("name");
        //忽略访问权限修饰符的安全检查
        name.setAccessible(true);//暴力反射

        Object o1 = name.get(person);
        System.out.println(o1);

    }
}
