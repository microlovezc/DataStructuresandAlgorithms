package com.zc.InputStream;

import java.io.FileInputStream;

public class Demo01InputStream {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("E:\\test\\123.txt");
//        int len = 0;
//        while ( (len = fileInputStream.read()) != -1){
//            System.out.println((char) len);
//        }

        byte[] bytes = new byte[1024];
        int len1 = 0;
        while ( (len1=fileInputStream.read(bytes)) != -1 ){
            System.out.println(new String(bytes,0,len1));
        }

        fileInputStream.close();
    }
}
