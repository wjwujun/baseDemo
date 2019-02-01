package com.set.Generic;

/*
*
* 含有泛型接口的第一种使用方式
* */
public class GenericInterfaceImpl  implements GenericInterface<String>{


    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
