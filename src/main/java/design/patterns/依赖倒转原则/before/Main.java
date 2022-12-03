package design.patterns.依赖倒转原则.before;

public class Main {
    public static void main(String[] args) {
        //创建组件
        XiJieHardDisk x = new XiJieHardDisk();
        InterCPU c = new InterCPU();
        KingstonMemory memory = new KingstonMemory();
        //创建电脑
        Computer computer = new Computer();
        //组装
        computer.setHardDisk(x);
        computer.setCpu(c);
        computer.setMemory(memory);
        //运行
        computer.run();
    }
}
