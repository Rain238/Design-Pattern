package design.patterns.创建者模式.原型模式.浅克隆;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        //创建原型对象类
        Realizetype r = new Realizetype();
        //调用Realizetype类中的clone方法进行对象克隆
        Realizetype clone = r.clone();
        System.out.println("原型对象和克隆出来的对象是否是同一个对象？" + (r == clone));
    }
}
