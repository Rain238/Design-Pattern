package design.patterns.接口隔离原则.after;

public class Main {
    public static void main(String[] args) {
        ChuanZhiSafetyDoor c = new ChuanZhiSafetyDoor();
        c.antiTheft();

        HeiMaSafetyDoor h = new HeiMaSafetyDoor();
        h.antiTheft();
        h.firePrevention();
        h.waterproof();
    }
}
