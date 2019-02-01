package com.base.calendar;


import java.util.Calendar;
import java.util.Date;

/*
*
* 日历类
* 抽象类，里面提供很多操作日历字段的方法
* 无法直接创建使用
*  日历类的字段可以用，静态成员变量获取
*   YEAR MONTH WEEK_OF_YEAR  WEEK_OF_MONTH DATE DAY_OF_MONTH  DAY_OF_YEAR
*
* */
public class calendarTest {

    public static void main(String[] args) {
        /*Calendar c = Calendar.getInstance();//多态 使用默认时区和时间
        System.out.println(c);*/

        demo4();

    }

    //gettime方法，把日历类对象转化成日期对象
    private static void demo4() {
        Calendar c = Calendar.getInstance();
        Date time = c.getTime();
        System.out.println(time);


    }

    //add方法，把指定的字段增加/减少
    private static void demo3() {
        Calendar c = Calendar.getInstance();
        //增加2年
        c.add(Calendar.YEAR,2);
        c.add(Calendar.MONTH,2);

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);  //西方的月是0-11
        System.out.println(year);
        System.out.println(month);

    }

    //set 将给定的字段设定为指定值
    private static void demo2() {
        Calendar c = Calendar.getInstance();

        //设置年为999年
        c.set(Calendar.YEAR,9999);
        c.set(Calendar.MONTH,9);
        c.set(Calendar.DAY_OF_MONTH,15);
        //同时 设置年月日
        c.set(888,8,8);

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);  //西方的月是0-11
        int date = c.get(Calendar.DAY_OF_MONTH);  //一个月中的某一天
        System.out.println(year);
        System.out.println(month);
        System.out.println(date);


    }

    //get方法返回给定日历字段的值
    public static void demo1() {
        Calendar c = Calendar.getInstance();

        //获取给定日历的值
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);  //西方的月是0-11
        int date = c.get(Calendar.DAY_OF_MONTH);  //一个月中的某一天
        int date1 = c.get(Calendar.DATE);  //一个月中的某一天
        System.out.println(year);
        System.out.println(month);
        System.out.println(date);
        System.out.println(date1);

    }



}
