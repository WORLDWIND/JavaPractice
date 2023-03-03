package chapter06;

import java.util.Arrays;

/**
 * @program: java-top-speed
 * @author: Mr.WorldWind
 * @create: 2023/3/2  13:13
 **/
public class Java04_Exception {
    public static void main(String[] args) {
        // TODO 异常
        //  3.索引越界

        String[] names = new String[3];
        names[0] = "zhangsan";
        names[1] = "lisi";
        names[2] = "wangwu";
        System.out.println(Arrays.toString(names));

        //System.out.println(names[3]); 数组越界异常

        String s = "abc";
        //System.out.println(s.charAt(3)); 字符串越界异常
        System.out.println(s.substring(3));//超过其长度不行,索引下标可以为其长度,就是什么也不会发生

    }
}
