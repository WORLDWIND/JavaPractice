package chapter03;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/1/9  11:02
 **/
public class Java05_FlowControl_1 {
    public static void main(String[] args) {
        //TODO 流程控制 - 重复执行(循环执行)
        //break 跳出循环,不在执行循环操作
//        for(int i = 0;i<10;i++){
//            //切断 跳出循环
//            if(i == 4)  break;
//            else System.out.println(i);
//        }

        //continue 跳过当前循环,执行下一次循环
        for(int i = 0;i<10;i++){
            //切断 跳出循环
            if(i == 4)  continue;
            System.out.println(i);
        }
    }
}
