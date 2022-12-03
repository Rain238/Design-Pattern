package design.patterns.结构型模式.外观模式;

/**
 * @author LightRain
 * 电灯
 */
public class Light extends Switch {
    @Override
    public void on() {
        System.out.println("开启开灯...");
    }

    @Override
    public void off() {
        System.out.println("关闭开灯...");
    }
}
