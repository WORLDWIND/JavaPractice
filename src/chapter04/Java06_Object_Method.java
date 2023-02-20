package chapter04;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/1/10  10:12
 **/
public class Java06_Object_Method {
    public static void main(String[] args) {
        //TODO 面向对象 - 方法
        //声明的语法:void 方法名(){ 逻辑代码 }
        //声明的语法(补充):方法返回值类型 方法名(){ 逻辑代码 return 返回值 }
        //这里的void就是没有任何结果
        /**
         * 方法调用方式 对象.方法名()
         *
         * 使用用户的账号密码进行登录
         * 名词: 用户 账号 密码
         * 动词: 登录
         */
        User06 u = new User06();
        boolean registerResult = u.register();
        if(registerResult){
            System.out.println("注册成功");
        }else {
            System.out.println("注册失败");
        }
        boolean loginResult = u.login();
        if(loginResult) System.out.println("登录成功");
        else System.out.println("登录失败");
    }
}
class User06{
    String account;
    String password;

    boolean register(){
        System.out.println("用户注册");
        return true;
    }
    boolean login(){
        System.out.println("用户登录");
        return true;
    }
}
