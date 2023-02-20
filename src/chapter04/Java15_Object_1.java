package chapter04;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/2/11  13:59
 **/
public class Java15_Object_1 {
    public static void main(String[] args) {
        //TODO 棉线对象 - 重写
        CCC c = new DDD();
        System.out.println(c.sum());
        //System.out.println(c.test);
        //一个对象能使用什么属性,取决于引用变量的类型
        //一个对象能使用什么方法,取决于引用变量的类型
        //一个对象的方法具体使用(直接,间接)是需要看具体的对象
        //一个对象的属性具体的使用是不需要看具体的对象的,属性在哪里声明,就在哪里使用
        //前部提供能调用的方法,后部能提供具体的方法实现
        DDD d = new DDD();
        System.out.println(d.sum());
    }
}
class CCC{
    int i = 10;
    int sum(){
        return getI() + 10;
    }
    int getI(){
        return i;
    }
}
class DDD extends CCC{
    int i = 20;
//    int sum(){
//        return i + 20;
//    }
    void test(){
        System.out.println("test");
    }
    int getI(){
        return i;
    }
}