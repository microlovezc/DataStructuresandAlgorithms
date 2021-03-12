package com.zc.File;

import java.io.File;

/*
* java.io.File类
* 文件和路径名的抽象表示形式
* Java把电脑中的文件和文件夹封装成了一个File类，我们可以使用File类对文件和文件夹进行操作
* 我们可以使用File类的方法：
*   创建
*   删除
*   获取
*   判断
*   对文件夹进行遍历
*   获取文件的大小
* File类是一个与系统无关的类，任何的操作系统都可以使用这个类中的方法
*
* 重点：三个单词
*   file：文件
*   directory：文件夹/目录
*   path：路径
* */
public class FileDemo01 {
    public static void main(String[] args) {
        /*

        操作路径：不能写死
        "E:"+FileDemo02.separator+"test"+FileDemo02.separator+"dev"+FileDemo02.separator+"a.txt"
        * */
        String separator = File.separator;
        String pathSeparator = File.pathSeparator;
        System.out.println(separator);  //windows：反斜杠\  linux:正斜杠/
        System.out.println(pathSeparator);//路径分隔符 windows：分号  linux：冒号
    }
}
