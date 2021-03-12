package com.zc.InputStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo2 {
    public static void main(String[] args) throws Exception{
        long s = System.currentTimeMillis();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("E:\\test\\1.jpg"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("E:\\test\\dev\\1.jpg"));
        byte[] bytes = new byte[1024];
        int len = 0;
        while ( (len = bufferedInputStream.read(bytes)) != -1 ){
            bufferedOutputStream.write(bytes,0,len);
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
        System.out.println(System.currentTimeMillis()-s);

    }
}
