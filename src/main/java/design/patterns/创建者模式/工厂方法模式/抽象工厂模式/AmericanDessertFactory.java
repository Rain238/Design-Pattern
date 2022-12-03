package design.patterns.创建者模式.工厂方法模式.抽象工厂模式;

/**
 * @author LightRain
 * 美式风味工厂实现类
 * 可以生成美式咖啡和抹茶慕斯
 */
public class AmericanDessertFactory implements DessertFactory {
    /**
     * 生产美式咖啡
     *
     * @return Coffee
     */
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    /**
     * 生产抹茶慕斯
     *
     * @return Dessert
     */
    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
