package design.patterns.创建者模式.原型模式.深克隆;

import java.io.Serializable;

/**
 * @author LightRain
 */
public class Student implements Serializable {
    /**
     * 学生姓名
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
