package design.patterns.结构型模式.外观模式;

/**
 * @author LightRain
 * 电视
 */
public class Tv extends Switch {
    @Override
    public void on() {
        System.out.println("开启电视...");
    }

    @Override
    public void off() {
        System.out.println("关闭电视...");
    }
}
