package com.base.static_;


/*
* static 修饰成员变量
* 如果一个成员变量使用了static，那么这个变量就不再属于对象自己，而是属于所在的类，多个对象共享同一个数据
* */
public class staticTest {
    public static void main(String[] args) {
        student one = new student("老大", 10);
        one.room="101教师";
        student two = new student("老2", 10);
        System.out.println(one+" "+one.room);
        System.out.println(two+" "+two.room);
        System.out.println("--------------------------------------------");

        /*
        * 一旦使用static修饰成员方法，就成了静态方法，静态方法不属于对象，属于类
        *
        * 注意：
        *   静态不能直接访问非静态
        *   因为内存中【先】有静态方法，【后】有非静态方法
        * */
        myClass obj = new myClass();
        obj.method();
        //对于静态方法来说，可以通过对象名进行调用，也可以通过类直接调用
        //obj.methodStatic();   //正确，不推荐，这种写法在编译后也会被翻译成"类名称.静态方法"
        //myClass.methodStatic(); //正确，推荐

        /*
        * 静态代码块
        * */
        System.out.println("------------------------------------");

        Persion persion = new Persion();
        Persion persion1 = new Persion();




    }

}
