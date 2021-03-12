package com.zc.OutPutStream;

import java.io.File;
import java.io.FileOutputStream;

/*
      一次写多个字节的方法：
        void write(byte[] b) 将 b.length字节从指定的字节数组写入此输出流。
        void write(byte[] b, int off, int len) 从指定的字节数组写入 len个字节，从偏移 off开始输出到此输出流。


* */
public class Demo02OutputStream {

    public static void main(String[] args) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream("E:" + File.separator + "test" + File.separator + "123.txt");
        byte[] bytes = {57,56,48};
        fileOutputStream.write(bytes,0,3);//从0索引开始写入3个字符

        fileOutputStream.write("你好".getBytes());
        fileOutputStream.write("java".getBytes());

        fileOutputStream.close();

        FileOutputStream fileOutputStream2 = new FileOutputStream("E:" + File.separator + "test" + File.separator + "123.txt",true);
        fileOutputStream2.write("\r\n你好啊".getBytes());
        fileOutputStream2.close();

    }

}
