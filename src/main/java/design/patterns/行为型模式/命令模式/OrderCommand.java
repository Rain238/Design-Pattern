package design.patterns.行为型模式.命令模式;

import java.util.Map;
import java.util.Set;

/**
 * @author LightRain
 * 具体命令类
 */
public class OrderCommand implements Command {
    /**
     * 定义厨师类
     */
    private SeniorChef seniorChef;
    /**
     * 定义订单类
     */
    private Order order;

    public OrderCommand(SeniorChef seniorChef, Order order) {
        this.seniorChef = seniorChef;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getDiningTable() + "餐桌的订单");
        Map<String, Integer> foodDir = order.getFoodDir();
        //遍历Map
        Set<String> keySet = foodDir.keySet();
        for (String foodName : keySet) {
            seniorChef.makeFood(foodName, foodDir.get(foodName));
        }
        System.out.println(order.getDiningTable() + "餐桌的订单已处理完毕！！！");
    }
}
