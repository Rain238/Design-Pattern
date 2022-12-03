package design.patterns.里氏代换原则.after;

public class Main {
    public static void main(String[] args) {
        //创建长方形
        design.patterns.里氏代换原则.after.Rectangle r = new design.patterns.里氏代换原则.after.Rectangle();
        r.setLength(10);
        r.setWidth(5);
        resize(r);
        pln(r);
        System.out.println("================================================================");
        //创建正方形
        Square s = new Square();
        s.setSize(10);
        pln(s);
    }
    /**
     * 扩宽方法
     */
    public static void resize(design.patterns.里氏代换原则.after.Rectangle rectangle) {
        //判断宽如果比长小则进行扩宽操作
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    //打印长和宽
    public static void pln(Quadrilateral quadrilateral) {
        System.out.println(quadrilateral.getLength());
        System.out.println(quadrilateral.getWidth());
    }
}
