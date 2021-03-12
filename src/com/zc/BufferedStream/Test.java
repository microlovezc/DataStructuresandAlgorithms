package com.zc.BufferedStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) throws Exception{
        HashMap<String, String> map = new HashMap<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\d.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src\\f.txt"));
        String s = "";
        while ((s = bufferedReader.readLine()) != null){
            String[] split = s.split(":");
            map.put(split[0],split[1]);
        }
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            bufferedWriter.write(entry.getKey()+":"+entry.getValue());
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
