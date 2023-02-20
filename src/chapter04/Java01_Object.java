package chapter04;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/1/9  11:44
 **/
public class Java01_Object {
    public static void main(String[] args) {
        //TODO 面向对象
        //以问题所涉及到的事物为中心分析方式
        //类和对象
        //对象表示具体事物
        //TODO class(类)
        /*
        基本语法结果
        class 类名{
            特征(属性)
            功能(方法)
        }
         */
        //问题:做一道菜,红烧排骨
        //类:菜,对象:红烧排骨
        //TODO 1.先声明类
        //TODO 2.创建对象
        //TODO 声明类型: 变量类型 变量名称 = 变量值
        //TODO 4. 声明方法
        //          void 方法名 (参数) {功能代码}
        //TODO 5. 执行方法
        //          对象.方法名()
        Cooking cook = new Cooking();
        cook.name = "红烧排骨";
        cook.food = "排骨";
        System.out.println(cook.name);
        System.out.println(cook.food);
        System.out.println(cook.relish);
        System.out.println(cook.type);
        cook.execute();

        Cooking c = new Cooking();
        c.name = "红烧鱼";
        c.food = "鲤鱼";
        c.execute();

    }
}
class Cooking{
    //特征(属性)
    //名字
    String name;
    //菜的类型
    String type = "红烧";
    //食材
    String food;
    //佐料
    String relish = "大料";
    //执行方法
    void execute(){
        System.out.println("准备食材"+food);
        System.out.println("准备佐料"+relish);
        System.out.println("开始烹饪");
        System.out.println(name+"烹饪完成");

    }
}
