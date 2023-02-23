package chapter05;

import java.util.Calendar;
import java.util.Date;

/**
 * @program: java-top-speed
 * @author: Mr.WorldWind
 * @create: 2023/2/22  15:31
 **/
public class Java07_Object_Date {
    public static void main(String[] args) {
        //TODO 常见类和对象
        Calendar instance = Calendar.getInstance();
        System.out.println(instance);//一堆东西
        //年月日
        System.out.println(instance.get(Calendar.YEAR));
        System.out.println(instance.get(Calendar.MONDAY));//从0开始
        System.out.println(instance.get(Calendar.DATE));

        instance.setTime(new Date());
        System.out.println(instance);
        //instance.add(Calendar.YEAR,-1);
        //System.out.println(instance.get(Calendar.YEAR));
        System.out.println(instance.get(Calendar.DAY_OF_WEEK));
        System.out.println(instance.get(Calendar.MONTH));
    }
}
