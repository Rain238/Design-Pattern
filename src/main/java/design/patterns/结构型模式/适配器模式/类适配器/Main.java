package design.patterns.结构型模式.适配器模式.类适配器;

public class Main {
    public static void main(String[] args) {
        //创建计算机对象
        Computer computer = new Computer();
        //从SD卡中读取数据
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);
        System.out.println("================================================================");
        //使用计算机读取TF卡数据
        //定义适配器类
        String msg1 = computer.readSD(new SDAdapterTF());
        System.out.println(msg1);
    }
}
