package com.base.arrayLIst;


import java.util.ArrayList;

/*
    普通数组不可以改变长度
*   arrayList数组可以改变长度
*
* */
public class arayLIstTest {

    public static void main(String[] args) {

        /*
        * 创建一个长度为3的普通数组
        * */
        Persion[] array = new Persion[3];
        Persion one = new Persion("大哥", 10);
        Persion second = new Persion("老二", 10);
        Persion third = new Persion("老三", 10);

        //将one中的地址值,
        array[0]=one;
        array[1]=second;
        array[2]=third;
        System.out.println(array[0].getName());

        System.out.println("------------------------------------------------");

        /*
        * 创建一个arrayList
        *   备注：
        *       从JDK1.7+起，右侧的<>可以不写内容，但是<>必须写
        *   注意事项：
        *       对于arrayList来说，直接打印的不是地址值，而是内容
        *       如果内容是空，得到的是中括号:[]
        *
        *       add添加方法一定成功，其他集合不一定
        *
         *
        *
        * */

        ArrayList<Object> list = new ArrayList<>();
        System.out.println(list);  //[]


        //添加元素
        list.add("大大");
        list.add("dd");
        list.add("vv");
        System.out.println(list);
        System.out.println("-----------------------------------------------------");

        //获取元素，参数是索引编号，返回值就是对应位置的元素
        //Object str = list.get(1);
        //System.out.println(str);

        //删除元素，参数是索引编号，返回值就是被删除的元素
        //Object remove = list.remove(2);
        //System.out.println(remove);

        //获取集合长度，返回值就是包含元素的个数
        //System.out.println(list.size());

        //循环遍历
        /*for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }*/
        System.out.println("-----------------------------------------");

        /*
         *  从JDK1.5+开始，支持自动装箱，自动拆箱
         *  自动装箱：基本类型->包装类型
         *  自动拆箱：包装类型->基本类型
         *  泛型只能存储复合类型，如果要存储基本类型(int，long)要要用包装类
         *  包装类都在java.lang包下
         *  基本类型： byte short int     long float double  char       boolean
         *  包装类：   Byte Short Integer Long Float Double  Character  Boolean
         */
         ArrayList<Integer> list1=new ArrayList<>();
         list1.add(11);
         list1.add(22);
         list1.add(33);
         System.out.println(list1);

        
    }

}
