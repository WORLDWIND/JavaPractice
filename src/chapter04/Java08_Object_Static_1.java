package chapter04;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/1/16  15:42
 **/
public class Java08_Object_Static_1 {
    public static void main(String[] args) {
        //TODO 面向对象 - 静态
        //TODO 先有类再有对象
        //成员方法可以访问静态属性和静态方法的
        //静态属性不可以访问成员属性和成员方法的
        Test t = new Test();
        t.sex = "女";
        t.test();
//        t.test1();
//        Test.test1();
    }
}
class Test{
    String name;
    static String sex;
    void test(){
        test1();//调用静态方法
        System.out.println(sex);
        //System.out.println("test");
    }
    static void test1(){
        //test();报错
        //System.out.println(name);
        System.out.println("test1");
    }
}