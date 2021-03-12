package com.zc.Map.JDk9;

import java.util.List;
import java.util.Map;
import java.util.Set;

/*
* JDK9新特性
*   LIST,SET,MAP增加了一个静态的of方法，能一次添加多个元素
* 使用前提：
*   当集合中存储的元素的个数已经确定了。不在改变时使用
*
* 注意：
*   of只适用于LIST,SET,MAP接口不适用于接口实现类
*   of的返回值是一个不能改变的集合，不能使用add，put方法添加元素 会抛出异常
*   Set接口和Map接口在调用of方法是不能有重复的元素否则也会抛出异常
* */
public class Demo01JDK9 {
    public static void main(String[] args) {

        List<Integer> list = List.of(1,24,5,65,6,71,1);
        System.out.println(list);

        Set<String> set = Set.of("a","b","c","d");//元素不能重复
        System.out.println(set);

        Map<String,Integer> map = Map.of("ab",16,"av",15);//key值不能重复
        System.out.println(map);
    }
}
