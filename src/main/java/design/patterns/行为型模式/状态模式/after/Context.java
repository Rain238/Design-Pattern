package design.patterns.行为型模式.状态模式.after;

/**
 * @author LightRain
 * 环境角色类
 */
public class Context {
    /**
     * 定义对应状态对象的常量
     */
    public final static OpeningState OPENING_STATE = new OpeningState();
    public final static CloseingState CLOSEING_STATE = new CloseingState();
    public final static RuningState RUNING_STATE = new RuningState();
    public final static StopingState STOPPING_STATE = new StopingState();
    /**
     * 定义当前电梯状态变量
     */
    private LifeState lifeState;

    public LifeState getLifeState() {
        return lifeState;
    }

    /**
     * 设置当前状态
     *
     * @param lifeState LifeState
     */
    public void setLifeState(LifeState lifeState) {
        this.lifeState = lifeState;
        //设置当前状态对象中的Context对象
        this.lifeState.setContext(this);
    }

    public void open() {
        this.lifeState.open();
    }

    public void close() {
        this.lifeState.close();
    }

    public void run() {
        this.lifeState.run();
    }

    public void stop() {
        this.lifeState.stop();
    }
}
