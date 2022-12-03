package design.patterns.行为型模式.观察者模式;

/**
 * @author LightRain
 * 抽象观察者角色接口
 */
public interface Observer {
    /**
     * 主题更新推送
     *
     * @param message String
     */
    void update(String message);
}
