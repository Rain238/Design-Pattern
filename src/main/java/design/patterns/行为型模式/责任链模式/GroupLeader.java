package design.patterns.行为型模式.责任链模式;

/**
 * @author LightRain
 * 小组长类（具体的处理者）
 */
public class GroupLeader extends Handler {
    public GroupLeader() {
        super(0, NUM_ONE);
    }

    @Override
    protected void handlerLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假 " + leave.getNum() + "天" + leave.getContent() + "。");
        System.out.println("小组长审批：通过");
    }
}
