package com.base.arraysUtil;

import java.util.Arrays;

public class arrayTest {
    public static void main(String[] args) {
        int[] intArray={1,2,3,4};
        //将int[]数组按默认格式变字符串
        String s = Arrays.toString(intArray);
        System.out.println(s);

        /*
         * 排序
         *  1.如果是数值，sort默认按升序
         *  2、如果是字符串，sort按字母升序
         *  3、如果是自定义类型，那么这个自定义需要有comparable或者comparator接口的支持
         */
        int[] sortArray={2,8,3,4,41};
        Arrays.sort(sortArray);
        System.out.println(Arrays.toString(sortArray));


        String[] strArray={"aaa","ccc","bbbb"};
        Arrays.sort(strArray);
        System.out.println(Arrays.toString(strArray));
    }

}
