package design.patterns.开闭原则;

/**
 * 自定义皮肤实现类
 */
public class HeimaSkin extends AbstractSkin {
    @Override
    public void display() {
        System.out.println("黑马程序员");
    }
}
