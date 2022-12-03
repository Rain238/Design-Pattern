package design.patterns.行为型模式.状态模式.after;

public class Main {
    public static void main(String[] args) {
        //创建电梯对象
        Context context = new Context();
        //设置电梯状态
        context.setLifeState(new RuningState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
