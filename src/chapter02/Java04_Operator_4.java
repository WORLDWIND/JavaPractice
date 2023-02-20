package chapter02;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/1/6  16:42
 **/
public class Java04_Operator_4 {

    public static void main(String[] args) {

        //TODO 运算符 - 三元运算符
        //三个元素参与的运算符
        //基本语法结构
        //变量 = (条件表达式) ? (任意表达式1) :(任意表达式2)
        //运算规则:true执行表达式1,false执行表达式2
        int i = 10;
        int j = 20;
        int k = (i != 10) ? 1 + 1 : 2 + 2;//4
        System.out.println(k);
    }

}
