package chapter04;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/1/9  12:05
 **/
public class Java02_Object {
    public static void main(String[] args) {
        //TODO 面向对象
        //类:动物
        //对象:猫,狗
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        a1.type = "猫";
        a2.type = "狗";
        a1.name = "小黑";
        a2.name = "大黄";
        a1.run();
        a2.run();
    }
}
class Animal{
    String type;
    String name;
    void run(){
        System.out.println(type+":"+name+"跑开了");
    }
}