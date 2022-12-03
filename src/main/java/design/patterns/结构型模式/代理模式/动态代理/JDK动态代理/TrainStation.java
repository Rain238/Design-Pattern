package design.patterns.结构型模式.代理模式.动态代理.JDK动态代理;

import java.util.HashSet;

/**
 * @author LightRain
 * 火车站类
 */
public class TrainStation implements SellTickets {
    @Override
    public HashSet<String> sell() {
        System.out.println("火车站卖票");
        HashSet<String> set = new HashSet<String>();
        set.add("1");
        set.add("2");
        set.add("3");
        return set;
    }
}
