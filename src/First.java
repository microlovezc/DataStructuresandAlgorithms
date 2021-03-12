import java.util.ArrayList;
import java.util.Scanner;


public class First {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int score=90;
        int[] s={};
        String testStr1 = "1.1.1.1";      //合法字符串
        String testStr2 = "1.a.1.1";      //字符串中包含非数字字符
        String testStr3 = ".a.1.1";       //字符串长度不够
        String testStr4 = "1.256.1.1111"; //Ip地址数字范围不正确
        String testStr5 = "-1.256.1.1111";//Ip地址数字范围不正确
        String testStr6 = "1.1.1.1.5";  //字符串长度超过
        String testStr7 = "1.1.1.1/";   //字符串中包含非数字字符
        ArrayList testStr = new ArrayList();
        testStr.add(testStr1);
        testStr.add(testStr2);
        testStr.add(testStr3);
        testStr.add(testStr4);
        testStr.add(testStr5);
        testStr.add(testStr6);
        testStr.add(testStr7);
        for (int i = 0 ; i < testStr.size() ; i++){
            boolean flag = solution.isIPAddress((String) testStr.get(i));
            if (flag) {
                System.out.println(testStr.get(i)+"是合法Ip地址");
            }else {
                System.out.println(testStr.get(i)+"不是合法Ip地址");
            }
        }

    }

    static class Solution {
        //思路：首先Ip的合法范围在：0.0.0.0~255.255.255.255  最小长度为7位最大长度为15位，先利用split将字符串拆分成4段，并同时满足纯数字和0~255之间的要求如果是就返回true一项不满足就返回false
        public boolean isIPAddress(String str) {

            if(str.length()<7 || str.length() >15) //如果长度不在7~15范围内直接返回false
                return false;
            String[] arr = str.split("\\.");

            if( arr.length != 4 )    return false;//利用拆分后的数组进行长度计算 若数组长度不是4 则直接返回false
            for(int i = 0 ; i <4 ; i++ ){
                boolean flag = true;
                for(int j = 0; j<arr[i].length();j++){
                    char temp = arr[i].charAt(j);   //逐一将数组里的内容取出来 若有一项不是数字则直接返回false
                    if(!( temp>'0' && temp< '9' ) )
                        return false;
                }
                if (flag){                  //若执行到这一项则说明此段为纯数字 那么就判断时候这个数字在0~255之间  若不在则返回false
                    int temp = Integer.parseInt( arr[i] );
                    if( temp<0 || temp >255)    return false;
                }
            }
            return true;
        }
    }
}

