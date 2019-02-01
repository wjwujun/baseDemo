package com.thread.baozi;

/*
* 测试类
* */
public class test {

    public static void main(String[] args) {
        BaoZi bz = new BaoZi();

        //创建包子铺线程，生产包子
        new BaoziPu(bz).start();
        //创建吃货线程，吃耗子
        new ChiHuo(bz).start();




    }
}
