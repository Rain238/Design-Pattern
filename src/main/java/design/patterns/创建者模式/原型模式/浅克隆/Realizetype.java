package design.patterns.创建者模式.原型模式.浅克隆;

/**
 * @author LightRain
 * 继承Cloneable重写clone方法实现浅克隆
 */
public class Realizetype implements Cloneable {
    public Realizetype() {
        System.out.println("具体的原型对象创建成功！");
    }

    @Override
    protected Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (Realizetype) super.clone();
    }
}
