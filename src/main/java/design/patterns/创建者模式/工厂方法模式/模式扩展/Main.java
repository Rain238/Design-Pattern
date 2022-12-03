package design.patterns.创建者模式.工厂方法模式.模式扩展;

import design.patterns.creator_mode.factory_method_mode.mode_extension.Coffee;
import design.patterns.creator_mode.factory_method_mode.mode_extension.CoffeeFactory;

/**
 * 静态成员变量用来存储创建的对象（键存储的是名称，值存储的是对应的对象)，而读取配置文件以及创建对象写在静态代码块中，目的就是只需要执行一次。
 */
public class Main {
    public static void main(String[] args) {
        Coffee american = CoffeeFactory.createCoffee("american");
        String americanName = american.getName();
        System.out.println(americanName);
        System.out.println("===================");
        Coffee latte = CoffeeFactory.createCoffee("latte");
        String latteName = latte.getName();
        System.out.println(latteName);
        System.out.println("===================");
        Coffee cacpuccino = CoffeeFactory.createCoffee("cacpuccino");
        String cacpuccinoName = cacpuccino.getName();
        System.out.println(cacpuccinoName);

    }
}
