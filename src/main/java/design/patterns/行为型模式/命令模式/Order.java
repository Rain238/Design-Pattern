package design.patterns.行为型模式.命令模式;

import java.util.HashMap;
import java.util.Map;

/**
 * @author LightRain
 * 订单类
 */
public class Order {
    /**
     * 餐桌号码
     */
    private int diningTable;

    private Map<String, Integer> foodDir = new HashMap<>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDir() {
        return foodDir;
    }

    public void setFood(String name, int num) {
        foodDir.put(name, num);
    }
}
