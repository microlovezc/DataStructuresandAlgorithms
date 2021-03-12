package com.zc.Annotation.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
* 简单的测试框架
*
* 当主方法执行后，会自动自行被检测的所有方法
* */
public class TestCheck {
    public static void main(String[] args) throws Exception {
        //1.创建计算器对象
        Calculator calculator = new Calculator();
        //2.获取字节码文件对象
        Class<? extends Calculator> aClass = calculator.getClass();
        //3.获取所有的方法
        Method[] methods = aClass.getMethods();

        int number = 0;//异常出现的次数
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));


        for (Method method : methods) {
            //4.判断方法上是否有Check注解
            if (method.isAnnotationPresent(Check.class)){
                //5.有，执行
                try {
                    method.invoke(calculator);
                } catch (Exception e) {
                    //6.捕获异常

                    //记录到文件中
                    number++;
                    bw.write(method.getName()+"方法出异常了");
                    bw.newLine();
                    bw.write("异常的名称:"+e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常的原因:"+e.getCause().getMessage());
                    bw.newLine();
                    bw.write("------------------------");
                    bw.newLine();
                }
            }
        }
        bw.write("本次测试一共出现"+number+"次异常");
        bw.flush();
        bw.close();
    }
}
