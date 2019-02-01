package com.set.iterator;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



public class iteratorTest {
    public static void main(String[] args) {
        demo2();
    }

    /*
    *增强for循环
    *jDK1.5以后的新特性
    * */
    private static void demo2() {
        ArrayList<String> list= new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        for (String s : list) {
            System.out.println(s);
        }

    }
    private static void demo1() {
        Collection<String> coll=new ArrayList<>();
        coll.add("要命");
        coll.add("科比");
        coll.add("麦迪");
        coll.add("詹姆斯");
        coll.add("艾福成");

        Iterator<String> it = coll.iterator();
        boolean b = it.hasNext();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }


}
