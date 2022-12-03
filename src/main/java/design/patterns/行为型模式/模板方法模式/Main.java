package design.patterns.行为型模式.模板方法模式;

public class Main {
    public static void main(String[] args) {
        ConcreteClassBaoCai c = new ConcreteClassBaoCai();
        c.cookProcess();
        ConcreteClassCaiXin c2 = new ConcreteClassCaiXin();
        c2.cookProcess();
    }
}
