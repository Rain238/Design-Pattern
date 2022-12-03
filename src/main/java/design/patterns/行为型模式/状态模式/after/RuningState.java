package design.patterns.行为型模式.状态模式.after;

/**
 * @author LightRain
 * 电梯运行状态类
 */
public class RuningState extends LifeState {
    /**
     * 运行的时候开电梯门?你疯了!电梯不会给你开的
     */
    @Override
    public void open() {
        //do nothing
    }

    /**
     * 电梯门关闭?这是肯定了
     */
    @Override
    public void close() {
        //虽然可以关门，但这个动作不归我执行
        // do nothing
    }

    /**
     * 这是在运行状态下要实现的方法
     */
    @Override
    public void run() {
        System.out.println("电梯正在运行...");
    }

    /**
     * 这个事绝对是合理的，光运行不停止还有谁坐电梯
     */
    public void stop() {
        super.context.setLifeState(Context.STOPPING_STATE);
        super.context.stop();
    }

}
