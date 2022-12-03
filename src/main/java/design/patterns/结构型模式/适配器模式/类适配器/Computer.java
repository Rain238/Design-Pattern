package design.patterns.结构型模式.适配器模式.类适配器;

/**
 * @author LightRain
 * 计算机类
 */
public class Computer {
    /**
     * 读取SD卡数据
     * @param card SD卡接口
     * @return String
     */
    public String readSD(SDCard card) {
        if (card == null) {
            throw new NullPointerException("sd card is not null");
        }
        return card.readSD();
    }
}
