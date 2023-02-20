package chapter04;

import java.rmi.server.UID;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/2/12  20:07
 **/
public class Java25_Object {
    public static void main(String[] args) {
        //TODO 面向对象
        // 1.主要用于编写逻辑
        // 2.主要用于简历数据模型(Bean)
        //TODO Bean类的设计规范 : Bean规范
        // 1.类要求必须含有无参,公共的构造方法
        // 2.属性必须私有化,然后提供公共的set get方法
        User25 user25 = new User25();
        //user25.account = "123456";
        //user25.password = "123456";
        user25.setAccount("123456");
        user25.setPassword("123456");
        System.out.println(login(user25));

    }
    public static boolean login(User25 user25){
        if (user25.getAccount().equals("123456")&&user25.getPassword().equals("123456"))
            return true;
        else return false;
    }
}
class User25{
    private String account;
    private String password;
    public void setAccount(String account){
        this.account = account;
    }
    public void setPassword (String password){
        this.password = password;
    }
    public String getAccount(){
        return account;
    }
    public String getPassword(){
        return password;
    }
}