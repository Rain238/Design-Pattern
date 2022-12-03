package design.patterns.结构型模式.适配器模式.对象适配器;

/**
 * @author LightRain
 * 适配者类
 */
public class TFCardImpl implements TFCard {
    @Override
    public String readTf() {
        String mag = "TFCard read msg: Hello world!";
        return mag;
    }

    @Override
    public void writeTf(String msg) {
        System.out.println("TFCard write msg: "+msg);
    }
}
