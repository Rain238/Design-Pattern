package design.patterns.创建者模式.工厂方法模式.简单工厂模式;

/**
 * @author LightRain
 * 咖啡店类
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        //创建咖啡工厂
//        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        //调用生产咖啡的方法
//        Coffee coffee = factory.createCoffee(type);
        Coffee coffee = SimpleCoffeeFactory.createCoffee(type);
        coffee.addsugar();
        coffee.addMilk();
        return coffee;

    }
}
