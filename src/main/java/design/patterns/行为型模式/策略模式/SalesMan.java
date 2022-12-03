package design.patterns.行为型模式.策略模式;

/**
 * @author LightRain
 * 策略模式/促销员类
 */
public class SalesMan {
    /**
     * 聚合策略接口
     */
    private Strategy strategy;

    /**
     * 接口式构造器
     *
     * @param strategy 策略接口
     */
    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 调用方法
     */
    public void salesManShow() {
        strategy.show();
    }

    /**
     * 提供set方法
     *
     * @param strategy 策略接口
     */
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
