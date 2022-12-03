package design.patterns.接口隔离原则.after;

public class ChuanZhiSafetyDoor implements AntiTheft{
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }
}
