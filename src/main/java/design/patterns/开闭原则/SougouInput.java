package design.patterns.开闭原则;

/**
 * 搜狗输入法模拟类 聚合AbstractSkin
 */
public class SougouInput {
    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display() {
        skin.display();
    }
}
