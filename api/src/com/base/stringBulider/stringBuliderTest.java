package com.base.stringBulider;


/*
* 字符串缓冲区，可以提高字符串的操作效率
*
* */
public class stringBuliderTest {

    public static void main(String[] args) {
        demo3();

    }


    //totring
    private static void demo3() {
        String str="hello";
        System.out.println(str);
        System.out.println("---------");
        StringBuilder bu1 = new StringBuilder(str);
        bu1.append("world");
        System.out.println(bu1);
        System.out.println("---------");

        String s = bu1.toString();

        System.out.println(s);



    }

    //append
    private static void demo2() {
        //空参数方法,初始容量为16个字符
        StringBuilder bu1 = new StringBuilder();

        //使用append方法向String中添加数据,无需接收返回值，【接收任意格式数据】
        bu1.append("abc");
        bu1.append("1");
        bu1.append("true");
        bu1.append("中");

        System.out.println(bu1);

    }
    //构造
    private static void demo1() {
        //空参数方法,初始容量为16个字符
        StringBuilder bu1 = new StringBuilder();
        System.out.println(bu1);

        StringBuilder bu2 = new StringBuilder("abc");
        System.out.println(bu2);

    }
}
