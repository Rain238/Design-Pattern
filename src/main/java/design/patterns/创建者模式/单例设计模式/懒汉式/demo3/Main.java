package design.patterns.创建者模式.单例设计模式.懒汉式.demo3;


public class Main {
    public static void main(String[] args) {
        /**
         * 判断两个对象是否同一个
         */
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
    }
}
