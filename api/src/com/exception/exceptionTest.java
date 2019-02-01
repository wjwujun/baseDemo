package com.exception;

import java.text.SimpleDateFormat;

/*
* java.lang.Throwable是所有异常或错误的超类
*   Exception：编译期异常
*   RuntimeException:运行期异常，java程序运行过程中出现的问题
*
*   Error：错误
*       无法治愈的毛病，必须修改源代码
*
* */
public class exceptionTest {

    public static void main(String[] args) {
        //Exception:编译异常，进行编译
        //SimpleDateFormat sim = new SimpleDateFormat("yyyy-mm-dd");
        //int[] arr=null;
        /*int[] arr=new int[3];

        int i = demo1(arr, 3);
        System.out.println(i);*/


        /*
        *
        * */





    }

    /*
    *
    * throw关键字
    * 注意：
    *   1.必须写在方法的内部
    *   2.throw关键字后边new的对象必须是exception或者他的子类
    *   3.throw后面创建的关键字，是RunTimeExcepton或者是他的子类对象，我们可以不处理，交给jvm处理
    *
    * */
    private static int demo1(int[] arr,int index) {
        /*
        * NullPointerException是一个运行期异常，默认可以不处理
        * */
        if(arr==null){
            throw  new NullPointerException("传递的数组值null");
        }
        /*
        * 对传递过来的参数进行合法性校验
        * 如果index的范围不在数组的索引范围，可以抛出越界异常
        * */
        if(index<0 || index>arr.length-1 ){
            throw  new ArrayIndexOutOfBoundsException("数组所以越界");
        }

        int ele=arr[index];
        return ele;
    }


}
