package chapter05;

import javax.sound.midi.MidiDevice;

/**
 * @program: java-top-speed
 * @author: Mr.WorldWind
 * @create: 2023/2/20  13:47
 **/
public class Java03_Object_Test_3 {
    public static void main(String[] args) {
        //TODO 二分查找法
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int start = 0;
        int end = arr.length - 1;
        int target = 8;
        int middle = 0;
        while (start <= end) {
            middle = (end + start) / 2;
            if (arr[middle] < target) {
                start = middle + 1;
            } else if (arr[middle] > target) {
                end = middle - 1;
            } else {
                break;
            }
        }
        System.out.println(end);
        System.out.println(start);
        System.out.println(middle);
    }
}
