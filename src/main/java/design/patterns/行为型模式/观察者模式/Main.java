package design.patterns.行为型模式.观察者模式;

public class Main {
    public static void main(String[] args) {
        //创建公众号对象
        SubscriptionSubject subject = new SubscriptionSubject();
        //订阅公众号
        subject.attach(new WeiXinUser("小明"));
        subject.attach(new WeiXinUser("张三"));
        subject.attach(new WeiXinUser("阿刁"));
        //公众号更新，发出消息给订阅者（观察者对象）
        subject.notify("黑马程序员专栏更新了！");
    }
}
