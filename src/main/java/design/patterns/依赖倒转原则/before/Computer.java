package design.patterns.依赖倒转原则.before;

public class Computer {
    private XiJieHardDisk hardDisk;
    private InterCPU cpu;
    private KingstonMemory memory;

    public XiJieHardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(XiJieHardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public InterCPU getCpu() {
        return cpu;
    }

    public void setCpu(InterCPU cpu) {
        this.cpu = cpu;
    }

    public KingstonMemory getMemory() {
        return memory;
    }

    public void setMemory(KingstonMemory memory) {
        this.memory = memory;
    }
    public void run(){
        System.out.println("运行电脑");
        String data = hardDisk.get();
        System.out.println(data);
        cpu.run();
        memory.save();
    }
}
