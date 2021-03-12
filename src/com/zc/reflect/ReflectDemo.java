package com.zc.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo {

    /*
            获取Class对象的方式
                1.Class.forName("全类名")：将字节码文件加载进内存，返回Class对象
                    多用于配置文件，将类名定义配置在文件中，读取文件，加载类
                2.类名.class ： 通过类名的属性class获取
                    多用于参数的传递
                3.对象.getClass()：getClass()方法在Object类中定义着;
                    多用于对象获取字节码的方式

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
    public static void main(String[] args) throws ClassNotFoundException{
        //1.Class.forName("全类名")
        Class aClass1 = Class.forName("com.zc.reflect.Person");
        System.out.println(aClass1);

        //2.类名.class
        Class aClass2 = Person.class;
        System.out.println(aClass2);

        //3.对象.getClass()
        Person person = new Person();
        Class aClass3 = person.getClass();
        System.out.println(aClass3);

        //== 比较三个对象

        System.out.println(aClass1==aClass2);
        System.out.println(aClass1==aClass3);

        /*
        同一个字节码文件（*.class）在一次程序运行中，只会被加载一次，不论通过哪一种方式获取到的class对象都是同一个
        * */
    }
}
