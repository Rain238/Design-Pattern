package design.patterns.结构型模式.装饰者模式;

/**
 * @author LightRain
 * 培根类(具体的装饰者角色)
 */
public class Bacon extends Garnish {
    public Bacon(FastFood fastFood) {
        super(fastFood, 2, "培根");
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
