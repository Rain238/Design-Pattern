package design.patterns.行为型模式.访问者模式;

/**
 * @author LightRain
 * 具体访问者角色类（宠物主人类）
 */
public class Owner implements Person {
    @Override
    public void feed(Cat cat) {
        System.out.println("主人喂食宠物猫...");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("注入喂食宠物狗...");
    }
}
