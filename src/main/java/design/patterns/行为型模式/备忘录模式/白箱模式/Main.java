package design.patterns.行为型模式.备忘录模式.白箱模式;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------------大战boss前-------------------------");
        //创建游戏角色对象
        GameRole gameRole = new GameRole();
        //初始化
        gameRole.initState();
        //展示状态
        gameRole.stateDisplay();
        //将游戏内部状态进行备份
        //创建管理者角色
        RolestateCaretaker rolestateCaretaker = new RolestateCaretaker();
        rolestateCaretaker.setRoleStateMemento(gameRole.saveState());
        System.out.println("-----------------------大战boss后-------------------------");
        //损耗
        gameRole.fight();
        gameRole.stateDisplay();
        System.out.println("-----------------------恢复之前的状态-----------------------");
        gameRole.recoverState(rolestateCaretaker.getRoleStateMemento());
        //展示状态
        gameRole.stateDisplay();
    }
}
