package design.patterns.创建者模式.原型模式.深克隆;

import java.io.*;

/**
 * @author LightRain
 * 使用序列化实现深克隆
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        //创建原型对象
        Citation citation = new Citation();
        //创建学生对象
        Student stu = new Student();
        stu.setName("张三");
        citation.setStu(stu);
        //创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\深克隆\\t.txt"));
        //将原型对象写入到文件内
        oos.writeObject(citation);
        //释放资源
        oos.close();
        //读取文件 创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\深克隆\\t.txt"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("E:\\深克隆\\t.txt"));
        //读取对象
        Citation citation1 = (Citation) ois.readObject();
        Citation citation2 = (Citation) ois2.readObject();
        //释放资源
        ois.close();
        citation1.getStu().setName("李四");
        citation2.getStu().setName("王五");
        citation2.show();
        citation1.show();
        citation.show();
    }
}
