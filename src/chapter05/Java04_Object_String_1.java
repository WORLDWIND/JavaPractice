package chapter05;

/**
 * @program: java-top-speed
 * @author: Mr.WorldWind
 * @create: 2023/2/21  19:06
 **/
public class Java04_Object_String_1 {
    public static void main(String[] args) {
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
    }
}
