package com.zc.Map.LinkedHashMap;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        String str="aabvbacaca";
        char[] chars = str.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();
//        for (char aChar : chars) {
//            boolean b = hashMap.containsKey(aChar);
//            if (b){
//                hashMap.put(aChar,hashMap.get(aChar)+1);
//            }else {
//                hashMap.put(aChar,1);
//            }
//        }
//        System.out.println(hashMap);

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            boolean b1 = hashMap.containsKey(c);
            if (b1){
               hashMap.put(c,hashMap.get(c)+1);
            }else {
               hashMap.put(c,1);
            }
        }
        System.out.println(hashMap);
    }
}
