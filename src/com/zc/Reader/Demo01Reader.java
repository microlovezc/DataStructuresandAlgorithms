package com.zc.Reader;

import java.io.FileReader;
import java.io.IOException;

public class Demo01Reader {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("E:\\test\\123.txt");
        char[] chars = new char[1024];
        int len = 0;
        while (( len = fileReader.read(chars)) != -1 ){
            System.out.println(new String(chars,0,len));
        }
        fileReader.close();
    }
}
