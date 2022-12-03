package design.patterns.行为型模式.解释器模式;

/**
 * 抽象表达式类
 */
public abstract class AbstractExpression {
    /**
     * 解释器抽象方法
     * @param context 环境
     * @return int
     */
    public abstract int interpret(Context context);
}
