package design.patterns.行为型模式.观察者模式;

/**
 * @author LightRain
 * 抽象主题角色接口
 */
public interface Subject {
    /**
     * 添加订阅者（添加观察者对象）
     *
     * @param observer Observer
     */
    void attach(Observer observer);

    /**
     * 删除订阅者（删除观察者对象）
     *
     * @param observer Observer
     */
    void detach(Observer observer);

    /**
     * 通知订阅者更新消息
     *
     * @param message String
     */
    void notify(String message);
}
