package design.patterns.依赖倒转原则.before;

/**
 * 硬盘类
 */
public class XiJieHardDisk {
    public void save(String data) {
        System.out.println("使用希捷硬盘存储数据为： " + data);
    }

    public String get() {
        System.out.println("使用希捷硬盘获取数据");
        return "数据";
    }
}
