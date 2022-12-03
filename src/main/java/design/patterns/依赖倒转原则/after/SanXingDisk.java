package design.patterns.依赖倒转原则.after;

public class SanXingDisk implements HardDisk {
    @Override
    public void save(String data) {
        System.out.println("使用三星硬盘储存数据: " + data);
    }

    @Override
    public String get() {
        return "三星";
    }
}
