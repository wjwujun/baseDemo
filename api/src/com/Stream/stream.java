package com.Stream;

import java.util.*;
import java.util.stream.Stream;


/*
* stream集合
*   所有collection都可以用流
*
* 特点：
*   属于管道流，只能消费一次
*   第一个stream流调用完毕，数据流就会流转到下一个stream上
*   所以第一个stream流就不能在调用了
*
* */
public class stream {

    public static void main(String[] args) {
        demo9();
    }

    /*
    * concat
    * 合并两个流为一个流
    * */
    private static void demo9() {
        Stream<String> stream = Stream.of("aa","bb","cc","dd","ee");
        Stream<String> stream1 =Stream.of("张山", "张劳务", "张我又","历史","汪汪","王麻子");
        //将两个流合并成一个
        Stream<String> concat = Stream.concat(stream, stream1);
        concat.forEach(name-> System.out.println(name));



    }


    //skip,跳过前几条
    private static void demo8() {
        String[] arr={"aa","bb","cc","dd","ee"};
        Stream<String> stream = Stream.of(arr);
        //跳过前3个元素
        Stream<String> skip = stream.skip(3);
        skip.forEach(name-> System.out.println(name));

    }


    /*
     *limit，取用前n个方法
     *是一个延迟方法
     */
    private static void demo7() {
        String[] arr={"aa","bb","cc","dd","ee"};
        Stream<String> arr1 = Stream.of(arr);
        //使用limit对stream流中的元素进行截取
        Stream<String> limit = arr1.limit(3);
        limit.forEach(name-> System.out.println(name));



    }


    //count是一个终结方法,不能继续调用其他方法，返回值是一个long，统计个数的方法
    private static void demo6() {
        List<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        Stream<Integer> stream = list.stream();
        long count = stream.count();

        System.out.println(count);


    }


    //map方法，转化
    private static void demo5() {
        Stream<String> stream = Stream.of("1", "2", "3", "4");
        //使用map，把string类型的整数转化成，integer类型的整数
        Stream<Integer> stream1 = stream.map((String name) -> {
            return Integer.parseInt(name);
        });

        //遍历
        stream1.forEach((i)-> System.out.println(i));


    }

    /*
    * filter过滤
    *   参数是predicate 是一个函数式接口
    *   prreicate中的抽象方法
    *       boolean  test(t)
    * */
    private static void demo4() {
        List<String> list=new ArrayList<>();

        list.add("张山");
        list.add("张劳务");
        list.add("张我又");
        list.add("历史");
        list.add("汪汪");
        list.add("王麻子");
        Stream<String> stream = list.stream();

        //对流中的元素进行过滤
        Stream<String> stream1 = stream.filter((String name) -> {
            return name.startsWith("张");
        });

        //遍历
        stream1.forEach((name)-> System.out.println(name));
    }

    /*
     *foreach,遍历流中的数据
     *  是一个总结方法，遍历之后不能再继续调用stream流中的其他方法
     *
     */
    private static void demo3() {
        List<String> list=new ArrayList<>();

        list.add("张山");
        list.add("张劳务");
        list.add("张我又");
        list.add("历史");
        list.add("汪汪");
        list.add("王麻子");
        Stream<String> stream = list.stream();

        //使用foreach对stream流中的数据进行遍历
        /*stream.forEach((String name)->{
            System.out.println(name);
        });*/
        //优化
        stream.forEach((name)-> System.out.println(name));



    }

    //把集合转还成stream流
    private static void demo2() {
        //把集合转还成stream流
        List<String> list=new ArrayList<>();
        Stream<String> stream = list.stream();

        Set<String > set=new HashSet<>();
        Stream<String> stream1 = set.stream();

        //map集合转化成集合
        Map<String,String> map=new HashMap<>();
        Set<String> keyset = map.keySet();
        Stream<String> stream2 = keyset.stream();

        Collection<String> values = map.values();
        Stream<String> stream3 = values.stream();

        //获取键值对(键与值的映射关系)
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream4 = entries.stream();

        //把数组转成stream流
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        //可变参数转成
        Integer[] arr={1,2,3,4,5};
        Stream<Integer> arr1 = Stream.of(arr);




    }

    private static void demo1() {
        List<String> list=new ArrayList<>();

        list.add("张山");
        list.add("张劳务");
        list.add("张我又");
        list.add("历史");
        list.add("汪汪");
        list.add("王麻子");

        //使用stream流
        list.stream()
                .filter(name->name.startsWith("张"))
                .filter(name->name.length()==3)
                .forEach(name-> System.out.println(name));
    }
}
