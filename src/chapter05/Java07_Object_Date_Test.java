package chapter05;

import java.util.Calendar;

/**
 * @program: java-top-speed
 * @author: Mr.WorldWind
 * @create: 2023/2/23  09:35
 **/
public class Java07_Object_Date_Test {
    public static void main(String[] args) {
        /**
         * 不太会多练
         */
        //TODO 常见类和对象
        // 打印当前日历
        System.out.println("周一\t周二\t周三\t周四\t周五\t周六\t周日");
        // 获取当前日期的日历对象
        Calendar firstDate = Calendar.getInstance();
        // 把日历对象设定为当前月的第一天
        firstDate.set(Calendar.DAY_OF_MONTH,1);
        firstDate.set(Calendar.MONDAY,3);
        // 获取当前月的最大日期
        int maxDay = firstDate.getMaximum(Calendar.DAY_OF_MONTH);
        for (int i = 0; i < maxDay; i++) {
            // 当前日期是周几
            int weekX = firstDate.get(Calendar.DAY_OF_WEEK);
            // 当前日期是几号
            int monthY = firstDate.get(Calendar.DAY_OF_MONTH);
            if(i == 0){
                if(weekX == Calendar.SUNDAY) {
                    for (int j = 0; j < 6; j++) {
                        System.out.print("\t");
                    }
                    System.out.println(monthY);
                }
                else{
                    //周日是1 周一是2,周六是7...
                    for (int j = 0; j < weekX - 2; j++) {
                        System.out.print("\t");
                    }
                    System.out.print(monthY+"\t");
                }
            }else {
                // 不是一号的时候
                if(weekX == Calendar.SUNDAY) System.out.println(monthY);
                else {
                    System.out.print(monthY+"\t");
                }
            }
            firstDate.add(Calendar.DATE, 1);
        }

    }
}
