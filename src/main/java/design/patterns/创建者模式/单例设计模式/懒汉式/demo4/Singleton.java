package design.patterns.创建者模式.单例设计模式.懒汉式.demo4;

/**
 * 懒汉式：静态内部类，线程安全的并且比双重检查锁简介
 * 静态内部类单例模式中实例由内部类创建，由于TM在加载外部类的过程中，是不会加载静态内部类的，只有内部类的属性/方法被调用时才会被加载，并初始化其静态属性。静态属性由于被static
 * 修饰，保证只被实例化一次，并且严格保证实例化顺序。
 * 说明:
 * 第一次加载singleton类时不会去初始化INSTANCE，只有第一次调用getInstance，虚拟机加载SingletonHolder并初始化INSTANCE，这样不仅能确保线程安全，也能保证singleton类的唯一性。
 * 小结:
 * 静态内部类单例模式是一种优秀的单例模式，是开源项目中比较常用的一种单例模式。在没有加任何锁的情况下，保证了多线程下的安全，并且没有任何性能影响和空间的浪费。
 */
public class Singleton {
    //1. 私有构造
    private Singleton() {
    }

    //2. 定义一个静态内部类
    private static class SingletonHolder {
        //3. 在内部类中声明并初始化外部类
        private static final Singleton INSTANCE = new Singleton();
    }

    //4. 提供公共的访问方法
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
