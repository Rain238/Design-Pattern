package design.patterns.迪米特原则;

public class Main {
    public static void main(String[] args) {
        //创建经纪人类
        Agent agent = new Agent();
        //创建明星
        Star star = new Star("林青霞");
        //创建粉丝
        Fnas fnas = new Fnas("风清扬");
        //创建媒体
        Company company = new Company("黑马传媒");
        agent.setStar(star);
        agent.setFnas(fnas);
        agent.setCompany(company);
        agent.meeting();
        agent.business();
    }
}
