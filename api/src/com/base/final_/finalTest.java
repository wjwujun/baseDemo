package com.base.final_;

/*
* final修饰一个类的时候
* public final class name{}
*
* 含义：这个类不能有任何子类
*
* */
public final class finalTest {




    public static void main(String[] args) {


        //修饰局部变量，这个变量不能进行修改，一次赋值，终身不变
        final  int num=1;

        //保证有唯一次赋值
        final int num1;
          num1=1;

        /*
        * 对基本类型来说，不可改变说的变量中的数据不可改变
        * 对引用类型来说，不可改变指的是变量中的地址值不可改变
        * */
        final  Persion aa = new Persion("aa");
        System.out.println(aa.getName());
        System.out.println(aa);
        //错误写法，final的引用类型变量，其中的地址不可改变
        //Persion aa = new Persion("bb", 11);

        //内容不可变
        //aa.setName("bb");
        System.out.println(aa.getName());
        System.out.println(aa);






    }








}
