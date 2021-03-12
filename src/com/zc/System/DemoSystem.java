package com.zc.System;

public class DemoSystem {
    public static void main(String[] args) {
//        demo();
        demo2();
    }


    /*
    * 复制数组方法
    * */
    private static void demo2() {
        int[] src = new int[]{1,2,3,4,5};
        int[] dest = new int[]{6,7,8,9,10};
        System.arraycopy(src,0,dest,0,3);
        for (int i = 0; i < dest.length; i++) {
            System.out.println(dest[i]);

        }
    }

    private static void demo() {
        long l = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {
            System.out.println(i);
        }
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);

    }
}
