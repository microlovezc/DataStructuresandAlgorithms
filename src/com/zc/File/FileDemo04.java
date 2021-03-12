package com.zc.File;

import java.io.File;

import static com.zc.File.FileDemo02.show02;

/*
   public boolean exists() : 此File表示的文件或目录是否实际存在。
   public boolean isDirectory() : 此File表示的是否为目录。
   public boolean isFile() : 此File表示的是否为文件。
* */
public class FileDemo04 {
    public static void main(String[] args) {
//        show01();
        show02();
    }
    /*
            public boolean isDirectory() : 此File表示的是否为目录。
                用于判断构造方法中的给定的路径是否以文件夹结尾
                    存在：true
                    不存在：false
            public boolean isFile() : 此File表示的是否为文件。
                用于判断构造方法中的给定的路径是否以文件结尾
                    存在：true
                    不存在：false
            注意：
                电脑的硬盘中只有文件/文件夹，两个方法是互斥的
                这两个方法使用前提，路径必须是存在的，否则都返回false

        * */
    private static void show02() {
        File file = new File("E:" + File.separator + "test" + File.separator + "dev" + File.separator + "b.txt");
        if (file.exists()){
            System.out.println(file.isFile());
            System.out.println(file.isDirectory());
        }

    }

    /*
        public boolean exists() : 此File表示的文件或目录是否实际存在。
        用于判断构造方法中的路径是否存在
            存在：true
            不存在：false
    * */
    private static void show01() {
        File file = new File("E:" + File.separator + "test" + File.separator +"dev"+File.separator+"b.txt");
        System.out.println(file.exists());
        File file1 = new File("E:" + File.separator + "test" + File.separator +"dev"+File.separator+"b1.txt");
        System.out.println(file1.exists());

    }
}
