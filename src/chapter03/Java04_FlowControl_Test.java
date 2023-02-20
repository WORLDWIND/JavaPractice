package chapter03;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/1/8  11:17
 **/
public class Java04_FlowControl_Test {
    public static void main(String[] args) {
        //TODO 流程控制 - 分支执行 - 小练习
        int age = 45;
        //儿童(0-6),少年(7-17),青年(18-40),中年(45-60),老年(60~)
        //if else if..
        //switch case case default ......
        if(age<0) System.out.println("输入年龄非法");
        else if(age < 7)
            System.out.println("儿童");
        else if(age<18)
            System.out.println("少年");
        else if(age<41)
            System.out.println("青年");
        else if(age<60)
            System.out.println("中年");
        else
            System.out.println("老年");

    }
}
