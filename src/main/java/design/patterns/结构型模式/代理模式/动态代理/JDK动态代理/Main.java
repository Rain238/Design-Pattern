package design.patterns.结构型模式.代理模式.动态代理.JDK动态代理;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        //获取代理工厂
        //1. 创建代理工厂
        ProxyFactory factory = new ProxyFactory();
        //2. 通过factory获取代理对象
        SellTickets proxyObject = factory.getSellTickets();
        //3. 调用方法
        HashSet<String> sell = proxyObject.sell();
        System.out.println(sell);
        //获取代理类名称，代理类在内存中创建，程序结束时释放
        System.out.println(proxyObject.getClass());

    }
}
