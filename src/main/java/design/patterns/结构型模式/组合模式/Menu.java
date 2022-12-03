package design.patterns.结构型模式.组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 菜单类：属于树枝节点
 */
public class Menu extends MenuComponent {
    /**
     * 菜单可以有多个子菜单或者子菜单项
     */
    private final List<MenuComponent> menuComponents = new ArrayList<MenuComponent>();

    public Menu(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(MenuComponent component) {
        menuComponents.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        menuComponents.remove(component);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponents.get(index);
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("-");
        }
        //打印菜单名称
        System.out.println(name);
        //打印子菜单或者菜单项
        for (MenuComponent component : menuComponents) {
            component.print();
        }
    }
}
