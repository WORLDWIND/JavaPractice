package chapter04;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/2/12  11:47
 **/
public class Java17_Object_Access_1 {
    public static void main(String[] args) {
        //TODO 面向对象 - 访问权限
        Person17 p = new Person17();
        //private : 同类
        //default : 同类,同包(路径)
        //protected : 同类,同包,子类
        //public : 公共的
        //所谓的访问权限,其实就是访问属性,方法的权力和限制
        //谁访问?Java17_Object_Access_1
        //访问谁?Person17 -> super -> java.lang.Object
        //p.clone();
    }
}
class Person17{
    void test() throws Exception{
        clone();
    }
}