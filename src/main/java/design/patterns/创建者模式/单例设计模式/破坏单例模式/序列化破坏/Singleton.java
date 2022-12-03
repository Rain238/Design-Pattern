package design.patterns.创建者模式.单例设计模式.破坏单例模式.序列化破坏;

import java.io.Serializable;

/**
 * 使用序列化和反序列化破坏单例模式
 * Serializable 序列化接口
 */
public class Singleton implements Serializable {
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

    /**
     * 解决序列化破坏单例模式方法
     * 当进行反序列化时会自动调用该方法，将该方法的返回值直接返回
     *
     * @return Object
     */
    public Object readResolve() {
        return SingletonHolder.INSTANCE;
    }
}
