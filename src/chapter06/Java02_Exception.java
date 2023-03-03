package chapter06;

/**
 * @program: java-top-speed
 * @author: Mr.WorldWind
 * @create: 2023/3/2  12:51
 **/
public class Java02_Exception {
    public static void main(String[] args) {
        /**
         * TODO 异常处理语法
         * TODO try : 尝试
         * TODO catch : 捕捉
         * TODO finally : 最终
         *  捕捉多个异常的时候,先捕捉范围小的异常,在捕捉范围大的异常
         * try{
         *  TODO 可能会出现异常的代码,如果出现异常则JVM会对异常进行封装,形成一个具体的异常类,然后将一个类抛出
         *   所有的异常对象都可以被抛出
         * }catch(抛出的异常对象 对象引用){
         *    异常的解决方案
         * } finally{
         *      最终执行的代码逻辑
         * }
         */
        /*int i = 0;
        int j = 0;
        try {
            j = 10 / i;
        } catch (ArithmeticException e) {
            //e.printStackTrace();
            i = 10;
            j = 10 / i;
        } finally {
            System.out.println("最终的代码");
        }
        System.out.println(j);*/
        User01 user = null;
        try {
            //System.out.println(user.toString());出现空指针异常
            System.out.println(user.name);//不出现异常,静态变量和静态方法跟对象没有任何关系
        }catch (NullPointerException e){
            System.out.println("空指针异常");
        }finally {
            System.out.println("真不错");
        }
    }
}
class User01{
    public static String name = "zhangsan";
}
