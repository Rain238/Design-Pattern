package design.patterns.行为型模式.状态模式.before;

/**
 * @author LightRain
 * 电梯接口
 */
public interface ILift {
    /**
     * 定义四个电梯状态的常量
     */
    int OPENING_STATE = 1;
    int CLOSED_STATE = 2;
    int RUNNING_STATE = 3;
    int STOPPED_STATE = 4;

    /**
     * 设置电梯状态
     *
     * @param state int
     */
    void setState(int state);

    /**
     * 电梯操作功能
     */
    void open();

    void close();

    void run();

    void stop();
}
