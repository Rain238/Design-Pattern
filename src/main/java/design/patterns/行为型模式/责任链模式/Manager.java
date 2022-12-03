package design.patterns.行为型模式.责任链模式;

/**
 * @author LightRain
 * 部门经理类（具体的处理者）
 */
public class Manager extends Handler {
    public Manager() {
        super(NUM_ONE, NUM_THREE);
    }

    @Override
    protected void handlerLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假 " + leave.getNum() + "天" + leave.getContent() + "。");
        System.out.println("部门经理：通过");
    }
}
