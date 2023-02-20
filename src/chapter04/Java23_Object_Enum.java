package chapter04;

import java.util.concurrent.CountDownLatch;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/2/12  18:57
 **/
public class Java23_Object_Enum {
    public static void main(String[] args) {
        //TODO 面向对象 - 枚举
        //枚举是一种特殊的类,其中包含了一组特定的对象,这些对象不会发生改变,一般都使用大写的标识符
        //枚举使用enum关键字使用
        //枚举类会将对象放置在最前面,那么后面的语法需要使用分号隔开
        //枚举类不能创建对象,它的对象是在内自行形成的
        System.out.println(City.BEJING.name);
        System.out.println(City.SHANGHAI.code);
        System.out.println(MyCity.BEIJING.code);
    }
}
enum City{
    BEJING("北京",1001),SHANGHAI("上海",1002);
    public String name;
    public int code;
    City(String name,int code){
        this.name = name;
        this.code = code;
    }
}
class MyCity{
    public String name;
    public int code;
    private MyCity(String name , int code){
        this.name = name;
        this.code = code;
    }
    public static final MyCity BEIJING = new MyCity("北京",1001);
    public static final MyCity SHANGHAI = new MyCity("上海",1002);
}