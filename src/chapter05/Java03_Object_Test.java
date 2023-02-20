package chapter05;

/**
 * @program: java-top-speed
 * @author: Mr.WorldWind
 * @create: 2023/2/20  10:12
 **/
public class Java03_Object_Test {
    public static void main(String[] args) {
        //TODO 九层妖塔 二维数组实现
        int row = 9;
        int col = 2 * (row - 1) + 1;
        String[][] arr = new String[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (j == row - 1 || j >= row - 1 - i && j <= row - 1 + i) {
                    arr[i][j] = "*";

                    continue;
                }
                arr[i][j] = "-";
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println("..."+i);
        }
    }
}
