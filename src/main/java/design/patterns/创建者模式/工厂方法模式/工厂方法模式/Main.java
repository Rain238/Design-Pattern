package design.patterns.创建者模式.工厂方法模式.工厂方法模式;

public class Main {
    public static void main(String[] args) {
        //创建咖啡店
        CoffeeStore store = new CoffeeStore();
        //创建具体咖啡工厂
        CoffeeFactory factory = new CacpuccinoCoffeeFactory();
        store.setFactory(factory);
        //点咖啡
        Coffee coffee = store.orderCoffee();
        System.out.println(coffee.getName());
    }
}
