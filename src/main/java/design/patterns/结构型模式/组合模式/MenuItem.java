package design.patterns.结构型模式.组合模式;

/**
 * @author LightRain
 * 菜单项类：属于叶子节点
 */
public class MenuItem extends MenuComponent {
    public MenuItem(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("-");
        }
        //打印菜单项的名称
        System.out.println(name);
    }
}
