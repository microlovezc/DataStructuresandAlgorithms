package com.zc.Reader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Demo02BufferedReader {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedWriter = new BufferedReader(new FileReader("src\\d.txt"));
//        char[] chars = new char[1024];
//        int len = 0;
//        while ((len = bufferedWriter.read(chars)) != -1){
//            System.out.println(new String(chars,0,len));
//        }
        String str = "";
        while ((str = bufferedWriter.readLine())!=null){
            System.out.println(str);
        }
        bufferedWriter.close();
    }
}
