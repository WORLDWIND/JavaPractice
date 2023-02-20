package chapter04;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/1/16  15:50
 **/
public class Java08_Object_Static_2 {
    public static void main(String[] args) {
        //TODO 面向对象 - 静态
        /**
         * 类的信息被自动加载完成后,会自动调用静态代码块,可以完成静态属性的初始化功能
         * 对象准备创建时,也会自动调用代码块,但不是静态的
         */
        //User08 u = new User08();
        //User08.test();//加载静态代码块
        new User08();//加载代码块
    }
}
class User08{
    static {
        //静态代码块
        System.out.println("静态代码块");
    }
    static {
        System.out.println("静态代码块1");
    }
    {
        //代码块
        System.out.println("代码块1");
    }
    {
        System.out.println("代码块2");
    }
    static void test(){
        System.out.println("test...");
    }
}