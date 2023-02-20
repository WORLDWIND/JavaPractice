package chapter04;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/2/12  16:39
 **/
public class Java22_Object {
    public static void main(String[] args) {
        //TODO 面向对象 - 接口
        //所谓的接口,可以简单理解为规则
        //基本语法 : interface 接口名称 { 规则属性 , 规则行为 }
        //接口实际上是抽象的
        //规则的属性必定为固定值,并且不能被修改
        //属性和行为的访问权限必须为公开的
        //属性应该是静态的
        //行为是抽象的
        //接口和类是两个层面上的东西
        //接口可以继承其他接口
        //类的对象需要遵循接口,在Java中,这个遵循,称之为实现(implements),类需要实现接口,而且可以实现多个接口
        Computer computer = new Computer();
        Light light = new Light();
        computer.usb1 = light;
        Light light1 = new Light();
        computer.usb2 = light1;
        computer.powerSupply();
        light1.test();
        //computer.powerSupply();
    }
}
interface USBInterface{

}
interface USBSupply{
    public void powerSupply();
}
interface USBReceive{
    public void powerReceive();
}
class Computer implements USBSupply{
    public USBReceive usb1;
    public USBReceive usb2;
    @Override
    public void powerSupply() {
        System.out.println("电脑提供电源");
        usb1.powerReceive();
        usb2.powerReceive();
    }
}
class Light implements USBReceive{
    @Override
    public void powerReceive() {
        System.out.println("电灯接受电源");
    }
    public void test(){
        System.out.println("test");
    }
}