package com.exception;

/*
* 自定义异常类
*
* 格式：
* public class RegistException extend Exception|RunTimeException{
*    添加一个空参数构造方法
*    添加一个带异常信息的构造方法
* }
*
*注意：
*   1.自定义异常类一般都是 Exception结尾
*   2.
*
*
* */
public class RegistException extends Exception {

    //添加一个空参数的构造方法
    public RegistException() {

    }

    /*
    *添加一个带异常信息的构造方法
    *
    *方法内部调用父类的方法，来处理
    *
    */

    public RegistException(String message) {
        super(message);
    }


}
