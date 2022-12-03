package design.patterns.行为型模式.命令模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LightRain
 * 服务员类
 */
public class Waitor {
    /**
     * 持有多个命令对象
     */
    private List<Command> commands = new ArrayList<>();

    public void setCommand(Command cmd) {
        commands.add(cmd);
    }

    /**
     * 发起命令功能
     */
    public void orderUp() {
        System.out.println("服务员：来新订单了");
        for (Command command : commands) {
            if (commands != null) {
                //调用命令方法
                command.execute();
            }
        }
    }
}
