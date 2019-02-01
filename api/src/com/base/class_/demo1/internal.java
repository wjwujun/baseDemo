package com.base.class_.demo1;


/*
* 成员内部类
* 内部使用外部： 可用使用所有 内部类的方法和变量
* 外部使用内部: 需要调用内部类对象
*
* 使用方法
* 1、间接使用
* 2、直接使用
*   外部类名称.内部类名称 对象名=new 外部类().new 内部类();
* */
public class internal {


    public static void main(String[] args) {

        body body = new body(); //外部类对象
        //通过外部类的对象，调用外部类的方法，里面间接使用内部类
        body.methondBody();

        System.out.println("----------------------------");



        //直接调用方式
        body.heart  heart=new body().new heart();
        heart.beat();
        System.out.println("----------------------------");


        //变量名相同，调用方式
        outer.inner inner=new outer().new inner();

        inner.methodInner();




    }

}
