package design.patterns.结构型模式.适配器模式.对象适配器;

public class Main {
    public static void main(String[] args) {
        //创建计算机对象
        Computer computer = new Computer();
        //从SD卡中读取数据
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);
        System.out.println("================================================================");
        //使用该电脑读取TF卡中的数据
        //创建适配器对象
        SDAdapterTF sdAdapterTF = new SDAdapterTF(new TFCardImpl());
        String msg1 = computer.readSD(sdAdapterTF);
        System.out.println(msg1);
    }
}
