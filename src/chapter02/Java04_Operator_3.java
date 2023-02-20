package chapter02;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/1/6  13:02
 **/
public class Java04_Operator_3 {
    public static void main(String[] args) {
        // TODO 逻辑运算符
        //所谓逻辑运算符 就是表示多个条件表达式之间的关系的运算符
        //TODO 基本语法结构
        //变量 = (条件表达式1) 逻辑运算符 (条件表达式2)
        //结果的变量类型为布尔类型
        //因为条件表达式的结果为boolean,所以逻辑运算表达式记得结果也是Boolean,但是分集中情况:
        //true true => ?
        //true false => ?

        //TODO 逻辑运算符: & :与
        //两个结果都是true才行,其他结果全为false
        int i = 10;
        boolean result = (i > 5) & (i < 20);//true & 必须两个都为true才行
        System.out.println(result);

        //TODO 螺距运算符: | :或
        //两个有一个为true就可以为true 只有两个都为false才为false
        int j = 10;
        boolean result1 = (i < 5) | (i < 20); //false | true ==> true
        System.out.println(result1);//true

        //TODO 逻辑运算符: && : 短路与运算符
        //根据第一个表达式运算结果判断是否执行第二个表达式
        //如果第一个表达式已经能够判断最终结果就不用判断下一个表达式
        int i1 = 10,j1 = 20;
        boolean result3 = (i > 10) && (++j > 30);
        System.out.println(result3);//false

        //TODO 逻辑运算符: || : 短路或运算符
        //第一个为true 不在检查第二个条件表达式
        //TODO 逻辑运算符: ! : 非(相反)运算
        //true => false
        //false => true
        int i2 = 10;
        boolean result4 = i2 == 10;
        boolean result5 = i2 > 10;
        System.out.println(!result4);//false
        System.out.println(!result5);//true

    }
}
