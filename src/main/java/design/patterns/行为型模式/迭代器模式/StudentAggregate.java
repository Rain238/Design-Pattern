package design.patterns.行为型模式.迭代器模式;

/**
 * @author LightRain
 * 抽象聚合角色接口
 */
public interface StudentAggregate {
    /**
     * 添加学生功能
     *
     * @param student Student
     */
    void addStudent(Student student);

    /**
     * 删除学生功能
     *
     * @param student Student
     */
    void removeStudent(Student student);

    /**
     * 获取迭代器对象功能
     *
     * @return StudentInterface
     */
    StudentInterface getStudentInterface();
}
