package chapter05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: java-top-speed
 * @author: Mr.WorldWind
 * @create: 2023/2/22  14:13
 **/
public class Java05_Object_Date {
    public static void main(String[] args) throws ParseException {
        //TODO 常见类和对象
        //Date : 日期类
        //时间戳 : 毫秒
        System.out.println(System.currentTimeMillis());

        //Date : 日期类
        //Calendar : 日历类
        Date d = new Date();
        System.out.println(d);//非常乱,不方便看

        //TODO 各种字母的意思
        /**
         * Java格式化日期格式
         * y (Y) -> 年 -> yyyy
         * m (M) -> MM -> 月份, mm -> 分钟
         * d (D) -> dd : 一个月中的日期 DD : 一年中的日期
         * h (H) -> h : 12进制 , HH : 24进制
         * s (S) -> s : 秒 ,S : 毫秒
         */
        //Date --> String
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss.SSS");
        System.out.println(sdf.format(d));

        //String --> Date
        String dataString = "2022-8-1 16-16-16.666";
        Date parseDate = sdf.parse(dataString);
        System.out.println(parseDate);

        //TODO 根据时间戳构建指定的日期对象
        //d.setTime(System.currentTimeMillis());
        //TODO 获取时间戳
        //d.getTime();

        //TODO 判断定义的时间是否早于或者晚于现在的时间
        System.out.println(parseDate.before(d));//true 22年8月1日 早于现在
        System.out.println(parseDate.after(d));//false
    }
}
