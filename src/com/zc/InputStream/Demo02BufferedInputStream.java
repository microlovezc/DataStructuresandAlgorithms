package com.zc.InputStream;


import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Demo02BufferedInputStream {
    public static void main(String[] args) throws Exception {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("src\\b.txt"));
        byte[] bytes = new byte[1024];
        int len = 0;
        while ( ( len = bufferedInputStream.read(bytes) ) != -1){
            System.out.println(new String(bytes,0,len));
        }
        bufferedInputStream.close();
    }
}
