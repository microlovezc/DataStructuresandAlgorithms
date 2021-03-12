package com.zc.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoDateFormat {
    public static void main(String[] args) throws ParseException {
        demo();
    }

    public static void demo() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 EEE");
        String format = simpleDateFormat.format(new Date());
        System.out.println(format);
        //解析文本时间到Date格式
        System.out.println(simpleDateFormat.parse(format));
    }
}
