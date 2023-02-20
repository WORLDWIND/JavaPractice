package chapter04;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/2/12  13:09
 **/
public class Java21_Object_Abstract {
    //TODO 面向对象 - 抽象 - Abstract
    //抽象类: 不完整的类,就是抽象类
            //abstract class 类名
    //因为类不完整,所以类不能构建对象
    //如果一个类中含有抽象方法,这个类是抽象类
    //如果一个类是抽象类,它的方法不一定是抽象方法

    //抽象方法: 只有声明,而没有实现的方法是抽象方法
                //abstract 返回值类型 方法名(参数)
    //如果抽象类中含有抽象方法,那么子类继承时需要重新写抽象方法,将方法补全

    //abstract关键字不能和final关键字同时使用
    //分析问题:对象(具体) ==> 类(抽象)
    //编写代码:类(抽象) == 对象(具体)
    public static void main(String[] args) {
        Chinese21 c = new Chinese21();
        c.eat();
    }

}
abstract class Person21{
    public abstract void eat();
    public void test(){

    }
}
class Chinese21 extends Person21{
    @Override
    public void eat() {
        System.out.println("中国人用筷子吃饭");
    }
}