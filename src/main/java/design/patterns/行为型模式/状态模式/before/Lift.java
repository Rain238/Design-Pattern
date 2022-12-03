package design.patterns.行为型模式.状态模式.before;

public class Lift implements ILift {
    /**
     * 记录电梯状态
     */
    private int state;

    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {
        switch (state) {
            case OPENING_STATE -> {
            }
            case CLOSED_STATE -> {
                System.out.println("电梯打开了");
                //设置当前电梯状态
                setState(OPENING_STATE);
            }
            case STOPPED_STATE -> {
                System.out.println("电梯打开了");
                //设置当前电梯状态
                setState(OPENING_STATE);
            }
            case RUNNING_STATE -> {
            }
        }
    }

    @Override
    public void close() {
        switch (state) {
            case OPENING_STATE -> {
                System.out.println("电梯关门了...");
                //关门之后就是关闭状态
                setState(CLOSED_STATE);
            }
            case CLOSED_STATE -> {
                //do nothing 已经是关门状态,不能关门
            }
            case STOPPED_STATE -> {
                //do nothing 运行时电梯是关着的,不能关门
            }
            case RUNNING_STATE -> {
                //do nothing 停止时电梯也是关着的,不能关门
            }
        }
    }

    @Override
    public void run() {
        switch (state) {
            case OPENING_STATE -> {
                //do nothing 电梯不能开着门就走
            }
            case CLOSED_STATE -> {
                //门关了可以运行了
                System.out.println("电梯开始运行...");
                //修改成运行状态
                setState(RUNNING_STATE);
            }
            case STOPPED_STATE -> {
                System.out.println("电梯开始运行了...");
                //修改成运行状态
                setState(RUNNING_STATE);
            }
            case RUNNING_STATE -> {
                //do nothing 已经是运行状态了
            }
        }
    }

    @Override
    public void stop() {
        switch (state) {
            case OPENING_STATE -> {
                //do nothing 开门的电梯已经是是停止的了(正常情况下)
            }
            case CLOSED_STATE -> {
                //关门时才可以停止
                System.out.println("电梯停止了...");
                //修改成运行状态
                setState(STOPPED_STATE);
            }
            case STOPPED_STATE -> {
            }
            case RUNNING_STATE -> {
                //运行时可以停止
                System.out.println("电梯停止了...");
                //修改成运行状态
                setState(STOPPED_STATE);
            }
        }
    }
}
