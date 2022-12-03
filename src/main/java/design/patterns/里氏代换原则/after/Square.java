package design.patterns.里氏代换原则.after;

/**
 * 正方形类
 */
public class Square implements Quadrilateral{
    private double size;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public double getLength() {
        return size;
    }

    @Override
    public double getWidth() {
        return size;
    }
}
