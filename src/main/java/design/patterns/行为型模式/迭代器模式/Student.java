package design.patterns.行为型模式.迭代器模式;

/**
 * @author LightRain
 * 学生类
 */
public class Student {
    /**
     * 姓名
     */
    private String name;
    /**
     * 学号
     */
    private String number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Student(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
