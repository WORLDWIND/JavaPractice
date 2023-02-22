package chapter05;

/**
 * @program: java-top-speed
 * @author: Mr.WorldWind
 * @create: 2023/2/22  13:59
 **/
public class Java05_Object_DataType {
    public static void main(String[] args) {
        //TODO 常见类和对象
        /**
         * byte short int long
         * float double
         * char boolean
         */
        // TODO 包装类
        /*Byte b = null;
        Short s = null;
        Integer i = null;
        Long lon = null;
        Float f = null;
        Double d = null;
        Character c = null;
        Boolean b1 = null;*/

        int i = 10;
        //Integer i1 = new Integer(i); Java不推荐使用
        //TODO 将基本数据类型转换为包装类型
        //自动装箱
        //Integer integer = Integer.valueOf(i);
        Integer i1 = i;
        //自动拆箱
        //int i2 = i1.intValue();
        int i2 = i1;
    }
}
