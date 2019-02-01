package com.set.Generic;

/*
*泛型是指一个未知的数据类型,当我们不确定什么数据类型的时候,可以使用泛型
*泛型可以接受任意数据,可以使用Integer,String,
*
* */
public class GenericClass <E>{
    private   E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}

