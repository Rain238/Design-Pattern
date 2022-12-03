package design.patterns.行为型模式.状态模式.before;

public class Mian {
    public static void main(String[] args) {
        //创建电梯对象
        Lift i = new Lift();
        //设置电梯状态
        i.setState(ILift.STOPPED_STATE);
        //开门
        i.open();
        //关门
        i.close();
        //运行
        i.run();
        //停止
        i.stop();
    }
}
