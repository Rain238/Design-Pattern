package design.patterns.开闭原则;

/**
 * 开闭原则测试类
 */
public class Client {
    public static void main(String[] args) {
        //创建搜狗对象
        SougouInput input = new SougouInput();
        //创建皮肤对象
//        DefaultSkin skin = new DefaultSkin();
        HeimaSkin skin = new HeimaSkin();
        //设置皮肤
        input.setSkin(skin);
        //显示皮肤
        input.display();
    }
}
