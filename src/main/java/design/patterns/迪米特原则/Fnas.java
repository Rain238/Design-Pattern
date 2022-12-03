package design.patterns.迪米特原则;

/**
 * 粉丝类
 */
public class Fnas {
    private String name;

    public Fnas(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
