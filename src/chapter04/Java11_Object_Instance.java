package chapter04;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/2/10  18:10
 **/
public class Java11_Object_Instance {
    //TODO 面向对象 - 构建对象
    //构造方法:专门用于构建对象
    //如果一个类中没有任何构造方法,那么JVM会自动给你添加一个公共的,无参的构造方法,方便对象来调用
    //TODO 基本语法:类名(){}
    // 1.构造方法也是方法,但是没有void关键字
    // 2.方法名和类名完全相同
    // 3.如果类中没有构造方法,那么JVM会提供默认的构造方法
    // 4.如果类中有构造方法,那么JVM不会提供默认的构造方法
    // 5.构造方法也是方法,也能传递参数,但是一般传递参数的目的用于对象属性的赋值
    public static void main(String[] args) {
        System.out.println("before");
        User11 user11 = new User11("lisi");//user...
        System.out.println("after");
        user11.test();
        System.out.println(user11.username);
        //代码块是在构造之前就生成的
    }
}

class User11{
    String username;
    User11(String name){
        System.out.println("user...");
        username = name;
        System.out.println(username);
    }
    void test(){
        System.out.println("test...");
    }
    {
        System.out.println("代码块1");
    }
    {
        System.out.println("代码块2");
    }{
        System.out.println("代码块3");
    }
}