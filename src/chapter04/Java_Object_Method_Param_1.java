package chapter04;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/1/10  12:52
 **/

/**
 * 指针的问题,相当于复制,没有改变原来的值
 * 全局变量 局部变量
 */
public class Java_Object_Method_Param_1 {
    public static void main(String[] args) {
        //TODO 面向对象 - 方法 - 参数
        //Java中值的传递是值的传递
        int i = 10;
        test(i);
        System.out.println(i);//10
        String s = "abc";
        test1(s);
        System.out.println(s);//abc
        User user = new User();
        user.name = "zhangsan";
        test2(user);
        System.out.println(user.name);//李磊

    }
    public static void test(int i){
        i = i + 10;
    }
    public static void test1(String s){
        s = s + 10;
    }
    public static void test2(User user){
        user.name = "李磊";
    }
}
class User{
    String name;
}
