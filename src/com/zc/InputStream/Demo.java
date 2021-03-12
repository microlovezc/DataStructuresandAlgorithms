package com.zc.InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo {
    public static void main(String[] args) throws Exception{
        long s = System.currentTimeMillis();
        FileInputStream fileInputStream = new FileInputStream("E:\\test\\1.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream("E:\\test\\dev\\1.jpg");
        byte[] bytes = new byte[1024];
        int len = 0;
        while (( len = fileInputStream.read(bytes)) != -1){
            fileOutputStream.write(bytes,0,len);
        }
        fileInputStream.close();
        fileOutputStream.close();
        System.out.println(System.currentTimeMillis()-s);
//        File file = new File("E:\\test\\dev\\AnnotationDemo.java");
//        System.out.println(file.delete());
    }
}
