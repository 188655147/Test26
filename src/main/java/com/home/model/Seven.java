package com.home.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Seven {
    /**
     * 时间和日期
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{
//        Date newdate = new Date();
//        String pat = "yyyy-MM-dd HH:mm:ss.SSS";
//        SimpleDateFormat sdf = new SimpleDateFormat(pat);//定义转换类，同时设置模板
//        String str = sdf.format(newdate);
//        Date date = sdf.parse(str);
//        System.out.println(date);
        String str = "yyyy-MM-dd HH:mm:ss.SSS";
        String par = "1991-11-11 11:11:11.111";
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(str);
        String val1 = sdf.format(date);
        Date val2 = sdf.parse(par);
        System.out.println(val1);
        System.out.println(val2);
    }
}
