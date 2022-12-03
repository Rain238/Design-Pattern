package design.patterns.创建者模式.建造者模式;

/**
 * @author LightRain
 * 构建者抽象类，因为是共有属性
 */
public abstract class Builder {
    /**
     * 声明产品类对象
     */
    protected Bike bike = new Bike();

    /**
     * 构架车架
     */
    public abstract void buildFrame();

    /**
     * 构建车座
     */
    public abstract void buildSeat();

    /**
     * 构建自行车
     *
     * @return Bike
     */
    public abstract Bike createBike();
}
