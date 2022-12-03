package design.patterns.结构型模式.享元角色;

import java.util.HashMap;

/**
 * @author LightRain
 * 工厂类：为单例模式
 */
public class BoxFactory {
    private HashMap<String, AbstractBox> map;

    /**
     * 构造方法中进行初始化操作
     */
    private BoxFactory() {
        map = new HashMap<>();
        map.put("I", new IBox());
        map.put("L", new LBox());
        map.put("O", new OBox());
    }

    /**
     * 提供一个方法获取工厂对象
     *
     * @return BoxFactory
     */
    public static BoxFactory getInstance() {
        return boxFactory;
    }

    private static BoxFactory boxFactory = new BoxFactory();

    /**
     * 根据图形获取图形对象
     *
     * @param name 图形名称
     * @return AbstractBox
     */
    public AbstractBox getShape(String name) {
        return map.get(name);
    }
}
