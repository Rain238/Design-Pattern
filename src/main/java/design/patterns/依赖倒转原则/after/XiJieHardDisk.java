package design.patterns.依赖倒转原则.after;

public class XiJieHardDisk implements HardDisk {
    @Override
    public void save(String data) {
        System.out.println("使用希捷硬盘存储数据为： " + data);
    }

    @Override
    public String get() {
        return "希捷";
    }
}
