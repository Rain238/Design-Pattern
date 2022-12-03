package design.patterns.创建者模式.工厂方法模式.简单工厂模式;

public class Main {
    public static void main(String[] args) {
        CoffeeStore coffee = new CoffeeStore();
        Coffee latte = coffee.orderCoffee("latte");
        System.out.println(latte.getName());
    }
}
