package com.set.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class listTest {

    public static void main(String[] args) {
        //创建一个list集合，多态
        List<String> list=new ArrayList<>();

        //添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);   //重写了toString


        //在a和b 之间添加一个haha
        list.add(1,"haha");
        System.out.println(list);


        //移除元素，返回被移除的元素
        String name = list.remove(1);
        System.out.println(name);

        //替换元素
        list.set(2,"aaaaa");
        System.out.println(list);
        System.out.println("-----------------------------------");


        //list遍历有3总方式
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("-----------------------------------");

        Iterator<String> it = list.iterator();  //迭代器
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("-----------------------------------");
        for (String s : list) {         //增强for循环
            System.out.println(s);
        }

    }

}
