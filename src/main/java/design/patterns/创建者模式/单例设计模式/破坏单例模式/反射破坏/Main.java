package design.patterns.创建者模式.单例设计模式.破坏单例模式.反射破坏;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 通过反射破坏单例模式
 */
public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取Singleton字节码文件
        Class<Singleton> clazz = Singleton.class;
        //获取无参构造方法对象
        Constructor<Singleton> cons = clazz.getDeclaredConstructor();
        //取消访问检查
        cons.setAccessible(true);
        //创建Singleton对象
        Singleton singleton = cons.newInstance();
//        Singleton singleton2 = cons.newInstance();
        //true：同一个对象
        //false：不是同一个对象
//        System.out.println(singleton == singleton2);
        System.out.println(singleton);
    }
}
