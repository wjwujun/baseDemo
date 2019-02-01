package com.base.Anonymous;


/*
* 匿名对象:
*   只有右边的对象，没有左边的名字;
*   new 类名称();
*
*   注意事项：匿名对象只能使用唯一一次，下次再用不得不在创建的一个新对象。
* */
public class AnonymousTest {

    public static void main(String[] args) {
        //左边的是名字
        Persion one=new Persion();
        one.name="帅哥";
        one.showName(); //我叫帅哥
        System.out.println("-----------------------------");

        //匿名对象
        new Persion().name="丑鬼";
        new Persion().showName(); //我叫null


    }

}


