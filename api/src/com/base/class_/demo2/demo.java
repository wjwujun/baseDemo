package com.base.class_.demo2;


/*
*匿名内部类:
*   如果接口的实现类（或者是父类的子类）只需要使用一次，可以使用匿名内部类
*格式:
*   接口名称 对象名 =new 接口名(){
*
*       //覆盖重写抽象方法
*   }
*注意事项：
*       1、匿名内部类在创建对象的时候，只能使用唯一一次
*
* */
public class demo {
    public static void main(String[] args) {

        /*MyInterfaceImpl myInterface = new MyInterfaceImpl();
        myInterface.method();*/


        //匿名内部类
        MyInterface obj = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类重写了 接口方法");
            }
        };
        obj.method(); //只能使用唯一一次

    }

}
