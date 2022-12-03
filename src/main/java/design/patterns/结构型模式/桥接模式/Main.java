package design.patterns.结构型模式.桥接模式;

public class Main {
    public static void main(String[] args) {
        //多态创建操作系统
        OpratingSystem ops = new Mac(new RmvbFile());
        ops.play("你的名字");
        Windows ops1 = new Windows(new AviFile());
        ops1.play("天气之子");
    }
}
