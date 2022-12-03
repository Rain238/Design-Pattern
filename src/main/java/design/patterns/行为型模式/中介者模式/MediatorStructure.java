package design.patterns.行为型模式.中介者模式;

/**
 * @author LightRain
 * 具体中介者角色类
 */
public class MediatorStructure extends Mediator {
    /**
     * 聚合房主
     */
    private HouseOwner houseOwner;
    /**
     * 聚合租房者
     */
    private Tenant tenant;

    @Override
    public void constact(String message, Person person) {
        if (person == houseOwner) {
            tenant.getMessage(message);
        } else {
            houseOwner.getMessage(message);

        }
    }

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }
}
