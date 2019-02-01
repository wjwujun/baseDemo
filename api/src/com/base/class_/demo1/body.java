package com.base.class_.demo1;



public class body {   //外部类


    public class heart{   //成员内部类
        public void  beat(){
            System.out.println("内部类：心脏跳动 蹦蹦");

            System.out.println("调用外部类方法：我叫"+name);

        }
    }

    private String name;


    public  void  methondBody(){
        System.out.println("外部类的方法");
        //间接使用
        new heart().beat();

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
