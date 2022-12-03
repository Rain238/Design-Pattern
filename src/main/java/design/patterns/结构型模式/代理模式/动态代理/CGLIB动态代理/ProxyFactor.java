package design.patterns.结构型模式.代理模式.动态代理.CGLIB动态代理;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author LightRain
 * CGLIB动态代理
 * 代理对象工厂,用来获取代理对象
 */
public class ProxyFactor implements MethodInterceptor {
    /**
     * 声明目标类变量
     */
    private final TrainStation trainStation = new TrainStation();

    /**
     * 动态代理方法
     *
     * @return TrainStation
     */
    public TrainStation getProxyObject() {
        //创建Enhancer对象,类似于JDK中的Proxy对象
        Enhancer enhancer = new Enhancer();
        //设置父类字节码对象
        enhancer.setSuperclass(TrainStation.class);
        //设置回调函数
        enhancer.setCallback(this);
        //创建代理对象
        TrainStation proxyObject = (TrainStation) enhancer.create();
        return proxyObject;
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("代售点收取一定服务费用！CGLib动态代理");
        Object invoke = method.invoke(trainStation, args);
        return invoke;
    }
}
