package design.patterns.创建者模式.工厂方法模式.简单工厂模式;

/**
 * 简单工厂类
 *
 * @author LightRain
 */
public class SimpleCoffeeFactory {
    public static Coffee createCoffee(String type) {
        //声明Coffee类型的变量吗,根据不同类型创建不同的子类Coffee对象
        Coffee coffee = null;
        if ("anerican".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起没有该品种咖啡！");
        }
        return coffee;
    }
}
