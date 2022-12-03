package design.patterns.创建者模式.建造者模式;

/**
 * @author LightRain
 * 摩拜单车构建者,用来构建摩拜单车对象
 */
public class MobikeBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
