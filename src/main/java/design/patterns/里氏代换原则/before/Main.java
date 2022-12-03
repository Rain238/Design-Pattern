package design.patterns.里氏代换原则.before;

public class Main {
    public static void main(String[] args) {
        //创建长方形
        Rectangle r = new Rectangle();
        r.setLenght(10.0);
        r.setWidth(5.0);
        resize(r);
        pln(r);
        System.out.println("====================");
        //创建正方形
        Square s = new Square();
        s.setLenght(5.0);
        s.setWidth(5.0);
        resize(s);
        pln(s);
    }

    /**
     * 扩宽方法
     */
    public static void resize(Rectangle rectangle) {
        //判断宽如果比长小则进行扩宽操作
        while (rectangle.getWidth() <= rectangle.getLenght()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    //打印长和宽
    public static void pln(Rectangle rectangle) {
        System.out.println(rectangle.getLenght());
        System.out.println(rectangle.getWidth());
    }
}
