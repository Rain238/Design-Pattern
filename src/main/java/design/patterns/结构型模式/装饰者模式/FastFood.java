package design.patterns.结构型模式.装饰者模式;

/**
 * @author LightRain
 * 快餐抽象类(抽象构建角色)
 */
public abstract class FastFood {
    /**
     * 价格
     */
    private float price;
    /**
     * 描述
     */
    private String desc;

    public FastFood() {
    }

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * 计算价格
     * @return float
     */
    public abstract float cost();
}
