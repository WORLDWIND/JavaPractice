package chapter04;

import java.util.zip.DeflaterOutputStream;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/2/10  18:50
 **/
public class Java12_Object_Extends_1 {
    //TODO 面向对象 - Extends - 继承
    //如果父类和子类有相同的属性,那么可以采用特殊的关键字进行区分
    //super this
    public static void main(String[] args) {
        Child1 c = new Child1();
        c.test();
    }
}
class Parent1{
    String name = "张三";
}
class Child1 extends Parent1{
    String name = "李四";
    void test(){
        System.out.println(super.name);
        System.out.println(this.name);
    }
}