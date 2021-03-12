package com.zc.Annotation;

import java.util.Date;

/*
        Jdk中预定义的一些注解
            @Override : 检测被该注解标注的方法是否是继承自父类（接口）的
            @Deprecated : 该注解标注的内容，表示已过时
            @SuppressWarnings : 压制警告
* */
@SuppressWarnings("all") //压制所有警告
public class AnnotationDemo2 {

    @Override
    public String toString() {
        return super.toString();
    }
    @Deprecated
    public void show(){
        //有缺陷
        System.out.println("show");
    }
    @MyAnnotation2
    public void show1(){
        //有缺陷
        System.out.println("show");
    }
    public void demo(){
        show();
        Date date = new Date();
    }
}
