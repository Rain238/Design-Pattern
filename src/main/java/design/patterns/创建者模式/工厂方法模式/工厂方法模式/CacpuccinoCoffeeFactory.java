package design.patterns.创建者模式.工厂方法模式.工厂方法模式;

/**
 * @author LightRain
 * 卡布奇诺咖啡工厂
 */
public class CacpuccinoCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new CacpuccinoCoffee();
    }
}
