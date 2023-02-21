package chapter05.Practice;

/**
 * @program: java-top-speed
 * @author: Mr.WorldWind
 * @create: 2023/2/21  19:52
 **/
public class CarTest {
    public static void main(String[] args) {
        //Car c = new Car("奥迪",200,"黑色");
        int[] arr = new int[10];
        Car c = new Car();
        Car b = new Car();
        System.out.println(b);
        System.out.println(b);
        c.setColor("紫色");
        c.setBrand("大众");
        c.setPrice(2000000);
        System.out.println(c.getPrice());
    }
}
