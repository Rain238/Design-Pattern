package design.patterns.创建者模式.原型模式.深克隆;

import java.io.Serializable;

/**
 * @author LightRain
 * 深克隆奖状案例
 * 必须：implements Cloneable, Serializable
 * Cloneable:重写clone的克隆方法
 * Serializable:序列化接口
 */
public class Citation implements Cloneable, Serializable {
    private Student stu;

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    public void show() {
        System.out.println(stu.getName() + "同学,在2020学年第一学期中表现优秀,被评为三好学生。特发此状!");
    }
}
