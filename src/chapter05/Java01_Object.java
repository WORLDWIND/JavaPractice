package chapter05;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/2/12  21:46
 **/
public class Java01_Object {
    public static void main(String[] args) {
        //TODO 常见类和对象
        //java.lang.Object : 对象
        Object obj = new Person();
        //将对象转换成字符串
        //toString默认打印的就是对象的内存地址,所以,为了能够更直观理解对象的内容,所以可以重写这个方法
        String s = obj.toString();
        System.out.println(s);
        //TODO 获取对象的内存地址
        int i = obj.hashCode();
        System.out.println(i);

        //TODO 判断两个对象是否相等 如果相等返回true,否返回false
        //equals方法比较对象时,默认比较的就是内存地址
        System.out.println(obj.equals(new Person()));
        //getClass获取对象的类型信息
        Class<?> Class = obj.getClass();
        System.out.println(Class.getSimpleName());
        System.out.println(Class.getPackageName());
    }
}
class Person{
    public String name = "张三";
    @Override
    public String toString() {
        return "Person["+name+"]";
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
class User extends Person{

}