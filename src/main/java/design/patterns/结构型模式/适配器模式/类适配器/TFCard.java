package design.patterns.结构型模式.适配器模式.类适配器;

/**
 * @author LightRain
 * 适配者类的接口
 */
public interface TFCard {
    /**
     * 从TF卡中读取数据
     *
     * @return String
     */
    String readTf();

    /**
     * 往TF卡中写数据
     *
     * @param msg 数据
     */
    void writeTf(String msg);
}
