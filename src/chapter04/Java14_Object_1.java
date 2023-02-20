package chapter04;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/2/11  13:19
 **/
public class Java14_Object_1 {
    public static void main(String[] args) {
        //TODO 面向对象
        //如果在一个构造方法中想到调用其他的构造方法,需要使用关键字this
        User141 u = new User141();//一层层调用
//      User141 u1 = new User141("张三");
//      User141 u2 = new User141("张三","男");
    }
}
class User141{
    User141(){
        this("张三");
    }
    User141(String name){
        this("李梅","男");
    }
    User141(String name,String sex){
        System.out.println(name+","+sex);
    }
}