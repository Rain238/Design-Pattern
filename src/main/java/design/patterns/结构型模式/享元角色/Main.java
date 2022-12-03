package design.patterns.结构型模式.享元角色;

public class Main {
    public static void main(String[] args) {
        AbstractBox box1 =  BoxFactory.getInstance().getShape("I");
        box1.display("红色");
        AbstractBox box2 =  BoxFactory.getInstance().getShape("L");
        box2.display("绿色");
        AbstractBox box3 =  BoxFactory.getInstance().getShape("O");
        box3.display("蓝色");
        AbstractBox box4 =  BoxFactory.getInstance().getShape("O");
        box4.display("紫色");
        System.out.println(box3==box4);
    }
}
