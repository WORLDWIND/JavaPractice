package chapter04;

import com.sun.tools.javac.Main;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/2/11  13:32
 **/
public class Java14_Object_3 {
    public static void main(String[] args) {
        //TODO 面向对象
        AAA a = new AAA();
        test(a);
        AAA aa = new BBB();
        test(aa);//多态 - 超人的力量发挥不出来
        BBB b = new BBB();
        test(b);
        //多态其实就是约束了对象的使用场景
        //方法的重载:方法名相同,参数列表不同(个数,顺序,类型)
        //AAA->Object(父类)
        BBB bb = new BBB();
        test(bb);//找父类
    }
    static void test(AAA aaa){
        System.out.println("aaa");
    }
//    static void test(BBB bbb){
//        System.out.println("bbb");
//    }
}
class AAA{

}
class BBB extends AAA{

}