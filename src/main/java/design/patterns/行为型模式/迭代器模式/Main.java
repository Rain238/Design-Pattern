package design.patterns.行为型模式.迭代器模式;

public class Main {
    public static void main(String[] args) {
        //创建聚合对象
        StudentAggregateImpl aggregate = new StudentAggregateImpl();
        //添加元素
        aggregate.addStudent(new Student("张三", "001"));
        aggregate.addStudent(new Student("李四", "002"));
        //遍历聚合对象
        //1. 获取迭代器对象
        StudentInterface anInterface = aggregate.getStudentInterface();
        //2. 遍历
        while (anInterface.nasNext()) {
            //3. 获取元素
            Student student = anInterface.next();
            System.out.println(student.toString());
        }
    }
}
