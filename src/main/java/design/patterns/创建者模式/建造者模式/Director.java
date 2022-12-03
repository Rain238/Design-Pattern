package design.patterns.创建者模式.建造者模式;

/**
 * @author LightRain
 * 指挥者类，用于指挥构建
 */
public class Director {
    /**
     * 声明Builder对象
     */
    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 组装自行车
     * @return Bike
     */
    public Bike cunstruct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
