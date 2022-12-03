package design.patterns.结构型模式.组合模式;

/**
 * @author LightRain
 * 菜单组件：属于抽象根节点
 */
public abstract class MenuComponent {
    /**
     * 菜单组件名称
     */
    protected String name;
    /**
     * 菜单组件层级
     */
    protected int level;

    /**
     * 添加子菜单
     *
     * @param component 组件
     */
    public void add(MenuComponent component) {
        throw new UnsupportedOperationException();
    }

    /**
     * 移除子菜单
     *
     * @param component 组件
     */
    public void remove(MenuComponent component) {
        throw new UnsupportedOperationException();
    }

    /**
     * 获取指定的子菜单
     *
     * @param index 索引
     * @return MenuComponent
     */
    public MenuComponent getChild(int index) {
        throw new UnsupportedOperationException();
    }

    /**
     * 获取菜单或者菜单项的名称
     *
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * 打印菜单名称的方法（包含子菜单和菜单项）
     */
    public abstract void print();

}
