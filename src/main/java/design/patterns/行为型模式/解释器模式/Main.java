package design.patterns.行为型模式.解释器模式;

public class Main {
    public static void main(String[] args) {
        //创建环境
        Context context = new Context();
        //创建多个变量
        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");
        context.assign(a, 1);
        context.assign(b, 2);
        context.assign(c, 3);
        context.assign(d, 4);
        //获取抽象语法数
        AbstractExpression expression = new Minus(a, new Plus(new Minus(b, c), d));
        //解释
        int interpret = expression.interpret(context);
        System.out.println(expression + "=" + interpret);
    }
}
