package design.patterns.创建者模式.工厂方法模式.工厂方法模式;

/**
 * @author LightRain
 * 咖啡工厂接口
 */
public interface CoffeeFactory {
    /**
     * 创建咖啡对象方法
     *
     * @return Coffee
     */
    Coffee createCoffee();
}
