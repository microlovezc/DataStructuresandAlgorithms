package com.zc.Writer;

import java.io.FileWriter;
import java.io.IOException;

public class Demo2Writer {
    public static void main(String[] args)  {
        try(FileWriter fileWriter = new FileWriter("src\\a.txt");) {
            fileWriter.write("你好 writer\r\n");
            fileWriter.flush();
            char[] chars = {'a','b','c','d'};
            fileWriter.write(chars,1,3);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
