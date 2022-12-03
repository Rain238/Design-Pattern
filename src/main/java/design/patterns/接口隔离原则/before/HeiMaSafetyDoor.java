package design.patterns.接口隔离原则.before;

public class HeiMaSafetyDoor implements SafetyDoor {
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
