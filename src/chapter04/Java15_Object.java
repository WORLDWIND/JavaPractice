package chapter04;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/2/11  13:42
 **/
public class Java15_Object {
    public static void main(String[] args) {
        //TODO 面向对象 - 重写
        //方法的重写:父类对象的方法,主要体现的是通用性,无法在特殊的场景下使用
        //          如果子类对象需要在特殊场合下使用需要重写方法的逻辑,这个操作在Java中称之为方法的重写
        //并不意味者父类的方法被覆盖,只是在当前场合不适用,如果使用super关键字还是可以访问
        //方法重写的要求,子类的方法和父类的方法,方法名相同,返回值类型相同,参数列表要相同
        Child15 c = new Child15();
        c.test();
    }
}
class Parent15{
    String name = "张三";
    void test(){
        System.out.println("Parent test");
    }
}
class Child15 extends Parent15{
    String name = "李四";
    void test(){
        System.out.println(this.name);
        System.out.println(super.name);
        super.test();
        System.out.println("Child test");
    }
}