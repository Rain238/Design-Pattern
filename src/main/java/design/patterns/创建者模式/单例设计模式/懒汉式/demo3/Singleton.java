package design.patterns.创建者模式.单例设计模式.懒汉式.demo3;

/**
 * 懒汉式：双重检查锁
 * 再来讨论一下懒汉模式中加锁的问题，对于getInstance()方法来说
 * 绝大部分的操作都是读操作，读操作是线程安全的，所以
 * 我们没必让每个线程必须持有锁才能调用该方法，我们需要调整加锁的时机。由此也产生了一种新的实现模式:双重检查锁模式
 * volatile:禁止JVM指令重排操作
 * 添加volatile关键字之后的双重检查锁模式是一种比较好的单例实现模式，能够保证在多线程的情况下线程安全也不会有性能问题。
 */
public class Singleton {
    //1. 私有构造方法
    private Singleton() {
    }

    //2. 声明Singleton类型的变量instance
    private static volatile Singleton instance;

    //3. 对外提供访问方式
    public static Singleton getInstance() {
        //第一次判断，如果instance的值不为null，不需要抢占锁，直接返回对象
        if (instance == null) {
            synchronized (Singleton.class) {
                //第二次判断
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
