package com.zc.VarArgs;
/*
* 可变参数
* 使用前提：
*   方法参数和数据类型已经确定，但是参数的个数不确定，就可以使用可变参数
* 使用格式：定义方法时使用
*   修饰符 返回值 方法名（数据类型 ...变量名）{}
* 原理：
*   底层就是一个数组，根据传递参数的个数不同，就会创建不同长度的数组来存储这些参数，传递参数的
* */
public class Demo01VarArgs {
    public static void main(String[] args) {
//        add(1,2);
        int add = add(10,10,20,40);
        System.out.println(add);
        int add2 = add(10,10,20,40,1214,124,5,5,6,7324,5);
        System.out.println(add2);
    }

//    private static int add(int i, int i1) {
//        return i+i1;
//    }
    /*
    *
    * 一个方法的参数列表只能有一个可变参数
    * 如果方法的参数有多个，那么可变参数必须写在参数列表的最后面
    * */

    // 可变参数的特殊写法（终极写法）（Object ...object）
    public static int add(int ...arr){//arr底层是一个可变长度的数组，根据所传的参数个数
//        System.out.println(arr);
//        System.out.println(arr.length);
        int sum=0;
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }

}
