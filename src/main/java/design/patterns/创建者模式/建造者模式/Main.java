package design.patterns.创建者模式.建造者模式;

public class Main {
    public static void main(String[] args) {
        //创建指挥者                            创建膜拜单车
        Director director = new Director(new MobikeBuilder());
        //让指挥者,指挥自行车组装
        Bike bike = director.cunstruct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}
