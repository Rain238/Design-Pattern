package design.patterns.行为型模式.迭代器模式;

/**
 * @author LightRain
 * 抽象迭代器角色接口
 */
public interface StudentInterface {
    /**
     * 判断是否还有元素
     *
     * @return boolean
     */
    boolean nasNext();

    /**
     * 获取下一个元素
     *
     * @return Student
     */
    Student next();
}
