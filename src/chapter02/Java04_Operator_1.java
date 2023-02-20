package chapter02;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/1/6  11:54
 **/
public class Java04_Operator_1 {
    public static void main(String[] args) {
        //TODO 赋值运算符
        //=就是赋值运算符,将右边赋值给左边
        //赋值运算符需要考虑类型的关系
        String name = "zhangsan";
        byte b = 10;
        short s = b;

        //TODO 复合赋值运算符
        //如果元素进行运算后重新赋值给自己,就可以用复合赋值运算符
        //如果使用复合赋值运算符,那么数据类型不会发生变化
        int i = 1;
        //i = i+1
        i += 1;
        System.out.println(i);//2
        byte b1 = 10;
        b1 +=  20;
        System.out.println(b1);//30 b1还是byte类型
    }
}
