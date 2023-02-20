package chapter04;

import java.sql.SQLOutput;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/2/11  22:39
 **/
public class Java17_Object_Access {
    public static void main(String[] args) {
        //TODO 面向对象 - 访问权限
        //public:公共的,访问权限修饰符
        //Java的源码中,公共类只能有一个,而且必须是和源码文件名相同
        //main方法:main方法是由JVM调用的,JVM调用时应该可以任意调用,也不用考虑权限问题

        //TODO Java中的访问权限主要分为四种
        // 1.private : 私有的 同一个类中可以使用
        // 2.(default) : 默认权限 当不设定任何权限时,JVM会默认提供权限,包(路径权限)权限,同一个包可以任意调用
        // 3.protected : 受保护的权限,子类可以访问
        // 4.public : 公共的 任意使用
        User17 u = new User17();
        //System.out.println(u.name);
    }
    static void test(){

    }
}
class User17{
    public String name;
    protected int age ;
}
class Child17 extends User17{
    protected void test(){
        System.out.println(age);
    }
}