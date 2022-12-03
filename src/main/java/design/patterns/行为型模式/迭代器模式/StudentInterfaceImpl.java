package design.patterns.行为型模式.迭代器模式;

import java.util.List;

/**
 * @author LightRain
 * 具体迭代器角色类
 */
public class StudentInterfaceImpl implements StudentInterface {
    /**
     * 聚合对象
     */
    private List<Student> list;
    /**
     * 记录遍历元素位置
     */
    private int position = 0;

    public StudentInterfaceImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean nasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        //从集合中获取指定位置的元素
        Student currentStudent = list.get(position);
        position++;
        return currentStudent;
    }
}
