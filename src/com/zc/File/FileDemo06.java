package com.zc.File;

import java.io.File;

/*
    File类遍历目录功能
        public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录
        public File[] listFiles() : 返回一个File数组，表示该File目录中的所有子文件和目录
    注意：
        list方法和listFile方法遍历的是构造方法中给出的目录
        如果构造方法中给出的目录的路径不存在，会抛出空指针异常
        如果构造方法中给出的路径不是一个目录，也会抛出空指针异常
* */
public class FileDemo06 {
    public static void main(String[] args) {
        // public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录
        File file = new File("E:" + File.separator + "test");
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }

        //public File[] listFiles() : 返回一个File数组，表示该File目录中的所有子文件和目录
        File file2 = new File("E:" + File.separator + "test");
        File[] files = file2.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }
    }
}
