package design.patterns.迪米特原则;

/**
 * 经纪人类
 */
public class Agent {
    private Star star;
    private Fnas fnas;
    private Company company;

    public void setStar(Star star) {
        this.star = star;
    }

    public void setFnas(Fnas fnas) {
        this.fnas = fnas;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    //粉丝和明星见面
    public void meeting() {
        System.out.println(star.getName() + "和粉丝" + fnas.getName() + "见面了");
    }

    //明星和媒体洽谈
    public void business() {
        System.out.println(star.getName() + "和媒体" + company.getName() + "洽谈");
    }
}
