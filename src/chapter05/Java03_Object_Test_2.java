package chapter05;

import java.util.Arrays;

/**
 * @program: java-top-speed
 * @author: Mr.WorldWind
 * @create: 2023/2/20  13:31
 **/
public class Java03_Object_Test_2 {
    public static void main(String[] args) {
        //TODO 选择排序
        int[] arr = {3,4,1,5,2};
        for (int i = 0; i < arr.length; i++) {
            int maxIndex = 0;
            for (int j = 0; j < arr.length - i; j++) {
                if(arr[maxIndex]<arr[j]){
                   maxIndex = j;
                }
            }
            int a = arr[maxIndex];
            arr[maxIndex] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = a;
        }
        System.out.println(Arrays.toString(arr));
    }
}
