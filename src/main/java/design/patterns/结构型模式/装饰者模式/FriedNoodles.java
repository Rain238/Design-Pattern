package design.patterns.结构型模式.装饰者模式;

/**
 * @author LightRain
 * 炒面类(具体构建角色)
 */
public class FriedNoodles extends FastFood {
    public FriedNoodles() {
        super(5, "炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
