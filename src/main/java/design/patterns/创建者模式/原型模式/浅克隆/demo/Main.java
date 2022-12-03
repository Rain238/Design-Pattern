package design.patterns.创建者模式.原型模式.浅克隆.demo;

/**
 * 使用场景：
 * 对象的创建非常复杂，可以使用原型模式快捷的创建对象。
 * 性能和安全要求毕竟高。
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        //创建原型对象
        Citation citation = new Citation();
        //克隆奖状对象
        Citation citation1 = citation.clone();
        citation.setName("风清扬");
        citation1.setName("林青霞");
        citation.show();
        citation1.show();
    }
}
