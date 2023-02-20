package chapter03;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/1/8  11:27
 **/
public class Java05_FlowControl {
    public static void main(String[] args) {
        //TODO 流程控制 - 重复执行(循环执行)
        //根据条件重复执行某段代码
        //Java中主要有三种循环语法
        //1.while:有条件循环
        //while (条件表达式) {需要循环的代码}
        //基本执行原理:while循环会判断条件是否为true
        //false退出循环
        //true继续执行循环
        int age = 30;
//        while(age<40) System.out.println("循环代码");
        //2.do..while..循环
        //执行原理与while循环基本相同,区别在于循环代码是否事先执行一次
        /*
        基本语法结构
        do{
            循环代买
        }while(条件表达式)
         */
//        do{
//            System.out.println("新的循环代码");
//        }while(age<40);
        //3.for
        //如果条件表达式结果返回为false,那么跳过循环语句,直接执行后续代码,如果返回true,执行循环代码
        //循环代码执行后会重新进行表达式判断,如果结果为true,继续执行,为false不在执行
        /*
        for(初始化表达式;条件表达式;更新表达式){
            循环代码
        }
         */
        for(int i = 0;i<10;i++){
            System.out.println("for循环代码"+i);
        }
    }
}
