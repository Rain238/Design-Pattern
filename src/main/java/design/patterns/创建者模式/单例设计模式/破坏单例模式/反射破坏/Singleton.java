package design.patterns.创建者模式.单例设计模式.破坏单例模式.反射破坏;

import java.io.Serializable;

/**
 * 使用反射破坏单例模式
 */
public class Singleton implements Serializable {
    private static boolean flag = false;

    //1. 私有构造
    private Singleton() {
        //解决多线程问题
        synchronized (Singleton.class) {
            /**
             * 反射破解单例模式解决方案
             */
            if (flag) {
                throw new RuntimeException("重复创建对象");
            }
            //将flag设置为true
            flag = true;
        }
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
