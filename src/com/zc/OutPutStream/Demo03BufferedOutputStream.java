package com.zc.OutPutStream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Demo03BufferedOutputStream {
    public static void main(String[] args) throws Exception {
        BufferedOutputStream buffereds = new BufferedOutputStream(new FileOutputStream("src\\c.txt"));
        byte[] bytes = {95,96,97,98,99,1,2,3,4};
        buffereds.write(bytes);

        buffereds.close();
    }
}
