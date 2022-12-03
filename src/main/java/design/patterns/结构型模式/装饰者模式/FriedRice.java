package design.patterns.结构型模式.装饰者模式;

/**
 * @author LightRain
 * 炒饭类(具体构建角色)
 */
public class FriedRice extends FastFood {
    public FriedRice() {
        super(10, "炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
