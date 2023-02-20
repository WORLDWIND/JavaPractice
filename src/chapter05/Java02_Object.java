package chapter05;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/2/16  11:40
 **/
public class Java02_Object {
    public static void main(String[] args) {
        //TODO 常见类和对象
        User1 user1 = new User1();
        user1.test();
        //TODO 数组的声明方式
        // 数组的创建,new 类名[容量]
        String[] name = new String[3];
        //TODO 给数组的小格子里添加数据添加方式为:数据变量[索引] = 数据
        // 添加数据和访问数据时,索引是不能超过特定范围(0 ~ length - 1)
        // 如果给同一个索引重复添加数据,相当于修改数据
        name[0] = "zhangsan";
        name[0] = "zhaoliu";
        name[1] = "lisi";
        name[2] = "wangwu";
        //name[3] = "zhaoliu";
//        for (int i = 0; i < 3; i++) {
//            System.out.println(name[i]);
//        }
        User1[] user1s = new User1[3];
        for(int i = 0;i<user1s.length - 1;i ++){
            user1s[i] = new User1();
        }
        for (int i = 0; i < user1s.length - 1; i++) {
            user1s[i].test();
        }
    }
}
class User1{
    public void test(){
        System.out.println("test...");
    }
}