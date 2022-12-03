package design.patterns.结构型模式.装饰者模式;

/**
 * @author LightRain
 * 装饰者类(抽象装饰者角色)
 */
public abstract class Garnish extends FastFood {
    /**
     * 声明快餐类的变量
     */
    private final FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public Garnish(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(FastFood fastFood, float price, String desc) {
        super(price, desc);
        this.fastFood = fastFood;
    }

}
