package design.patterns.结构型模式.适配器模式.对象适配器;

/**
 * @author 适配器类
 */
public class SDAdapterTF implements SDCard {
    /**
     * 声明TFCardImpl类
     */
    private TFCardImpl tfCard;

    public SDAdapterTF(TFCardImpl tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return tfCard.readTf();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        tfCard.writeTf(msg);
    }
}
