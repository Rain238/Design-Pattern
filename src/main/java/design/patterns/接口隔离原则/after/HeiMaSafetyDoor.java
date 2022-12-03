package design.patterns.接口隔离原则.after;

public class HeiMaSafetyDoor implements AntiTheft, Waterproof, FirePrevention {
    @Override
    public void firePrevention() {
        System.out.println("防火");
    }

    @Override
    public void waterproof() {
        System.out.println("防水");
    }

    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }
}
