package com.zc.OutputStreamWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Demo01 {
    public static void main(String[] args) throws Exception {
//        OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("src\\g.txt"),"utf-8");
//        OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("src\\g.txt"));
        OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("src\\g.txt"),"GBK");
        writer.write("你好");
        writer.flush();
        writer.close();

    }
}
