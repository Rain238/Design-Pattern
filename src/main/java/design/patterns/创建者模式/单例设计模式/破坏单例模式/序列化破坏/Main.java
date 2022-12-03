package design.patterns.创建者模式.单例设计模式.破坏单例模式.序列化破坏;

import java.io.*;

/**
 * 通过序列化来实现破坏单例模式
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        writeObjectToFile();
        readObjectFromFile();
        readObjectFromFile();
    }

    //从文件读取数据(对象)
    public static void readObjectFromFile() throws IOException, ClassNotFoundException {
        //创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\Singleton.txt"));
        //读取对象
        Singleton instance = (Singleton) ois.readObject();
        //释放资源
        ois.close();
        System.out.println(instance);
    }

    //向文件中写数据(对象)
    public static void writeObjectToFile() throws IOException {
        //获取Singleton对象
        Singleton instance = Singleton.getInstance();
        //创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\Singleton.txt"));
        //写对象
        oos.writeObject(instance);
        //释放资源
        oos.close();
    }
}
