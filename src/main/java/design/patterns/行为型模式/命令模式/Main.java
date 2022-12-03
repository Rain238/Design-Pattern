package design.patterns.行为型模式.命令模式;

public class Main {
    public static void main(String[] args) {
        //创建第一个订单对象
        Order order1 = new Order();
        order1.setDiningTable(1);
        order1.setFood("鱼香肉丝", 1);
        order1.setFood("可口可乐", 1);
        //创建第二个订单对象
        Order order2 = new Order();
        order2.setDiningTable(2);
        order2.setFood("蛋炒饭", 1);
        order2.setFood("雪碧", 1);
        //创建厨师对象
        SeniorChef receiver = new SeniorChef();
        //创建命令对象
        OrderCommand orderCommand1 = new OrderCommand(receiver, order1);
        OrderCommand orderCommand2 = new OrderCommand(receiver, order2);
        //创建服务员对象
        Waitor invoke = new Waitor();
        invoke.setCommand(orderCommand1);
        invoke.setCommand(orderCommand2);
        //执行命令
        invoke.orderUp();
    }
}
