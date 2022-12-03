package design.patterns.行为型模式.观察者模式;

/**
 * @author LightRain
 * 具体观察者角色类
 */
public class WeiXinUser implements Observer {
    /**
     * 记录微信名称
     */
    private String name;

    public WeiXinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + ": " + message);
    }
}
