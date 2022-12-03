package design.patterns.行为型模式.访问者模式;

/**
 * @author LightRain
 * 抽象访问者角色类
 */
public interface Person {
    /**
     * 喂食宠物猫
     *
     * @param cat Cat
     */
    void feed(Cat cat);

    /**
     * 喂食宠物狗
     *
     * @param dog Dog
     */
    void feed(Dog dog);
}
