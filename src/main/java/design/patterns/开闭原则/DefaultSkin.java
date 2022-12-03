package design.patterns.开闭原则;

/**
 * 默认皮肤实现类
 */
public class DefaultSkin extends AbstractSkin {
    @Override
    public void display() {
        System.out.println("默认皮肤");
    }
}
