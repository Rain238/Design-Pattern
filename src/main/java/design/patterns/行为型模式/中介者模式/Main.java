package design.patterns.行为型模式.中介者模式;

/**
 * @author LightRain
 */
public class Main {
    public static void main(String[] args) {
        //创建中介者对象
        MediatorStructure mediator = new MediatorStructure();
        //创建租房者对象
        Tenant tenant = new Tenant("李四",mediator);
        //创建房主对象
        HouseOwner houseOwner = new HouseOwner("张三",mediator);
        //中介者要知道具体房主和租房者信息
        mediator.setTenant(tenant);
        mediator.setHouseOwner(houseOwner);
        tenant.constact("我要租三室的房子！");
        houseOwner.constact("我有三室的房子要租吗？");
    }
}
