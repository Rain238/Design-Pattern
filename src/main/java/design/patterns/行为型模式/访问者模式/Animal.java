package design.patterns.行为型模式.访问者模式;

/**
 * @author LightRain
 * 抽象元素角色类
 */
public interface Animal {
    /**
     * 接收访问者访问的功能
     * @param person Person
     */
    void accept(Person person);
}
