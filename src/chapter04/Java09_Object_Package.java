package chapter04;
import java.util.Date;
/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/1/16  15:58
 **/
public class Java09_Object_Package {
    //TODO 面向对象 - package - 包

    /**
     * package 中容纳类
     * 基本语法 package 包的完整路径
     * 路径中的多个包是哦也能够点隔开
     * java.lang.Object
     * 主要功能用于分类管理
     *
     * 一个类可以没有包,但是package不可以在同一个源码文件中使用多次
     * 包名为了区分类名,所以一般全部都是小写
     * java.lang.Object
     */
    public static void main(String[] args) {
        //java中从在不同包但名称相同的类,可以使用包进行区分
        //一般情况下,在使用类的情况,我们都会使用类的全名(包名+类型)
        new java.util.Date();

    }
}
