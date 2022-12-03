package design.patterns.结构型模式.适配器模式.接口适配器;

public class Main {
    public static void main(String[] args) {
        ComputerImpl c = new ComputerImpl();
        String cpu = c.cpu();
        System.out.println(cpu);
    }
}
