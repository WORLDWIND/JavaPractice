package chapter02;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/1/5  22:52
 **/
public class Java03_Datatype_2 {
    public static void main(String[] args) {
        //TODO 数据类型转换
        String name = "zhangsan";
        int age = 30;

        name = "lisi";
        //name = age 不行

        //byte -> short -> int -> long -> float -> double
        byte b = 10;
        short s = b;
        int i = s;
        long lon = i;
        float f = lon;
        double d = f;
        //Java中范围小的数据可以转化位范围大的数据,但是范围大的数据不能转换为范围小的数据(可以强制)
        //强制转换用小括号,去掉多余的东西
        int i1 = (int)d;

    }
}
