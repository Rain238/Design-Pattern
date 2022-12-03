package design.patterns.结构型模式.代理模式.动态代理.CGLIB动态代理;

public class Main {
    public static void main(String[] args) {
        //创建代理工厂对象
        ProxyFactor factor = new ProxyFactor();
        //获取代理对象
        TrainStation proxyObject = factor.getProxyObject();
        proxyObject.sell();
    }
}
