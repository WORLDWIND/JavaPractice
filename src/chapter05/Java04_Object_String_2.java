package chapter05;

/**
 * @program: java-top-speed
 * @author: Mr.WorldWind
 * @create: 2023/2/22  11:30
 **/
public class Java04_Object_String_2 {
    public static void main(String[] args) {
        //TODO StringBuilder的使用

        /**方法效率非常低 每一次拼接都会创建一个新的对象*/
       /* String s = "";
        for (int i = 0; i < 100; i++) {
            s += i;
        }
        System.out.println(s);*/
        /**效率非常高 底层用数组*/
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 100; i++) {
            sb.append(i);
        }
        System.out.println(sb.toString());

        StringBuffer s = new StringBuffer();
        s.append("abc");
        System.out.println(s.toString());
        System.out.println(s.reverse());//反转操作
        System.out.println(s.insert(1, "d"));//将d插入到数组下标为1的位置
    }
}
