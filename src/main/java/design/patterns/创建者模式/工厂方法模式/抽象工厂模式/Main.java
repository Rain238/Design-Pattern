package design.patterns.创建者模式.工厂方法模式.抽象工厂模式;

public class Main {
    public static void main(String[] args) {
        ItalyDessertFactory factory = new ItalyDessertFactory();
//        AmericanDessertFactory factory = new AmericanDessertFactory();
        //拿铁咖啡
        Coffee coffee = factory.createCoffee();
        //提拉米苏
        Dessert dessert = factory.createDessert();
        String name = coffee.getName();
        dessert.show();
        System.out.println(name);

        System.out.println("================================================");

        AmericanDessertFactory amf = new AmericanDessertFactory();
        //美式咖啡
        Coffee amfCoffee = amf.createCoffee();
        String name1 = amfCoffee.getName();
        //抹茶慕斯
        Dessert amfDessert = amf.createDessert();
        amfDessert.show();
        System.out.println(name1);
    }
}
