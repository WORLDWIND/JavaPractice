package chapter03;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/1/6  16:55
 **/
public class Java02_FlowControl {
    public static void main(String[] args) {
        //TODO 流程控制-分支执行
        //分支结构
        //1.TODO可选分支:单分支结构
        System.out.println("第一步");
        System.out.println("第二步");
        //判断使用if语句
        int i = 10;
        if(i != 10)
        System.out.println("分支");//不会出现
        else
        System.out.println("第三步");

        //TODO 必选分支,双分支结构(二选一)
        int i1 = 10;
        //出现分支2
        if( i == 20){
            System.out.println("分支1");
        } else {
            System.out.println("分支2");
        }
    }
}
