package design.patterns.创建者模式.单例设计模式.懒汉式.demo1;

/**
 * 懒汉式：线程不安全
 */
public class Singleton {
    //1. 私有构造方法
    private Singleton() {
    }

    //2. 声明Singleton类型的变量instance
    private static Singleton instance;

    //3. 对外提供访问方式
    public static Singleton getInstance() {
        //判断instance是否为null,如果为null,说明还没有创建Singleton类的对象
        //如果没有则创建一个并返回,如果有直接返回
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
