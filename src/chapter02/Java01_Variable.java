package chapter02;

public class Java01_Variable {
    public static void main(String[] args) {
        // TODO 变量
        //所谓变量，其实就是可以改变向量存储
        //1.变量声明
        //  数据类型 变量名称
        String name;
        // 2.变量赋值
        //变量名称 = 数据
        name = "zhangsan";
        // 3.变量的使用
        //直接访问变量名称即可
        System.out.println(name);

        //将变量的声明赋值在一行代码中完成
        String username = "lisi";
        System.out.println(username);

        /*
            在变量使用前必须要要给变量赋值这个操作称为变量初始化
         */
//        String email;
//        email = "177QQ.com";
//        System.out.println(email);
    }
}
