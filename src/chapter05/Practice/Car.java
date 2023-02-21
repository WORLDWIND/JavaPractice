package chapter05.Practice;

/**
 * @program: java-top-speed
 * @author: Mr.WorldWind
 * @create: 2023/2/21  19:51
 **/
//Bean类
public class Car {
    private String brand;
    private double price;
    private String color;
    Car(){

    }
//    Car(String brand,double price,String color){
//        this.brand = brand;
//        this.price = price;
//        this.color = color;
//    }


    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }
}
