package chapter04;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/2/10  20:17
 **/
public class Java13_Object {
    public static void main(String[] args) {
        //TODO 面向对象 - 多态
        //所谓的多态,其实就是一个对象在不同情境下表现出来的不同状态和形态
        //多态语法其实就是队对象的使用场景进行约束
        //超人的超能力不能展现出来
        //一个对象可以使用的功能取决于引用变量的类型
        Person p = new Person();
        p.test();
        Person p1 = new Boy();
        //p1.testBoy();
        Person p2 = new Girl();
        //p2.testGirl();
        Boy b = new Boy();
        b.testBoy();
        Girl g = new Girl();
        g.testGirl();
    }
}
class Person{
    void test(){
        System.out.println("test Person");
    }
}
class Boy extends Person{
    void testBoy(){
        System.out.println("test Boy");
    }
}
class Girl extends Person{
    void testGirl(){
        System.out.println("test Girl");
    }
}