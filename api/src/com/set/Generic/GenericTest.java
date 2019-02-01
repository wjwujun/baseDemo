package com.set.Generic;



/*
*
* 泛型
* */
public class GenericTest {
    public static void main(String[] args) {

        demo4();
        
    }


    /*
     *泛型通配符：? 表示任意类型数据
     * 使用方式
     *      不能创建对象使用
     *      只能作为方法使用
     */
    private static void demo4() {
        

    }

    //测试含有泛型的接口
    private static void demo3() {
        GenericInterfaceImpl ge = new GenericInterfaceImpl();
        //ge.method("ssss");

        GenericInterfaceImpl1<Integer> ge1 = new GenericInterfaceImpl1<>();
        ge1.method(111);

    }

    //泛型方法
    private static void demo2() {
        GenericMethod gc2 = new GenericMethod();
        gc2.method("fsdf");
        gc2.method(111);
        gc2.method(true);
        System.out.println("---------------");
        //静态泛型
        GenericMethod.method2("sss");

    }

    //泛型类
    public static void demo1(){
        //不写泛型，默认是object类型
        GenericClass gc = new GenericClass();
        gc.setName("haha");
        Object obj = gc.getName();


        //泛型使用Integer
        GenericClass<Integer> gc2 = new GenericClass<>();
        gc2.setName(22);
        Integer name = gc2.getName();

        //使用string
        GenericClass<String> gc3 = new GenericClass<>();
        gc3.setName("fasdf");
        String name1 = gc3.getName();
    }
}
