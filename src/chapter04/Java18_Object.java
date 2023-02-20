package chapter04;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/2/12  11:55
 **/
public class Java18_Object {
    public static void main(String[] args) {
        //TODO 面向对象 - 外部类 - 内部类
        //Java中不允许外部类使用private,protected修饰
        //所谓的外部类:就是在源码中直接声明的类

        //内部类就当成外部类的属性即可

        //因为内部类可以看作外部类的属性,所以需要构建外部类对象才能使用
        OuterClass o = new OuterClass();
        OuterClass.InnerClass innerClass = o.new InnerClass();
    }
    private class InnerClass{

    }

    protected class InnerClass1 {

    }
}
class OuterClass{
    public class InnerClass{

    }
}