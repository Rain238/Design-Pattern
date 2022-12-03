package design.patterns.行为型模式.访问者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LightRain
 * 对象结构类
 */
public class Home {
    /**
     * 声明一个集合对象，用来储存元素对象
     */
    private final List<Animal> nodeList = new ArrayList<>();

    /**
     *
     * @param person
     */
    public void action(Person person) {
        //遍历集合获取每一个元素,让访问者访问每一个元素
        for (Animal animal : nodeList) {
            animal.accept(person);
        }
    }

    /**
     * 添加元素功能
     * @param animal Animal
     */
    public void add(Animal animal) {
        nodeList.add(animal);
    }

}
