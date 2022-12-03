package design.patterns.里氏代换原则.before;

/**
 * 正方形类
 */
public class Square extends Rectangle {
    @Override
    public void setLenght(Double lenght) {
        super.setLenght(lenght);
        super.setWidth(lenght);
    }

    @Override
    public void setWidth(Double width) {
        super.setLenght(width);
        super.setWidth(width);
    }
}
