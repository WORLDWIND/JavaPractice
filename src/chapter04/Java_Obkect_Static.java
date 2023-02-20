package chapter04;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/1/16  15:30
 **/
public class Java_Obkect_Static {
    public static void main(String[] args) {
        //TODO 面向对象
        //针对于具体对象属性称之为对象属性,成员属性,实例属性
        //针对于具体对象方法称之为对象方法,成员方法,实例方法
        //把和类相关与对象无关的称之为静态,和类相关的属性称之为静态方法
        //静态语法就是static
        Chinese1 chinese1 = new Chinese1();
        chinese1.name = "zhangsan";
        System.out.println(chinese1.name);
        System.out.println(chinese1.national);
        Chinese1 chinese2 = null;//空指针异常
        //通过类进行访问
        Bird1.fly();
        System.out.println(Bird1.type);
    }
}
class Chinese1{
    String name;
    String national = "中国";
}
class Bird1{
    static String type = "鸟";
    static void fly(){
        System.out.println("...飞");
    }
}