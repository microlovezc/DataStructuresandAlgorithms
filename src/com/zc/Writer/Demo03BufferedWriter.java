package com.zc.Writer;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Demo03BufferedWriter {
    public static void main(String[] args) throws Exception{
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src\\d.txt"));
        bufferedWriter.write("冲啊 java",2,5);
        bufferedWriter.newLine();
        bufferedWriter.write("hhhhhhh python");
        bufferedWriter.newLine();
        bufferedWriter.write("hhhhhhh python2");
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
