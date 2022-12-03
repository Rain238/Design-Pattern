package design.patterns.创建者模式.原型模式.浅克隆.demo;

/**
 * @author LightRain
 * 浅克隆奖状案例
 */
public class Citation implements Cloneable {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    public void show() {
        System.out.println(name + "同学,在2020学年第一学期中表现优秀,被评为三好学生。特发此状!");
    }
}
