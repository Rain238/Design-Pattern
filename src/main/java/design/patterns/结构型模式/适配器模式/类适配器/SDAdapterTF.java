package design.patterns.结构型模式.适配器模式.类适配器;

/**
 * @author 适配器类
 */
public class SDAdapterTF extends TFCardImpl implements SDCard {

    @Override
    public String readSD() {
        System.out.println("adapter read tf card\n");
        return readTf();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        writeTf(msg);
    }
}
