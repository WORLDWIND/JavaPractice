package chapter04;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/2/12  12:22
 **/
public class Java20_Object {
    public static void main(String[] args) {
        //TODO 面向对象
        //Java中提供了一种语法,可以在数据初始化后不被修改,使用关键字final
        //final可以修饰属性,那么JVM无法自动进行初始化,需要自己进行初始化,属性值不能发生变化
        //一般将final修饰的变量称之为常量,或者叫做不可变量
        //final可以修饰方法,这个方法不能被子类重写
        //final可以修饰类,用final修饰的类不能有子类
        //final不可以修饰构造方法
        //final可以修饰方法的参数的,一旦修饰,参数就无法修改
        String name = "张三";

        System.out.println(name);
        User20 u  = new User20("辛弃疾");
        //u.name = "lisi";
        System.out.println(u.name);
        //u.name = "zhangsan";
       // System.out.println(u.name);
    }
}
final class User20{
    public final String name;
    String name1;
    User20 (String name){
        this.name = name;
    }
    public final void test(){

    }
}
//class Child20 extends User20{
//    public void test(){
//
//    }
//}
//class Child20 extends User20{
//
//}