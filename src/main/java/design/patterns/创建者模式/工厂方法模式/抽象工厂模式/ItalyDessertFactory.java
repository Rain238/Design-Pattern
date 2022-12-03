package design.patterns.创建者模式.工厂方法模式.抽象工厂模式;

/**
 * @author LightRain
 * 意大利风味工厂实现类
 */
public class ItalyDessertFactory implements DessertFactory {
    /**
     * 生产拿铁咖啡
     *
     * @return Coffee
     */
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    /**
     * 生产提拉米苏
     *
     * @return Dessert
     */
    @Override
    public Dessert createDessert() {
        return new Trimisu();
    }
}
