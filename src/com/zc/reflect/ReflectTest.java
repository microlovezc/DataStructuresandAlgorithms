package com.zc.reflect;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/*
* 框架类
* */
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

        //加载配置文件
        //创建Properties对象
        Properties properties = new Properties();
        //加载配置文件，转换为一个集合
        //获取class目录下的配置文件
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("pro.properties");
        properties.load(resourceAsStream);

        //获取配置文件中定义的数据
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        //加载该类进内存
        Class<?> aClass = Class.forName(className);
        Constructor<?> constructor = aClass.getConstructor();
        Object o = constructor.newInstance();

        //获取方法对象
        Method eat = aClass.getMethod(methodName);
        eat.invoke(o);


    }
}
