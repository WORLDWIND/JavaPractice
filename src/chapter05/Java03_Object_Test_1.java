package chapter05;

import java.util.Arrays;

/**
 * @program: java-top-speed
 * @author: Mr.WorldWind
 * @create: 2023/2/20  10:41
 **/
public class Java03_Object_Test_1 {
    public static void main(String[] args) {
        //TODO 常见类和对象
        //冒泡排序
        int[] arr = {1,3,4,5,2};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j]>arr[j+1]){
                    int a = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = a;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
