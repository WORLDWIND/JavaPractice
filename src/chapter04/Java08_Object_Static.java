package chapter04;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/1/10  15:18
 **/
public class Java08_Object_Static {
    public static void main(String[] args) {
        //TODO 面向对象
        //针对具体对象的属性称之为对象属性,成员属性,实例属性(方法同理)

        //把和对象无关,与类相关的称之为静态
        //和类相关的属性称之为静态属性
        //和类相关的方法称之为静态方法
        //静态语法就是在属性和方法前加static
        Chinese c = new Chinese();
        c.name = "张三";
        System.out.println("Hello"+c.name+","+c.nationality);

        Bird.fly();//静态方法
        System.out.println(Bird.type);
    }
}
class Bird{
    static String type = "鸟";
    static void fly(){
        System.out.println("飞...");
    }
}
class Chinese{
    String name;
    //国籍
    String nationality = "China";
}