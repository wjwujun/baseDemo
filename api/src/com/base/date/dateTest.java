package com.base.date;


import java.util.Date;

/*
*java.util.Date:表示日期和时间的类
* 精确到毫秒
*
*
* */
public class dateTest {

    public static void main(String[] args) {

        //获取当前系统时间到1970年1月1日00:00:00经历了多长时间
        System.out.println(System.currentTimeMillis());
        System.out.println("--------------------------");


        //空参数方法，获取当前系统的日期和时间
        Date  times= new Date();
        System.out.println(times);
        System.out.println("--------------------------");


        //Date(Long date )  :传递毫秒值，转化成日期
        Date  times1= new Date(1548733834169L);
        System.out.println(times1);
        System.out.println("--------------------------");


        //getTime()  把日期转化成毫秒，相当于System.currentTimeMillis()
        Date  times2= new Date();
        System.out.println(times2.getTime());
        System.out.println("--------------------------");



    }

}
