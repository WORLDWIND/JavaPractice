package chapter03;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/1/6  18:45
 **/
public class Java03_FlowContral {
    public static void main(String[] args) {
        /**
         * TODO 流程控制 - 分支执行
         * switch (数据){}
         * switch会对数据进行判断,如果等于某一分支数据就会执行对应的逻辑代码
         * 如果分支都无法匹配,那么一个分支都不会执行,如果有需要可以加入default关键字
         * 如果执行某一分支后,不想执行其他分支,加入break关键字,跳出分支结构
         * 不足:只能做等值判断,不能做范围判断
         */
        System.out.println("第一步");
        System.out.println("第二步");
        int i = 40;
        switch(i){
            case 10:
                System.out.println("分支1");
                break;
            case 20:
                System.out.println("分支2");
                break;
            case 30:
                System.out.println("分支3");
                break;
            default :
                System.out.println("default");
        }
        System.out.println("第三步");
    }
}
