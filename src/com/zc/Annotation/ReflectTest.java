package com.zc.Annotation;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/*
* 框架类
* */
@Pro(className = "com.zc.Annotation.Demo1",methodName = "show")
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        //可以创建任意的对象，可以执行任意的方法
        /*
               前提：不能改变该类的任何代码。可以创建任意的对象，可以执行任意的方法
               实现：
                    配置文件
                    反射
               步骤：
                    将需要创建的对象的全类名和需要执行的方法定义在配置文件中
                    在程序中去读取配置文件
                    使用反射技术来加载文件进内存
                    创建对象
                    执行方法
        * */
        //解析注解
        //获取该类的字节码文件对象
        Class<ReflectTest> reflectTestClass = ReflectTest.class;
        //获取上方的字节码对象
        Pro annotation = reflectTestClass.getAnnotation(Pro.class);//其实就是在内存中生成了一个该注解接口的子类实现对象
        //调用注解对象中定义的抽象方法，获取返回值
        String s = annotation.className();
        Class<?> aClass = Class.forName(s);

        Constructor<?> constructor = aClass.getConstructor();
        Object o = constructor.newInstance();

        String s1 = annotation.methodName();
        Method method = aClass.getMethod(s1);
        method.invoke(o);


    }
}
