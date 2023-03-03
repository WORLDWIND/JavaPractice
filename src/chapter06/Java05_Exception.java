package chapter06;

/**
 * @program: java-top-speed
 * @author: Mr.WorldWind
 * @create: 2023/3/2  14:36
 **/
public class Java05_Exception {
    public static void main(String[] args) {
        //5.格式化错误 NumberFormatException
        String str = "a123";
        //Integer i = Integer.parseInt(str);
        //System.out.println(i);

        //6.类型转换错误 ClassCastException
        Object obj = new User5();
        Emp emp = (Emp) obj;
    }
}
class User5{

}
class Emp{

}