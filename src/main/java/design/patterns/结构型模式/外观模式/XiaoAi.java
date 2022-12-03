package design.patterns.结构型模式.外观模式;

/**
 * @author LightRain
 * 小爱智能音响
 */
public class XiaoAi {
    private Light light;
    private Tv tv;

    public XiaoAi() {
        light = new Light();
        tv = new Tv();
    }

    public void say(String message) {
        if (message.contains("开启")) {
            on();
        } else if (message.contains("关闭")) {
            off();
        } else {
            System.out.println("小爱还不会");
        }
    }

    private void on() {
        light.on();
        tv.on();
    }

    private void off() {
        light.off();
        tv.off();
    }
}
