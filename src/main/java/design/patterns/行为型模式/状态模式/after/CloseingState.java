package design.patterns.行为型模式.状态模式.after;

/**
 * @author LightRain
 * 电梯关闭状态类
 */
public class CloseingState extends LifeState {
    /**
     * 电梯门关闭，这是关闭状态要实现的动作
     */
    @Override
    public void open() {
        super.context.setLifeState(Context.OPENING_STATE);
        super.context.open();
    }

    /**
     * 电梯门关了再打开，逗你玩呢，那这个允许呀
     */
    @Override
    public void close() {
        System.out.println("电梯门关闭...");

    }

    /**
     * 电梯门关了就跑，这是再正常不过了
     */
    @Override
    public void run() {
        super.context.setLifeState(Context.RUNING_STATE);
        super.context.run();
    }

    /**
     * 电梯门关着,我就不按楼层
     */
    @Override
    public void stop() {
        super.context.setLifeState(Context.STOPPING_STATE);
        super.context.stop();
    }
}
