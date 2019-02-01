package com.base.scanner;


import java.util.Scanner;

/*
* 键盘输入
* */
public class ScannerTest {

    public static void main(String[] args) {

        //创建
        Scanner sc = new Scanner(System.in);

        //获取数字
        int num = sc.nextInt();
        System.out.println("输入的数字="+num);

        //获取字符串
        String str = sc.next();
        System.out.println("输入的字符串="+str);

    }
}
