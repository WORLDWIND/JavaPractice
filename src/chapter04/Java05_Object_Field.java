package chapter04;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/1/10  10:04
 **/
public class Java05_Object_Field {
    public static void main(String[] args) {
        //TODO 面向对象
        /**
         * 所谓属性,就是类对象的共同特征
         * 语法和变量的声明很像
         * 属性类型 属性名称 = 属性值
         * 如果声明属性的同时进行了初始化赋值,那么所有对象的属性就完全相同
         * 如果希望每个对象的属性不一致,不进行初始化
         * 那么属性会在构造对象时默认初始化,而默认初始化的值取决于属性的类型
         * byte short int long ==> 0
         * float double ==> 0.0
         * boolean ==> false
         * char ==> 空字符
         * 引用数据类型 ==> null
         * 变量的作用域非常小,只有当前的大括号内有效
         * 属性不仅仅在当前的类有效,而且可以随着对象在其他地方使用
         * 变量使用前必须初始化,否则会出现错误,属性可以不用初始化,因为JVM会自动初始化
         */
    }
}
class User05{
    //String name = "zhangsan";
    String name;
}