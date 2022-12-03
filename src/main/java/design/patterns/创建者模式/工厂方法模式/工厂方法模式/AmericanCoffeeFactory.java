package design.patterns.创建者模式.工厂方法模式.工厂方法模式;

/**
 * @author LightRain
 * 美式咖啡工厂，专门生产美式咖啡
 */
public class AmericanCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
