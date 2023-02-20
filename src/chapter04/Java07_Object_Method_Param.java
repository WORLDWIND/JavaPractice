package chapter04;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/1/10  10:59
 **/
public class Java07_Object_Method_Param {
    public static void main(String[] args) {
        /**
         * TODO 面向对象 - 方法
         * 外部数据控制方法内部实现的操作,使用的是参数语法实现,也叫方法参数
         * 语法 : 方法名( 参数类型 参数名称)
         * 语法 : 方法名( 参数类型 参数名称,参数类型 参数名称)   可以放置多个参数
         */
        User07 user = new User07();
        String name = "张三";
        //传递参数
        user.sayHello(name,18);
        //方法传递多个参数时,需要注意
        /**
         * 1.参数的个数需要匹配
         * 2.参数的类型需要匹配
         * 3.参数的顺序需要匹配
         *
         * 4.当参数的个数不确定,但是类型相同,可以采取特殊的参数依法声明,可变参数
         *      如果参数中还包含其他含义的参数,那么可变参数应该声明在最后
         * 语法: 参数类型...参数名称
         * 一个都不传也可以,传很多也可以
         */
        user.test(30,"张三","李磊");
    }
}
class User07{
    void sayHello(String name,int age){
        System.out.println("Hello" + name+","+age);
    }
    void test(int age,String... name){
        System.out.println(name);
    }
}
