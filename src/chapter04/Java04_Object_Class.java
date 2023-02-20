package chapter04;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/1/9  13:27
 **/
public class Java04_Object_Class {
    public static void main(String[] args) {
        //TODO 面向对象
        //类:结构体,里面包含了属性和方法
        //  会有很多个对象
        //class : 关键字(都是小写)
        //类名:类的名称,标识符,遵循规则,一般情况下,类名首写字母为大写

        //对象:类的实例化(具象化)
        //new 类名();
        //new 也是关键字,创建具体对象,使用一次,创建一次,每次都是全新的
        //new 出来的对象,会赋值给变量,方便重复使用
        //变量的类型就是对象的类型
        //对象是将内存地址赋值给变量,所以变量其实是引用的内存中的对象,所以称之为引用变量
        //而变量的类型称之为引用类型
        User04 u= new User04();

        //特殊对象:空对象:没有引用的对象,称之为空对象,关键字对象
        //所有引用类型变量的取值就是null
        User04 u1 = null;

    }
}
class User04{

}