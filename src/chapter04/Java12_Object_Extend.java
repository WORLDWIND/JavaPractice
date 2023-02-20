package chapter04;

import java.sql.SQLOutput;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/2/10  18:39
 **/
public class Java12_Object_Extend {
    public static void main(String[] args) {
        //TODO 面向对象 - Extend - 继承
        //面向对象中有三个特别重要的概念:继承,封装,多态
        //类存在父子关系,子类可以直接获取到父类的成员属性和成员方法
        //类的继承只能是单继承,一个类只能有一个父类,不能有多个父类
        //一个类可以有多个子类
        Child c = new Child();
        System.out.println(c.name);
        c.test();

    }
}
class Parent{
    String name = "张三";
    void test(){
        System.out.println("test");
    }
}
class Child extends Parent{
}