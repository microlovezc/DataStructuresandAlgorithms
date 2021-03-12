package com.zc.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
*  comparator和comparable的区别：
*   comparable：自己和别人比较，自己需要实现comparable接口，重写从compareTo方法
*   comparator：相当于找一个第三方裁判比较两个人
*
* */
public class Demo02Sort {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(3);
        integers.add(2);

        Collections.sort(integers, new Comparator<Integer>() {
            //重写比较的方法
            @Override
            public int compare(Integer o1, Integer o2) {
//                return o2-o1;//降序
                return o1-o2;//升序
            }
        });
    }
}
