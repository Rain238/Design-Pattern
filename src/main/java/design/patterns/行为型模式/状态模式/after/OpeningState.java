package design.patterns.行为型模式.状态模式.after;

/**
 * @author LightRain
 * 电梯开启状态类
 */
public class OpeningState extends LifeState {
    @Override
    public void open() {
        System.out.println("电梯开启...");
    }

    @Override
    public void close() {
        //修改状态
        super.context.setLifeState(Context.CLOSEING_STATE);
        //调用当前状态中的Context中的close方法
        super.context.close();
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
