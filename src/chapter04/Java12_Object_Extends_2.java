package chapter04;

import java.time.chrono.ChronoLocalDate;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/2/10  18:58
 **/
public class Java12_Object_Extends_2 {
    public static void main(String[] args) {
        //TODO 面向对象 - Extends - 继承
        //构造方法
        //父类对象是在子类对象创建前完成的,创建子类对象前会调用父类对象构造方法完成父类的创建
        //默认情况下,子类对象构建时,会默认调用父类的构造方法完成父类对象的创建,使用的是super关键字的方法,由JVM自动完成
        //如果父类提供构造方法,那么JVM不会提供构造方法,那么子类应该用super方法构建父类对象
        Child2 c = new Child2();
        Child2 c2 = new Child2();
        Child2 c3 = new Child2();
        //new:构建一个对象
        //父类不是有一个真正的对象存在
    }
}
class Parent2{
    String username;
    Parent2(String name){
        username = name;
        System.out.println("parent...");
    }
}
class Child2 extends Parent2{
    Child2(){
        super("zhangsan");
        System.out.println("child...");
    }
}