package com.set.collections;

public class persion implements Comparable<persion> {
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

    //重写排序的规则
    @Override
    public int compareTo(persion o) {
        //return 0;//认为元素都是相同的
        //自定义比较的规则，比较两个人的年龄(this,参数person)
        //   return this.getAge()-o.getAge();//年龄升序排序
        return o.getAge()-this.getAge();//年龄升序排序




    }
}
