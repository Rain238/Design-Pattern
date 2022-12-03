package design.patterns.行为型模式.访问者模式;

public class Main {
    public static void main(String[] args) {
        //创建Home对象
        Home home = new Home();
        //养只猫和狗
        home.add(new Cat());
        home.add(new Dog());
        //创建主人对象
        Owner owner = new Owner();
        //主人喂食
        home.action(owner);
        //创建访问者
        Someone someone = new Someone();
        //访问者喂食
        home.action(someone);
    }
}
