package design.patterns.行为型模式.观察者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LightRain
 * 具体主题角色
 */
public class SubscriptionSubject implements Subject {
    /**
     * 定义一个集合，用来储存多个观察者对象
     */
    private final List<Observer> weixinUserList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        weixinUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weixinUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : weixinUserList) {
            //调用观察者中的update方法
            observer.update(message);
        }
    }
}
