package chapter04;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/2/12  20:52
 **/
public class Java26_Object {
    public static void main(String[] args) {
        //TODO 面向对象 - 作用域
        User26 user26 = new User26();
        user26.test();
    }
}
class Person26{
    public static String name = "张三";
}
class User26 extends Person26{
    public static String name = "李梅";
//    public void test(){
//        //String name = "wangwu";
//        //如果属性和(局部)变量的名称相同,访问那时如果不加修饰符,那么优先访问变量
//        System.out.println(super.name);
//        System.out.println(name);
//   }
    public static void test(){
        System.out.println(Person26.name);//不能用super
    }
}