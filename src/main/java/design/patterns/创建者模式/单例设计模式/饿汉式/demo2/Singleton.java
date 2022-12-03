package design.patterns.创建者模式.单例设计模式.饿汉式.demo2;

/**
 * 饿汉式：静态代码块
 */
public class Singleton {
    //1. 私有构造方法
    private Singleton() {
    }

    //2. 声明Singleton类型的变量
    private static Singleton instance;//null

    //3. 在静态代码块中进行赋值
    static {
        instance = new Singleton();
    }

    //对外提供获取该类对象的方法
    public static Singleton getInstance() {
        return instance;
    }
}
