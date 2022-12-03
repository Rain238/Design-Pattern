package design.patterns.接口隔离原则.before;

public class Main {
    public static void main(String[] args) {
        HeiMaSafetyDoor heima = new HeiMaSafetyDoor();
        heima.antiTheft();
        heima.waterproof();
        heima.waterproof();
    }
}
