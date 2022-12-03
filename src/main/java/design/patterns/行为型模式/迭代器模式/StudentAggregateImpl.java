package design.patterns.行为型模式.迭代器模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LightRain
 * 具体聚合角色类
 */
public class StudentAggregateImpl implements StudentAggregate {
    private final List<Student> list = new ArrayList<>();

    /**
     * 添加元素
     *
     * @param student Student
     */
    @Override
    public void addStudent(Student student) {
        list.add(student);
    }

    /**
     * 删除元素
     *
     * @param student Student
     */
    @Override
    public void removeStudent(Student student) {
        list.remove(student);
    }

    /**
     * 获取迭代器对象
     *
     * @return StudentInterface
     */
    @Override
    public StudentInterface getStudentInterface() {
        return new StudentInterfaceImpl(list);
    }
}
