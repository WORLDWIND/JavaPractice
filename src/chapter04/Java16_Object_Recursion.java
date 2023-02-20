package chapter04;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/2/11  22:05
 **/
public class Java16_Object_Recursion {
    public static void main(String[] args) {
        //TODO 面向对象 - 递归
        //递归:方法调用自己,称之为递归方法
        // 1 + 3 + 5...20以内奇数求和
        //System.out.println(num(10));
        System.out.println(computeAP(10));
        System.out.println(computerFactorial(5));

        //1.递归方法应该有跳出的程序
        //2.调用自身时,传递的参数需要有规律
    }
    //自己的方法
//    public static int num(int a){
//        int b,c,d;
//        if(a<0){
//            return 0;
//        }
//        if(a%2==0&&a>0){
//             b = a - 1;
//            c = b - 2;
//             d = num(c);
//        }else {
//            b = a;
//            c = b - 2;
//           d = num(c);
//        }
//
//        return d+b;
//    }
    //老师的方法,老师的方法是真的简单
    //等差数列
    public static int computeAP(int num){
        num = num % 2 == 0 ? num - 1: num;
        if(num == 1){
            return 1;
        }else {
            return num + computeAP(num - 2);
        }
    }
    //阶乘
    public static int computerFactorial(int num){
        if(num>1){
            return num * computerFactorial(num - 1);
        }else{
            return 1;
        }
    }
}
