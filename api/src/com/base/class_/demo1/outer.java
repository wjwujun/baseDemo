package com.base.class_.demo1;


//如果出现了重名现象，那么格式是，外部类名.this.外部类成元变量名
public class outer {

    int num=10;   //外部成员变量

    public class inner{
        int num=20; //内部成员变量

        public void methodInner(){

            int num=30;  //内部方法的局部变量

            System.out.println(num);        //局部变量就近原则
            System.out.println(this.num);   //内部类的成员变量
            System.out.println(outer.this.num);  //外部类的成员变量

        }
    }


}
