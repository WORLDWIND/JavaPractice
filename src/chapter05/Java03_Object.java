package chapter05;

/**
 * @program: java-top-speed
 * @author: Mr.WorldWind
 * @create: 2023/2/18  09:24
 **/
public class Java03_Object {
    public static void main(String[] args) {
        //数组
//        int[] nums = new int[3];
//        for (int num : nums) {
//            System.out.println(num);
//        }

//        String[] str = {"hello","WORLD","你好"};
//        for (String s : str) {
//            System.out.println(s);
//        }
        //二维数组 不是真正的二维,Java没有行列的概念
        int[][] arr = {{1,2,3},{2,3,4},{3,4,5}};
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }
    }
}
