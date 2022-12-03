package design.patterns.迪米特原则;

/**
 * 媒体类
 */
public class Company {
    private String name;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
