package design.patterns.创建者模式.工厂方法模式.工厂方法模式;

/**
 * @author LightRain
 * 咖啡店类
 */
public class CoffeeStore {
    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    /**
     * 点咖啡方法
     * @return Coffee
     */
    public Coffee orderCoffee() {
        Coffee coffee = factory.createCoffee();
        coffee.addsugar();
        coffee.addMilk();
        return coffee;
    }
}
