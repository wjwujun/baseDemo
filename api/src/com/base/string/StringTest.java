package com.base.string;


/*
* 字符串
*
* java.lang.String 类代表字符串
* Api当中说"abc" 都是此类的实例实现
* 其实就是说：程序中所有的双引号字符串，都是String类的对象（就算没有new，也是）
*
* 字符串特点：
*   1、字符串的内容用不可改变（重点）
*   2、正是因为字符串不可改变， 所以字符串是可以共享使用
*   3、字符串效果上相当于char[]字符数组，但是底层原理是byte[]字节数组
*
*  字符串创建3+1方法
*  三种构造方法：
*   public String():创建一个空白字符串，不包含任何内容
*   public String(char[] array):根据字符数组内容创建
*   public String(byte[] array):根据字节数组创建
*  一种直创建:
* */
public class StringTest {

    public static void main(String[] args) {
        //使用空参创建
        String str1 = new String(); //小括号留空，说明字符串内容都没有
        //System.out.println("第一个字符串："+str1);

        //使用字符数组创建
        char[] charArray={'A','b','c','d'};
        String str2 = new String(charArray);
        //System.out.println("第2个字符串："+str2);

        //使用字符数组创建
        byte[] byteArray={1,2,3,4};
        String str3 = new String(byteArray);
        //System.out.println("第3个字符串："+str3);

        //直接创建
        String str4="hello";
        //System.out.println("第4个字符串："+str4);



        /*
        * 字符串的产量池：程序中直接写上双引号字符串，就在产量池中
        *  对于基本类型来说：==是进行数值的比较
        *  对于引用类型来说: ==是进行【地址值】的比较
        * */
        String strA = "ddd";
        String strB = "ddd";
        char[] aa={'d','d','d'};
        String strC = new String(aa);
        /*System.out.println(strA==strB);
        System.out.println(strA==strC);
        System.out.println(strB==strC);*/


        /*
         * 进行对象的地址值比较，要比较字符串内容可以用equals
         * a.equals(b)和被b.equals(a)一样
         * 如果比较一个常量和一个变量，推荐把长量字符串写在前面
         * "abc".equals(str)
         * 例如：
         *  String str=null
         *  "abc".equals(str)   //flase
         *  str.equals("abc")   //会报错
         */
        /*System.out.println(strA.equals(strB));
        System.out.println(strA.equals(strC));*/

        /*String st1 = "ddd";
        String st2 = "DDD";
        System.out.println(st1.equals(st2));
        System.out.println(st1.equalsIgnoreCase(st2));  //忽略大小写*/

        //拿到字符串长度
        int length = "sdgsrgsdgfdsg".length();
        System.out.println("字符串长度："+length);
        System.out.println("------------------------------------");

        //拼接字符串
        String st1="hello";
        String st2="world";
        String st3=st1.concat(str2);

        System.out.println(st1);  //不会变化
        System.out.println(st2);  //不会变化
        System.out.println(st3);  //新的字符串
        System.out.println("------------------------------------");

        //获取指定索引位置的单个字符
        char ch="hello".charAt(1);
        System.out.println(ch);
        System.out.println("------------------------------------");

        //查找参数字符串在本来字符串中出现的第一次索引位置，如果没有返回-1
        String original="HelloWorld";
        int llo = original.indexOf("llo");
        System.out.println(llo);

        int abc = original.indexOf("abc");
        System.out.println(abc);
        System.out.println("------------------------------------");

        //字符串截取方法，
        String sub="HelloWorld";
        String sub1=sub.substring(5);  //截取参数位置到子字符串末尾
        System.out.println(sub);   //HelloWorld,原封不动
        System.out.println(sub1); // World新字符串

        String sub2=sub.substring(4,7);  //截取参数1到参数2之间的位置
        System.out.println(sub2);

        System.out.println("------------------------------------");

        //转换方法，转化成字符数组
        char[] chars = "hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);

        //转化成字节数组
        byte[] bytes = "abc".getBytes();
        System.out.println(bytes[0]);
        System.out.println("------------------------------------");

        //替换字符串
        String str0="how are you";
        String str01 = str0.replace("are", "cccc");

        System.out.println(str0);
        System.out.println(str01);
        System.out.println("------------------------------------");

        //分割方法,split的参数是一个正则表达式
        String str11="aaa,ccc,vvv";
        String[] split = str11.split(",");
        /*for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }*/
        String str12="aa.cc.vv";
        String[] split1 = str12.split("\\.");
        for (int i = 0; i < split1.length; i++) {
            System.out.println(split1[i]);
        }

        System.out.println("------------------------------------");


    }
}
