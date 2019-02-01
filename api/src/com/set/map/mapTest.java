package com.set.map;


import java.util.*;


/*
* map是一个双列集合
*  key value 的数据类型可以相同，也可以不同
*  key是不允许重复的，value可以重复
*  key和value可以以一一对应
*HashMap特点
*   1、HashMap底层是哈希表+单项链表，查寻速度块
*   2.无序集合，存储和取出的元素位置可能不一样
*LinkedHashmap
*   1. 有序集合
*   2. 哈希表+链表/红黑树
*
* */
public class mapTest {
    public static void main(String[] args) {
        demo9();
    }


    //hashTable
    private static void demo9() {
        /*
        * hashMap可以存储null值，null键
        * hashTable不能存储null
        *
        * */
        Map<String, String> map = new HashMap<>();
        map.put(null, "a");
        map.put("b", null);
        System.out.println(map);

        System.out.println("------------");

        Hashtable<String, String> table = new Hashtable<>();
        table.put(null,"a");
        table.put("b",null);
        System.out.println(table);  //报错，NullPointerException

    }


    //linkedHashMap
    private static void demo8() {
        /*
        *底层原理
        *   哈希表+链表（记录元素的顺序）
        *
        * */
        Map<String, String> map = new LinkedHashMap<>();
        map.put("a", "a");
        map.put("b", "b");
        map.put("c", "c");
        map.put("a", "a");
        System.out.println(map);  //存什么样的顺序，取什么顺序

    }

    //自定义数据
    private static void demo7() {
        Map<String, persion> map = new HashMap<>();
        map.put("a", new persion("bb",12));
        map.put("b",  new persion("aa",21));
        map.put("c",  new persion("cc",11));

        Set<String> set = map.keySet();
        for (String s : set) {
            persion persion = map.get(s);
            System.out.println(persion);

        }


    }


    //entry
    private static void demo6() {
        /*
        * map集合遍历的第二种方式
        *使用entryset，将map集合中的多个entry对象取出来，存储到set
        * 便利set获取每一个entry
        * 使用entry获取getKey和getvalue获取键值
        *
        *
        * */
        Map<String, String> map = new HashMap<>();
        map.put("1", "aa");
        map.put("2", "bb");
        map.put("3", "cc");
        Set<Map.Entry<String, String>> set = map.entrySet();

        Iterator<Map.Entry<String, String>> it = set.iterator();
        while (it.hasNext()){
            Map.Entry<String, String> entry = it.next();
            //使用getkey和getvalue方法获取
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key+"-->"+value);
        }
        System.out.println("----------------------");
        //增强for
        for (Map.Entry<String, String> entry : set) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }



    //keyset
    private static void demo5() {
        /*
        * map集合的第一种遍历方式，通过k找v的方式
        * 使用map中的keyset把map集合中所有key取出来，存储到set中
        * 遍历set集合，获取map的每一个key
        * 通过map的get方法获取value
        * */
        Map<String, String> map = new HashMap<>();
        map.put("1", "aa");
        map.put("2", "bb");
        map.put("3", "cc");

        Set<String> set = map.keySet();
        //迭代器
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String key = it.next();
            //通过map集合的get方法，找到value
            String value = map.get(key);
            System.out.println(value);
        }
        System.out.println("--------------");

        //增强for循环
        for (String s : set) {
            System.out.println(map.get(s));
        }

    }

    //containsKey
    private static void demo4() {
        /*
        *containsKey
        * 判断集合中的key是否存在
        * */
        Map<String, String> map = new HashMap<>();
        map.put("1", "aa");
        map.put("2", "bb");
        map.put("3", "cc");
        boolean b = map.containsKey("2");
        System.out.println(b);

    }


    //get
    private static void demo3() {
        /*
        * key存在返回value
        * 不存在返回null
        * */
        Map<String, String> map = new HashMap<>();
        map.put("1", "aa");
        map.put("2", "bb");
        map.put("3", "cc");

        System.out.println(map.get("2"));

    }


    //remove
    private static void demo2() {
        /*
        * key存在，value返回被删除的值
        * key不存在，返回null
        * */
        Map<String, String> map = new HashMap<>();
        map.put("1", "aa");
        map.put("2", "bb");
        map.put("3", "cc");

        System.out.println(map);
        String remove = map.remove("2");
        System.out.println(remove);
        System.out.println(map);



    }


    //put方法
    private static void demo1() {
        /*
        * put 把制定的键和值写入map集合
        *   key不重复，返回的是null
        *    key重复，新的value替换value，返回被替换的value
        *
        * */

        Map<String, String> map = new HashMap<>();
        String put = map.put("ss", "da");
        System.out.println(put);

        String put1 = map.put("ss", "ddddddd");
        System.out.println(put1);
        System.out.println("-------------------------");
        System.out.println(map);


    }


}
