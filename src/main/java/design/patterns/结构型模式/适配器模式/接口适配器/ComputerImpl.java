package design.patterns.结构型模式.适配器模式.接口适配器;

/**
 * @author LightRain
 * 接口适配器
 * 注意:还有一个适配器模式是接口适配器模式。当不希望实现一个接口中所有的方法时，
 * 可以创建一个抽象类Adapter，实现所有方法。而此时我们只需要继承该抽象类即可。
 */
public class ComputerImpl extends Adapter {
    @Override
    public String cpu() {
        return "只实现CPU方法";
    }
}
