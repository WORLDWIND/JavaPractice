package chapter04;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/2/11  13:03
 **/
public class Java14_Object {
    public static void main(String[] args) {
        //TODO 面向对象
        //一个类中不能声明相同的方法,也不能声明相同的属性
        //这里相同的方法,只得是方法名和参数列表相同,和返回值类型无关
        //如果方法名相同,参数列表不同(个数,顺序,类型)不相同,会认为是不同的方法,只不过名称一样
        //这个操作在Java中成为方法的重载
        //构造方法也存在方法重载
        User14 u = new User14();
        new User14("李梅");
        u.login(1111);
        u.login("123");
        u.login("123","123");
    }
}
class User14{
    User14(){
        System.out.println("user...");
    }
    User14(String name){
        System.out.println("user..."+name);
    }
    void login(String account,String password){
        System.out.println("账号,密码登录");
    }
    void login(int tel){
        System.out.println("手机验证码登录");
    }
    void login(String wx){
        System.out.println("微信,支付宝登录");
    }
}