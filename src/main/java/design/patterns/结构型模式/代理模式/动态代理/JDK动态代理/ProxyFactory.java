package design.patterns.结构型模式.代理模式.动态代理.JDK动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author LightRain
 * 获取代理工厂类
 * 代理类也实现了对应的接口
 */
public class ProxyFactory {

    /**
     * 声明目标对象
     */
    private final TrainStation trainStation = new TrainStation();

    /**
     * 获取代理对象方法
     *
     * @return SellTickets
     */
    public SellTickets getSellTickets() {
        //获取代理
        /*
        ClassLoader loader: 类加载器,用于加载代理类,可以通过目标对象获取类加载器
        Class<?>[] interfaces: 代理类实现的接口的字节码对象
        InvocationHandler: 代理对象调用处理程序
         */
        SellTickets proxyObject = (SellTickets) Proxy.newProxyInstance(
                trainStation.getClass().getClassLoader(),
                trainStation.getClass().getInterfaces(),
                new InvocationHandler() {
                    /*
                    Object proxy：代理对象。和proxyObject对象是同一个对象,在invoke方法中基本不用
                    Method method：对接口中的方法进行封装的method对象
                    Object[] args：调用方法的实际参数
                    返回值：方法的返回值
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("invoke执行了");
                        System.out.println("代售点收取服务费用JDK动态代理！");
                        //执行目标对象方法,使用反射调用
                        //                            目标对象    实际参数
                        Object obj = method.invoke(trainStation, args);//invoke就可以获取方法的返回值
                        return obj;
                    }
                }
        );
        //返回代理对象
        return proxyObject;
    }
}
