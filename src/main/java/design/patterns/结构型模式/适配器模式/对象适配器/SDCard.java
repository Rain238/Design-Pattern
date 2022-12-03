package design.patterns.结构型模式.适配器模式.对象适配器;

/**
 * @author LightRain
 * 目标接口
 */
public interface SDCard {
    /**
     * 读取SD卡数据
     *
     * @return String
     */
    String readSD();

    /**
     * 写入SD卡数据
     *
     * @param msg 数据
     */
    void writeSD(String msg);

}
