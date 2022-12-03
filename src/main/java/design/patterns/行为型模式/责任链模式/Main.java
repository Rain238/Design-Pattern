package design.patterns.行为型模式.责任链模式;

public class Main {
    public static void main(String[] args) {
        //创建请假条对象
        LeaveRequest leave = new LeaveRequest("小明", 4, "感冒");
        //创建各级领导
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();
        //设置处理者链
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);
        //提交
        groupLeader.submit(leave);
    }
}
