package design.patterns.创建者模式.工厂方法模式.工厂方法模式;

/**
 * @author LightRain
 * 咖啡类
 */
public abstract class Coffee {
    /**
     * 咖啡吗名称
     * @return String
     */
    public abstract String getName();

    /**
     * 加糖
     */
    public void addsugar() {
        System.out.println("加糖");
    }

    /**
     * 加奶
     */
    public void addMilk() {
        System.out.println("加奶");
    }
}
