package design.patterns.创建者模式.单例设计模式.枚举式;

public class Main {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance==instance2);
    }
}
