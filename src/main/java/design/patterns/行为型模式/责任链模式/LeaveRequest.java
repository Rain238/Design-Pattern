package design.patterns.行为型模式.责任链模式;

/**
 * @author LightRain
 * 请假条类
 */
public class LeaveRequest {
    /**
     * 姓名
     */
    private String name;
    /**
     * 天数
     */
    private int num;
    /**
     * 内容
     */
    private String content;

    public LeaveRequest(String name, int num, String content) {
        this.name = name;
        this.num = num;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public String getContent() {
        return content;
    }
}
