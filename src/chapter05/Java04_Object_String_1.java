package chapter05;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @program: java-top-speed
 * @author: Mr.WorldWind
 * @create: 2023/2/21  19:06
 **/
public class Java04_Object_String_1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String a = "a";
        String b = "A";
        /*System.out.println(a.equals(b));//相等的比较
        System.out.println(a.equalsIgnoreCase(b));//忽略大小写的比较*/
        /**
         *  i = 负数 a < b
         *  i = 正数 a > b
         *  i = 0   a = b
         */
        int i = a.compareTo(b);
        System.out.println(i);//32

        byte b1 = (byte) 'a';
        byte b2 = (byte) 'A';
        System.out.println("a = " + b1);//97
        System.out.println("A = " + b2);//65
        System.out.println(a.compareToIgnoreCase(b));//0 忽略相等

        //TODO 字符串的截断操作
        String s = "Hello World";
        //子字符串
        //substring方法用于截取字符串,需要传递两个参数
        //  第一个参数表示截取字符串的起始位置(索引,包含)
        //  第二个参数表示截取字符串的结束位置(索引,不包含)
        //System.out.println(s.substring(0, 3));//Hel
        /**想要截取Hello*/
        System.out.println(s.substring(0, "Hello".length()));
        /**想要截取World*/
        System.out.println(s.substring(6, s.length()));
        System.out.println("牛逼");
        System.out.println("GitTest,看看能不能传上去");
        System.out.println("Hello World");
        /**substring方法如果只传入一个参数,那么就表示从指定位置,截取到最后*/
        System.out.println(s.substring(6));//World

        //分解字符串 根据指定规则对字符串进行分解,可以将一个完整的字符串,分解成几部分
        String[] s1 = s.split(" ");
        System.out.println(s1.length);
        System.out.println(Arrays.toString(s1));
        String s2 = "liyuhang,kongfansheng,wangjunbo,lihuanying,zhangwei";
        String[] split = s2.split(",");
        System.out.println(Arrays.toString(split));
        for (String s3 : split) {
            System.out.println(s3);
        }
        //TODO trim : 去掉字符串的首位空格
        String s3 = "   Hello World         ";
        System.out.println("!"+s3.trim()+"!");//!Hello World!

        //TODO 字符串的替换
        String s4 = "Hello World World";
        //替换,只能替换一个
        System.out.println(s4.replace("World", "Java"));//Hello Java Java
        String s5 = "Hello World zhangsan";
        //replaceAll按照指定的规则进行替换
        System.out.println(s5.replaceAll("World|zhangsan", "Java"));//Hello Java Java

        //TODO 字符串的大小写替换
        String s6 = "Hello World";
        System.out.println(s6.toLowerCase());//hello world
        System.out.println(s6.toUpperCase());//HELLO WORLD
        /**需求,首字母大写*/
        String s7 = "user";
        String c = s7.substring(0,1);
        String d = s7.substring(1);
        System.out.println(c.toUpperCase() + d);

        //TODO 字符串的查找
        String s8 = "Hello World";
        char[] chars = s8.toCharArray();
        byte[] bytes = s8.getBytes("UTF-8");
        //charAt可以传递索引定位字符串中指定位置的字符
        System.out.println(s8.charAt(1));//e
        //TODO indexOf方法用于获取数据在字符串中第一次出现的位置
        String s9 = "World Hello World";
        System.out.println(s9.indexOf("World"));//0
        //lastIndexOf方法用于获取数据在字符串中最后出现的位置
        System.out.println(s9.lastIndexOf("World"));//12
        System.out.println(s9.indexOf("j"));//没有返回-1

        //TODO 是否包含指定字符串 返回Boolean类型 严格区分大小写
        String s10 = "Hello World Hello";
        System.out.println(s10.contains("world"));
        //判断字符串是否以指定字符串开头
        System.out.println(s10.startsWith("Hello"));
        //判断字符串是否以指定字符串结尾
        System.out.println(s10.endsWith("Hello"));
        //判断字符串是否为空,空其实是一个特殊的字符,所以看不到,但是不为空
        System.out.println(s10.isEmpty());
        System.out.println(" ".isEmpty());//false
    }
}