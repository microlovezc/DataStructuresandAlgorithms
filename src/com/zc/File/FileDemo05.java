package com.zc.File;

import java.io.File;
import java.io.IOException;

/*
    创建删除功能的方法
    public boolean createNewFile() : 当且仅当具有该名称的文件尚不存在时，创建一个新的文件夹。
    public boolean delete() : 删除由此File表示的文件和目录
    public boolean mkdir() : 创建由此File表示的目录
    public boolean mkdirs() : 创建由此File表示的目录，包括任何必需但不存在的父目录
* */
public class FileDemo05 {
    public static void main(String[] args) throws Exception {
//        show01();
//        show02();
        show03();
    }
    /*
        public boolean delete() : 删除由此File表示的文件和目录
        此方法可以删除构造方法路径中给出的文件/文件夹
        返回值：布尔值
            true：文件/文件夹删除成功，返回true
            false：文件夹中有内容，不会删除返回false；构造方法中的路径不存在返回false
        注意：
            delete是直接在硬盘删除文件/文件夹，不走回收站，删除要谨慎
    * */
    private static void show03() {
        File file = new File("E:" + File.separator + "test"+File.separator+"wenjianjia");
        boolean delete = file.delete();
        System.out.println(delete);
    }

    /*
        public boolean mkdir() : 创建由此File表示的单级目录
        public boolean mkdirs() : 既可以创建单级文件夹也可以创建多级文件夹
        创建文件夹的路径和名称在构造方法中给出（构造方法的参数）
           返回值：布尔值
                true：文件夹不存在，创建文件，返回true
                false：文件夹存在，不会创建，返回false，构造方法中给出的路径不存在返回false
           注意：
                1.此方法只能创建文件夹，不能创建文件

    * */
    private static void show02() {
        File file = new File("E:" + File.separator + "test"+File.separator+"1");
        boolean mkdir = file.mkdir();
        System.out.println(mkdir);

        File file2 = new File("E:" + File.separator + "test"+File.separator+"111"+File.separator+"222");
        boolean mkdirs = file2.mkdirs();
        System.out.println(mkdirs);
    }

    /*
       public boolean createNewFile() : 当且仅当具有该名称的文件尚不存在时，创建一个新的文件夹。
       创建文件的路径和名称在构造方法中给出（构造方法的参数）
       返回值：布尔值
            true：文件不存在，创建文件，返回true
            false：文件存在，不会创建，返回false
       注意：
            1.此方法只能创建文件，不能创建文件夹
            2.创建文件的路径必须存在，否则会抛出IO异常
    * */
    private static void show01() throws Exception {
        File file = new File("E:" + File.separator + "test"+File.separator+"1.txt");
        boolean newFile = file.createNewFile();
        System.out.println(newFile);

        File f2 = new File("E:" + File.separator + "test"+File.separator+"wenjianjia");
        System.out.println(f2.createNewFile());

    }
}
