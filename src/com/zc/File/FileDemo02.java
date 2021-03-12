package com.zc.File;

import java.io.File;

/*
     路径：
        绝对路径：是一个完整的路径
            以盘符（c:,d:）开始的路径
        相对路径：是一个简化的路径
            相对于当前项目的根目录
            如果使用当前项目的根目录，路径可以简化书写
        注意：
            路径不区分大小写
            路径中的文件名称分隔符windows使用反斜杠，反斜杠是转义字符，两个反斜杠代表一个普通的反斜杠
* */
public class FileDemo02 {
    /*
        File(String pathName) 通过给指定的路径名字符串转换为抽象路径名来创建一个新的File实例
        参数：
            String pathName：字符串的路径名称
            路径可以以文件结尾，也可以以文件夹结尾
            路径可以是相对路径，也可以是绝对路径
            路径可以是存在，也可以是不存在的
            创建File对象，只是把字符串路径封装成File对象，不考虑路径真假问题
    */
    public static void main(String[] args) {


//        show01("e:"+File.separator,"dev");
//        show02();
        show03();

    }
    /*
        File(File parent,String child)根据parent抽象路径名和child路径名字符串创建一个新的File实例
        参数：把路径分成了两部分，
           File parent ： 父路径
           String child ： 子路径
        好处：
           父路径和子路径，可以单独书写，使用起来非常灵活; 父路径和子路径都可以变化
           父路径是File类型，可以使用File的方法对路径进行一些操作，在使用路径创建对象
    * */
    private static void show03() {
        File file = new File("c:\\");
        File file1 = new File(file, "test");
        System.out.println(file1);
    }

    /*
      File(String parent,String child)根据parent路径名称字符串和child路径名字符串创建一个新的File实例
      参数：把路径分成了两部分，
           String parent ： 父路径
           String child ： 子路径
      好处：
           父路径和子路径，可以单独书写，使用起来非常灵活; 父路径和子路径都可以变化
    * */
    public static void show01(String parent,String child){
        File file = new File(parent, child);
        System.out.println(file);
    }

    public static void show02(){
        File file = new File("C:" + File.separator + "test" + File.separator + "dev" + File.separator + "b.txt");
        System.out.println(file);//重写了Object的toString方法
        File file1 = new File("C:" + File.separator + "test" + File.separator + "dev");
        System.out.println(file1);
    }
}
