package design.patterns.行为型模式.策略模式;

public class Main {
    public static void main(String[] args) {
        //创建促销员
        SalesMan salesMan = new SalesMan(new StrategyB());
        salesMan.salesManShow();
        System.out.println("============");
        //使用春节促销活动
        salesMan.setStrategy(new StrategyA());
        salesMan.salesManShow();
        System.out.println("============");
        //使用中秋节活动
        salesMan.setStrategy(new StrategyC());
        salesMan.salesManShow();
    }
}
