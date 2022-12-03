package design.patterns.结构型模式.装饰者模式;

public class Main {
    public static void main(String[] args) {
        //点一份炒粉
        FriedRice friedRice = new FriedRice();
        System.out.println(friedRice.getDesc()+": "+friedRice.cost()+"元");
        System.out.println("===================");
        Egg egg = new Egg(friedRice);
        System.out.println(egg.getDesc()+": "+egg.cost()+"元");

        System.out.println("方式二顶层抽象类接收");
        FastFood food = new FriedNoodles();
        System.out.println(food.getDesc()+": "+food.cost()+"元");
        food = new Egg(food);
        System.out.println(food.getDesc()+": "+food.cost()+"元");
    }
}
