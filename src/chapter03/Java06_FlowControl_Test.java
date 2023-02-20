package chapter03;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/1/9  11:07
 **/
public class Java06_FlowControl_Test {
    public static void main(String[] args) {
        //TODO 流程控制 - 小练习
        //九层妖塔
        /*
               *
              ***
             ******
         */
//        for(int i=1;i<10;i++){
//            for(int j = i;j > 0;j--) System.out.print("*");
//            System.out.println();
//        }
//      for (int i = 0;i < 1;i++) System.out.println("*");
        for(int j = 0;j < 9;j++){
            for(int i = 0;i < 8 - j;i++){
                System.out.print(" ");
            }
            for (int i = 0;i < j * 2 + 1;i++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
