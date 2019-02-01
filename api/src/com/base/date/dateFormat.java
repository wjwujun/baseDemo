package com.base.date;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* 时间格式化： 把日期变文本
* 解析 ：  把文本变日期
*
*成员方法 format
* y  年
* M  月
* d  日
* H  时
* m  分
* s  秒
*
* yyyy-MM-dd HH:mm:ss
*
* */
public class dateFormat {


    public static void main(String[] args) throws ParseException {
        demo2();
    }

    //格式化format
    public static void demo1() {
        //构造方法中传递指定的模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String format = sdf.format(date);

        System.out.println(date);
        System.out.println(format);
    }


    /*
     *解析parse
     * 抛出一个 parseException
     *
     */
    public static void demo2() throws ParseException {

        //构造方法中传递指定的模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date format = sdf.parse("2019-01-29 12:07:09");

        System.out.println(format);
    }


}
