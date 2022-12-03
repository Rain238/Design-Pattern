package design.patterns.依赖倒转原则.after;

public class Main {
    public static void main(String[] args) {
        //创建组件
        HardDisk disk = new XiJieHardDisk();
        CPU cpu = new InterCpu();
        Memory memory = new KingstonMemory();
        //创建电脑
        Computer computer = new Computer();
        computer.setDisk(disk);
        computer.setCpu(cpu);
        computer.setMemory(memory);
        computer.run();
    }
}
