package design.patterns.行为型模式.备忘录模式.白箱模式;

/**
 * 备忘录管理对象
 */
public class RolestateCaretaker {
    /**
     * 声明备忘录角色
     */
    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}