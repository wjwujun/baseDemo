package com.set.list.linkedList;


import java.util.LinkedList;

/*
*
* linkList 的特点
*       1、底层是链表结构，查询慢，增删快
*       2、里面包含了大量操作 首尾的 方法
*注意：
*   不能使用多态
*
* */
public class linkedListTest {

    public static void main(String[] args) {
        demo1();
    }

    private static void demo1() {
        LinkedList<String> linked = new LinkedList<>();

        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);

        //向头部添加元素
        linked.addFirst("111");
        System.out.println(linked);

        linked.push("2222");  //等效于addFirst
        System.out.println(linked);
        System.out.println("----------------------------");


        //向末尾添加，等效于add
        linked.addLast("last");
        System.out.println(linked);
        System.out.println("----------------------------");

        //获取第一个
        String first = linked.getFirst();
        System.out.println(first);
        //获取最后一个
        String last = linked.getLast();
        System.out.println(last);

        System.out.println("------------------");
        //移除第一个元素和最后一个
        String s = linked.removeFirst();
        System.out.println(s);
        String s1 = linked.removeLast();

        System.out.println(s1);
        System.out.println(linked);




        //清空元素
        /*linked.clear();
        System.out.println(linked);*/


    }
}
