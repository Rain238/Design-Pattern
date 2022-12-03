package design.patterns.依赖倒转原则.after;

public class Computer {
    private HardDisk disk;
    private CPU cpu;
    private Memory memory;

    public HardDisk getDisk() {
        return disk;
    }

    public void setDisk(HardDisk disk) {
        this.disk = disk;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void run() {
        System.out.println("运行电脑");
        System.out.println("开机读取数据：" + disk.get());
        cpu.run();
        memory.save();
    }
}
