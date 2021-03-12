package com.zc.Annotation;
/*
     注解
        概念：说明程序的。给计算机看的
        注释：用文字去描述程序的。给程序员看的
        概念描述：
            jdk1.5之后的新特性
            说明程序的
            使用注解：@注解名称
        作用分类：
            编写文档：通过代码里标识的注解生成文档【生成文档doc文档】
            代码分析：通过代码里标识的注解对代码进行分析【使用反射】
            编译检查：通过代码里标识的注解让编译器能够实现基本的编译检查 【Override】
        Jdk中预定义的一些注解
            @Override : 检测被该注解标注的方法是否是继承自父类（接口）的
            @Deprecated : 该注解标注的内容，表示已过时
            @SuppressWarnings : 压制警告
        自定义注解：
            格式：
                元注解
                public @interface 注解名称{
                    属性列表;
                }
            本质：
                java.lang.annotation.Annotation{} 所有注解 默认继承该Annotation接口
            属性：接口中抽象方法
                要求：
                    1.属性的返回值类型
                        基本数据类型、String、枚举、注解、以上类型的数组
                    2.定义了属性，在使用时需要给属性赋值
                        1.如果定义属性时使用 default关键字给属性默认初始化值，则使用注解时，可以不进行属性的赋值
                        2.如果只有一个属性需要赋值并且属性的名称是value。则value可以省略只定义值就行
                        3.数组赋值时使用{} 如果数组中只有一个值 大括号可以省略
            元注解：用于描述注解的注解
                @Target：描述注解能够作用的位置
                    ElementType：
                        TYPE：可以作用于类上
                        METHOD：可以作用于方法上
                        FIELD: 可以作用于成员变量上
                @Retention：描述注解被保留的阶段
                    @Retention(RetentionPolicy.RUNTIME)  当前被描述的注解会被保留到class字节码文件中，并被JVM读取到
                @Documented： 描述注解是否被抽取到api文档中
                @Inherited：描述注解是否被子类继承

       在程序中解析（使用）注解：获取注解中定义的属性值
                1.获取注解定义的位置的对象（class，method，filed）
                2.获取指定的注解
                    getAnnotation（Class）
                3.调用注解中的抽象方法获取配置的属性值


       小结：
            1.大多数时候，我们会使用注解。而不是自定义注解
            2.注解给谁用？
                1.编译器
                2.给解析程序用
            3.注解不是程序的一部分，可以理解为注解就是一个小标签


* */

/**
 * 注解javadoc演示
 * @author Microlove
 * @version 1.0
 * @since 1.5
 */
public class AnnotationDemo {

    //利用javadoc命令行命令 可以生成该类的doc文档
    /**
     * 计算两数的和
     * @param a 整数
     * @param b 整数
     * @return  两数的和
     */
    @MyAnnotation(show = "1",show2 = 1)
    public int sum(int a,int b){
        return a+b;
    }
}
