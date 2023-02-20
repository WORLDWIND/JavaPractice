package chapter04;
import java.util.*;
/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/1/16  16:15
 **/
public class Java10_Object_Import {
    public static void main(String[] args) {
        //TODO 面向对象 - import
        //chapter04.Java10_Object_Import
        //import主要用于在使用类前准备好了
        //import语句只能使用package后,class前
        //import关键字可以多次使用,导入多个类
        //如果同一个包中需要导入多个类,那么可以使用通配符加型号来简化操作
        //如果import不同包但是重名的类,那么还是需要在使用前增加包名
        java.lang.String name = "张三";
        String name1 = "李四";

        new chapter04.Java10_Object_Import();
        new Java10_Object_Import();
        //上面两者都是相同的
        Date date = new Date();
        new ArrayList<>();
    }
}
