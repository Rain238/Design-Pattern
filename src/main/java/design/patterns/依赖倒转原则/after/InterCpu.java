package design.patterns.依赖倒转原则.after;

public class InterCpu implements CPU{
    @Override
    public void run() {
        System.out.println("使用InterCPU");
    }
}
