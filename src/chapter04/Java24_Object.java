package chapter04;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/2/12  19:09
 **/
public class Java24_Object {
    public static void main(String[] args) {
        //TODO 面向对象
        //在某些场合下,类的名字不重要,我们只想使用类中的方法或功能,那么此时我们可以采用特殊的语法:匿名类
        //所谓的匿名类就是没有名称的类
        Me me = new Me();
        me.sayHello(new zhangsan());
        me.sayHello(new lisi());
        me.sayHello(new Person24() {
            @Override
            public String name() {
                return "wangwu";
            }
        });
        me.sayHello(new Person24() {
            @Override
            public String name() {
                return "zhaoliu";
            }
        });
        new Bird24().fly();
        new Fly(){
            @Override
            public void fly() {
                System.out.println("使用飞行器飞行");
            }
        }.fly();
    }
}
abstract class Person24{
    public abstract String name();
}
class Me{
    public void sayHello(Person24 person24){
        System.out.println("Hello "+person24.name());
    }
}
class zhangsan extends Person24{
    @Override
    public String name() {
        return "zhangsan";
    }
}
class lisi extends Person24{
    @Override
    public String name() {
        return "lisi";
    }
}
interface Fly{
    public void fly();
}
class Bird24 implements Fly{
    @Override
    public void fly() {
        System.out.println("使用翅膀");
    }
}