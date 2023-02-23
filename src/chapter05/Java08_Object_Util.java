package chapter05;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 * @program: java-top-speed
 * @author: Mr.WorldWind
 * @create: 2023/2/23  13:57
 **/
public class Java08_Object_Util {
    public static void main(String[] args) throws Exception {
        System.out.println(StringUtil.isEmpty(null));
        System.out.println(StringUtil.isEmpty(""));
        System.out.println(StringUtil.isEmpty("   "));
        System.out.println(StringUtil.isEmpty("abc"));

        System.out.println(StringUtil.makeString());
        System.out.println(StringUtil.makeString("NiceToMeetYouToDie",3));

        System.out.println(StringUtil.formatDate(new Date(), "yyyy-MM-dd"));
        System.out.println(StringUtil.parseDate("2023-2-16", "yyyy-MM-dd"));

    }
}
// TODO 字符串工具类
//  1. 工具类不应该创建对象才能使用,也就是说,可以直接访问类中的属性和方法,一般声明静态
//  2. 工具类对外提供的属性或方法都应该是公开的
//  3. 为了使用者开发方便,应该提供更为丰富的方法和属性
class StringUtil{
    // TODO 非空判断
    public static boolean isEmpty(String str){
        //如果字符串为null,则判断为孔
        //如果字符串为空,判断为空
        //如果字符串全都是空格,判断为空
        if(str == null||"".equals(str.trim())) return true;
        return false;
    }
    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }
    // TODO 生成随机字符串
    public static String makeString(){
        return UUID.randomUUID().toString();
    }
    public static String makeString(String str,int len){
        if (len < 1) return "";
        else {
            StringBuffer sb = new StringBuffer();
            char[] chars = str.toCharArray();
            Random random = new Random();
            for (int i = 0; i < len; i++) {
                int j = random.nextInt(chars.length);
                char c = chars[j];
                sb.append(c);
            }
            return sb.toString();
        }
    }
    // TODO 转换字符串 : ISO8859-1 ==> UTF-8
    public static String transform(String source,String encodeForm,String encodeTo) throws Exception{
        byte[] bytes = source.getBytes(encodeForm);
        return new String(bytes,encodeTo);
    }
    // TODO 日期
    //  parse()方法 : 输入String类型,返回Date类型
    public static Date parseDate(String DateString,String format) throws  Exception{
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.parse(DateString);
    }
    //TODO 日历
    // format()方法 : 输入Date,返回String
    public static String formatDate(Date date,String format) throws Exception  {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }
}