package design.patterns.创建者模式.工厂方法模式.抽象工厂模式;

/**
 * @author LightRain
 * 甜品工厂接口类
 */
public interface DessertFactory {
    /**
     * 生产咖啡功能
     *
     * @return Coffee
     */
    Coffee createCoffee();

    /**
     * 生产甜品功能
     *
     * @return Dessert
     */
    Dessert createDessert();
}
