package design.patterns.结构型模式.代理模式.静态代理;

/**
 * 代售点类
 */
public class ProxyPoint implements SellTickets {
    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("收取服务费");
        trainStation.sell();
    }
}
