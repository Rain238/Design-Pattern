package design.patterns.结构型模式.代理模式.静态代理;

/**
 * @author LightRain
 * 火车站类
 */
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
