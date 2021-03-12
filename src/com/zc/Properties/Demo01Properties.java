package com.zc.Properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Demo01Properties {
    public static void main(String[] args) throws IOException {
//        show01();
//        show02();
        show03();
    }

    private static void show03() throws IOException {
        Properties prop = new Properties();
        FileReader fileReader = new FileReader("src\\b.txt");
        prop.load(fileReader);
        System.out.println(prop.get("username"));
        System.out.println(prop.get("password"));
        fileReader.close();
    }

    private static void show02() throws IOException {
        Properties prop = new Properties();
        prop.setProperty("username","root");
        prop.setProperty("password","123456");
        FileWriter fileWriter = new FileWriter("src\\b.txt",true);
        prop.store(fileWriter,"Sql Session");
        fileWriter.flush();
        fileWriter.close();
    }

    private static void show01() {
        Properties properties = new Properties();
        properties.setProperty("username","root");
        properties.setProperty("password","123456");
        Set<String> set = properties.stringPropertyNames();
        for (String s : set) {
            System.out.println(properties.get(s));
        }
        System.out.println("-------------------------------");
        Set<Object> objects = properties.keySet();
        for (Object object : objects) {
            System.out.println(properties.get(object));
        }
        System.out.println("-------------------------------");
        Set<Map.Entry<Object, Object>> entries = properties.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            System.out.println(entry.getKey()+"::"+entry.getValue());
        }
    }
}
