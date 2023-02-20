package chapter04;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/1/9  13:15
 **/
public class Java02_Object_1 {
    public static void main(String[] args) {
        //TODO 面向对象
        //狗:2只,小黑,小白
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        d1.color = "white";
        d1.name = "小白";
        d2.color = "black";
        d2.name = "小黑";
        d1.run();
        d2.run();
    }
}
class Dog{
    String color;
    String name;
    void run(){
        System.out.println(name+"跑开了");
    }
}