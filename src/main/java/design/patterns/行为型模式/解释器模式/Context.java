package design.patterns.行为型模式.解释器模式;

import java.util.HashMap;
import java.util.Map;

/**
 * 环境角色类
 */
public class Context {
    /**
     * 定义一个Map集合，用来储存变量以及对应的值
     */
    private Map<Variable, Integer> map = new HashMap<>();

    /**
     * 添加变量
     */
    public void assign(Variable var, Integer value) {
        map.put(var, value);
    }

    /**
     * 根据变量获取对应的值
     */
    public int getValue(Variable var) {
        return map.get(var);
    }
}
