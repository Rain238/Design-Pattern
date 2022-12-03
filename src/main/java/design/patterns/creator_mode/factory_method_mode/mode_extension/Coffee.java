package design.patterns.creator_mode.factory_method_mode.mode_extension;

/**
 * @author LightRain
 * 咖啡抽象类
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
