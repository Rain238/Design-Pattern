package design.patterns.结构型模式.代理模式.动态代理.JDK动态代理;

import java.util.HashSet;

/**
 * 定义规范
 */
public interface SellTickets {
    HashSet<String> sell();
}
