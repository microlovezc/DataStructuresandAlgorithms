package com.zc.File;

import java.io.File;

/*
    File获取功能方法：
            String	getAbsolutePath()  返回File的绝对路径名字的字符串
            String	getName()          返回由此File表示的文件或者目录名称
            String	getPath()          将此File转换为路径名字字符串
            long	length()           返回由此File表示的文件长度
*/
public class FileDemo03 {
    public static void main(String[] args) {
//        show01();
//        show02();
//        show03();
        show04();
    }
    /*
        long	length()           返回由此File表示的文件长度
        获取的是构造方法指定的文件的大小，以字节为单位
        注意：
            文件夹是没有大小概念的，不能获取文件夹的大小
            如果构造方法中给出的路径不存在，那么length方法返回0
    * */
    private static void show04() {
        File file = new File("E:" + File.separator + "test" + File.separator +"dev"+File.separator+"b.txt");
        System.out.println(file.length());
    }

    /*
        String	getName()          返回由此File表示的文件或者目录名称
        获取的就是构造方法传递路径的结尾部分(文件/文件夹)
    * */
    private static void show03() {
        File file = new File("E:\\test\\dev");
        String name = file.getName();
        System.out.println(name);
    }

    /*
        String	getPath()          将此File转换为路径名字字符串
    * */
    private static void show02() {
        File file2 = new File("dev");
        String absolutePath2 = file2.getPath();
        System.out.println(absolutePath2);
    }

    /*
         String	getAbsolutePath()  返回File的绝对路径名字的字符串
         获取构造中传递的路径
         无论路径是相对的还是绝对的返回的都是绝对路径
    */
    private static void show01() {
        File file = new File("E:\\test\\dev");
        String absolutePath = file.getAbsolutePath();
        System.out.println(absolutePath);

        File file2 = new File("dev");
        String absolutePath2 = file2.getAbsolutePath();
        System.out.println(absolutePath2);
    }
    /*
        String	getPath()          将此File转换为路径名字字符串
        获取构造方法中传递的路径
    * */
}
