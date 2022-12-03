package design.patterns.行为型模式.责任链模式;

/**
 * @author LightRain
 * 总经理类（具体的处理者）
 */
public class GeneralManager extends Handler {
    public GeneralManager() {
        super(NUM_THREE, NUM_SEVEN);
    }

    @Override
    protected void handlerLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假 " + leave.getNum() + "天" + leave.getContent() + "。");
        System.out.println("总经理：通过");
    }
}
