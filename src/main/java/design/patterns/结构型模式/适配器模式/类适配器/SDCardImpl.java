package design.patterns.结构型模式.适配器模式.类适配器;

/**
 * @author LightRain
 * 具体的SD卡
 */
public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        String msg = "SDCard read msg: Hello world!";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard write msg: " + msg);
    }
}
