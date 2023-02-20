package chapter02;

public class Java02_Variable {
    public static void main(String[] args) {
        //TODO 标识符
        //表示数据的符号，称之为标识符
        //变量名就是标识符
        //标识符主要用于起名
        String name = "zhangsan";

        //TODO 标识符命名规则
        //1.英文拉丁字母
        //wx,qq
        String username = "zhansan";
        String xingming = "lisi";
        //2.符号
        //@,#,$,%
        //标识符只能采用下划线和美元$符号，其他符号不能使用,称之为特殊符号
        String _name = "wangwu";
        String $name = "leifeng";
        String $na_me = "liyuhang";
        System.out.println(_name);
        System.out.println($name);
        System.out.println($na_me);
        //3.数字
        //阿拉伯数字0~9可以作为标识符使用,但是不能开头
        //数组如果在标识符开头位置,那么就会呗识别为数字,不是标识符,所以会发生错误 String 1name = "name";
        String name1 = "zhangsan";
        //4.在大括号范围内,标识符不允许重复 String name;(前面有name)
        //标识符区分大小写的 String NAME = "zhangsan";
        //5. Java语言中预先定义好了一些标识符,称之为关键字,保留字 例:public static (可以大写)
        //可以使用大写来实现关键字名称的定义,但是不推荐容易造成歧义
        //6.驼峰标识:规范
        String userName = "zhangsan";
        //7.标识符的长度
        //没有长度的限制
    }
}
