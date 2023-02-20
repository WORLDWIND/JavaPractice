package chapter02;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/1/6  11:10
 **/
public class Java04_Operator {
    public static void main(String[] args) {
        //TODO 运算符
        //所谓运算符,就是参与数据运算的符号,Java定义的,不是自己定义的

        //TODO 表达式
        //采用运算符和数据链接在一起形成符合Java语法规则的指令代码,称之为表达式

        //TODO 算数运算符
        //1.二元运算符:两个元素参与运算符 + - * / %
        //TODO 算数表达式 = 元素1 二元运算符 元素2
        //结果是元素类型最大的一种,最小用int类型
        //有优先级,可以加括号
        System.out.println(1+2);//3
        System.out.println(1/2);//0 (int int)==int
        System.out.println(1.0/2);//(double int)==double
        byte b1=10,b2=20;
        byte b3 = (byte)(b1 = b2);//需要强制类型转换 否则为int
        //2.一元运算符
        //++操作就是+1的简化版本,自增运算符
        //++i  i++ 先++和后++不一样
        //自减运算一样
        int i = 0;
        int j = i++;//j = 0;
        //i = i + 1;//i = 1;
        System.out.println("i = "+ i);//1
        System.out.println("j = " + j);//0
        System.out.println("i = " + ++i);//2
    }
}
