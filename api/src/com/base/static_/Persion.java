package com.base.static_;


/*
*静态代码块
*
*     static{
*     }
*
*   当第一次用到本类的时候，静态代码块执行唯一次
*   对静态成员进行赋值
* */
public class Persion {


    //静态代码块比构造方法的先执行
    static{
        System.out.println("静态代码块执行");
    }

    public Persion(){
        System.out.println("构造方法执行");
    }

}
