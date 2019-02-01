package com.set.map;

public class persion extends Object {

        private String name;
        private int age;

    public persion() {
    }

    public persion(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "persion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
