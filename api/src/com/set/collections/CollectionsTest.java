package com.set.collections;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/*
* collection是所有单列集合的最顶层接口
* 任意单列结合都可以使用
*
*
* */
public class CollectionsTest {

    public static void main(String[] args) {
        demo4();
    }

    /*
    * comparable和comparator区别
    * comparable：自己的参数和别人比较，需要重写参数接口，重写比较方法compareto
    * comparator:找个第三方裁判
    *
    * */
    private static void demo4() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);



        Collections.sort(list, new Comparator<Integer>() {

            //重写比较的规则
            @Override
            public int compare(Integer o1, Integer o2) {
                //return  o1-o2; //升序排序
                return  o2-o1; //降序排序

            }
        });
        System.out.println(list);


        ArrayList<persion1> list1 = new ArrayList<>();
        list1.add(new persion1("张山",10));
        list1.add(new persion1("李四",11));
        list1.add(new persion1("王洼子",11));
        list1.add(new persion1("老大",13));
        Collections.sort(list1, new Comparator<persion1>() {
            @Override
            public int compare(persion1 o1, persion1 o2) {

                int re= o1.getAge()-o2.getAge(); //按年龄升序排序
                //如果年龄相等，使用名字的第一个字母排序
                if (re==0){
                    re=o1.getName().charAt(0)-o2.getName().charAt(0);
                }
                return re;
            }
        });
        System.out.println("------------");
        System.out.println(list1);




    }


    /*
    * 排序
    * sort排序接口里面必须实现一个compareto接口
    * */
    private static void demo3() {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("e");
        list.add("d");
        list.add("c");
        list.add("b");
        System.out.println(list);
        Collections.sort(list);

        System.out.println(list);
        System.out.println("---------------------------------");

        /*
        * 自定义排序
        *  Comparable排序规则
        *   自己（this）-参数  升序
        *   参数  - 自己（this）  降序
        * */
        ArrayList<persion> list1 = new ArrayList<>();
        list1.add(new persion("张山",10));
        list1.add(new persion("李四",11));
        list1.add(new persion("王洼子",21));
        list1.add(new persion("老大",13));

        Collections.sort(list1);
        System.out.println(list1);
    }

    /*
    * addAll
    * shuffie
    * */
    private static void demo2() {
        ArrayList<String> list = new ArrayList<>();
        /*list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");*/

        //往集合中添加多个元素
        Collections.addAll(list,"a","b","c","d","e");
        System.out.println(list);
        //打乱集合中的元素顺序
        Collections.shuffle(list);
        System.out.println(list);


    }

    private static void demo1() {
        //创建集合对象，可以使用多态
        Collection<String> coll =new ArrayList<>();
        System.out.println(coll);  //重写了toString方法

        boolean b1 = coll.add("张珊");  //add方法,返回值是boolean
        coll.add("历史");
        coll.add("王五");
        coll.add("赵柳");

        System.out.println(coll);
        System.out.println("---------------------------------------");

        boolean b2 = coll.remove("历史");  //remove,返回值是boolean，集合中存在元素会删除元素，返回true
        System.out.println(b2);
        System.out.println(coll);

        System.out.println("---------------------------------------");
        //contains,判断是否包含
        boolean b3 = coll.contains("王五");
        System.out.println(b3);

        System.out.println("---------------------------------------");
        //isEmpty判断是否为空
        boolean b4 = coll.isEmpty();
        System.out.println(b4);
        System.out.println("---------------------------------------");

        //返回集合元素中的个数
        int b5 = coll.size();
        System.out.println(b5);
        System.out.println("---------------------------------------");

        //把集合中的元素存储到数组中
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("---------------------------------------");

        //清空集合中的元素，但是不删除元素，集合还在
            coll.clear();
            System.out.println(coll);

    }

}
