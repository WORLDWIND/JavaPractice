package chapter06;

/**
 * @program: java-top-speed
 * @author: Mr.WorldWind
 * @create: 2023/3/2  12:30
 **/
public class Java01_Exception {
    public static void main(String[] args) {
        //TODO 错误

        //1.类型转换出现了错误
        String s = "123";
        //Integer integer = (Integer) s;
        Integer integer = Integer.parseInt(s);
        //2.递归没有跳出的逻辑 StackOverflowError
        //test();
        //3.访问一个孔对象的成员方式时,出现了错误 NullPointerException
        User user = null;
        System.out.println(user.toString());
    }
    public static void test(){
        test();
    }
}
class User{

}