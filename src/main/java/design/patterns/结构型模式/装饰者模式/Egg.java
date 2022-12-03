package design.patterns.结构型模式.装饰者模式;

/**
 * @author LightRain
 * 鸡蛋类(具体的装饰者角色)
 */
public class Egg extends Garnish {
    public Egg(FastFood fastFood) {
        super(fastFood, 1, "鸡蛋");
    }

    /**
     * 计算价格
     *
     * @return float
     */
    @Override
    public float cost() {
        return getPrice() + getFastFood().getPrice();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
