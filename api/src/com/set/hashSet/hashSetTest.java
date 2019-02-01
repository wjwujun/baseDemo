package com.set.hashSet;



import java.util.HashSet;
import java.util.Iterator;

/*
*set 接口继承了collection
* 特点：
*   1、不允许存储重复的元素
*   2、没有索引，没有带索引的方法，不能使用普通for循环遍历
*
* HashCode集合存储数据结构(哈希表)：
*   jdk1.8之前  哈希表=数组+链表
*   jdk1.8之后：
  *     哈希表=数组+链表(长度低于8位的时候是链表)
  *     哈希表=数组+红黑树(长度超过8位的时候，提高查询速度)
*
*
* */
public class hashSetTest {

    public static void main(String[] args) {
        int i = demo4("sf",1.5,20,24,64,4,6);
        System.out.println(i);
    }


    /*
    * 可变参数
    * 使用前提：
    *   当方法的参数列表数据类型已经确定，但是参数的个数不确定的时候，就可以使用可变参数
    * 使用格式：
    *   修饰符 返回值 方法名(数据类型...变量名){}
    * 注意:
    *   1、一个方法的参数列表，只能有一个可变参数
    *   2、如果方法的参数有多个，可变参数必须卸载参数列表的末尾
    * */
    private static int demo4(String a,double b,int c,int... arr) {
    //private static int demo4(int... arr) {
        System.out.println(arr);
        System.out.println(arr.length);
        return 0;
    }


    //set集合不允许重复元素的原理
    private static void demo3() {
        HashSet<String>  set= new HashSet<>();
        String s1 = new String("abc");
        String s2 = new String("abc");
        set.add(s1);
        set.add(s2);
        set.add("哈哈");
        set.add("不爱换个");
        set.add("abc");
        System.out.println(set);

    }

    /*
    * 哈希值:
    *   是一个十进制的整数，由系统随机给出
    *       (就是对象的地址值，是一个逻辑地址，
    *       是模拟得到的地址，不是数据实际物理地址)
    *   object有一个方法获取对象的hash值
    *   hashcode方法的源码:
    *    public native int hashCode();
    *    native 代表该方法调用的是本地操作系统的方法
    * */
    private static void demo2() {
        //persion继承了object所以可以使用object方法的hashcode
        persion p1 = new persion();
        int h1 = p1.hashCode();
        System.out.println(h1);  //1163157884

        persion p2 = new persion();
        int h2 = p2.hashCode();
        System.out.println(h2);  //1956725890

        System.out.println("-------------------------");
        System.out.println(p1);   //hashcode的十六进制
        System.out.println(p2);

        System.out.println("-------------------------");

        /*
        * string的hash值
        *  string重写了object的hashcode方法
        *
        * */
        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());



    }

    /*
    * hashSet
    * 特点：
    *   1、不允许存储重复的元素
    *   2、没有索引，没有带索引的方法，不能使用普通for循环遍历
    *   3、无序的集合，存储元素和取出元素的顺序有可能不一致
    *   4、底层是一个hash表结构，查询速度非常快
    * */
    private static void demo1() {
        HashSet<Integer>  set= new HashSet<>();

        //add
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);
        System.out.println(set);
        System.out.println("--------------");
        //不能使用普通for循环
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("--------------------");
        //增强for循环
        for (Integer integer : set) {
            System.out.println(integer);
        }



    }
}
