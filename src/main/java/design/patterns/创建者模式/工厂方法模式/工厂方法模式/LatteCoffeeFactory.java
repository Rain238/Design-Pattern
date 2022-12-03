package design.patterns.创建者模式.工厂方法模式.工厂方法模式;

/**
 * @author LightRain
 * 拿铁咖啡工厂,专门生产拿铁咖啡
 */
public class LatteCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
