package chapter04;

/**
 * @program: java-top-speed
 * @author: Mr.Li
 * @create: 2023/1/9  13:19
 **/
public class Java02_Object_2 {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "张三";
        Student s = new Student();
        s.name = "李四";
        t.teach();
        s.study();
    }
}
class Teacher{
    String name;
    void teach(){
        System.out.println(name+"老师在讲课");
    }
}
class Student{
    String name;
    void study(){
        System.out.println(name+"在听课");
    }
}