package com.base.final_;

public class Persion {
    private  String name;
    private int age;

    /*
     *1、修饰成员变量，由于成员有默认值，所以用了final后必须手动赋值，不会再给默认值了
     * 2、通过构造方法赋值。只有这两种赋值方法
     * 3、必须保证类中所有重载的构造方法，最终会对final的成员变量进行赋值
     */
    //private final  String sex="dsd";
    private final  String sex;



    public Persion() {
        sex="sss";
    }

    public Persion(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    /*public void setName(String name) {
        this.name = name;
    }*/

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
