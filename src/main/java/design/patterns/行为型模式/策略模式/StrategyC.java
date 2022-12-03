package design.patterns.行为型模式.策略模式;

/**
 * @author LightRain
 * 具体策略角色类
 */
public class StrategyC implements Strategy {
    @Override
    public void show() {
        System.out.println("满1000减200");
    }
}
