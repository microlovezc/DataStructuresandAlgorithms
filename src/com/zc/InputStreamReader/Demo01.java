package com.zc.InputStreamReader;

import java.io.*;

public class Demo01 {
    public static void main(String[] args) throws Exception {
//        InputStreamReader reader = new InputStreamReader(new FileInputStream("src\\g.txt"),"GBK");
//        char[] chars = new char[1024];
//        int len = 0;
//        while (( len = reader.read(chars)) != -1){
//            System.out.println(chars);
//        }
//        reader.close();
        trans();
    }

    public static void trans() throws Exception{
        InputStreamReader reader = new InputStreamReader(new FileInputStream("src\\g.txt"),"GBK");
        OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("src\\h.txt"),"UTF-8");
        char[] chars = new char[1024];
        int len = 0;
        while (( len = reader.read(chars)) != -1){
            writer.write(chars,0,len);
        }
        writer.flush();
        writer.close();
        reader.close();
    }
}
