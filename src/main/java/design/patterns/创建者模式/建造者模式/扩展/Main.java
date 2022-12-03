package design.patterns.创建者模式.建造者模式.扩展;

public class Main {
    public static void main(String[] args) {
        /*
          使用局部建造者实现链式编程
         */
        Phone build = new Phone.Builder()
                .cpu("1")
                .screen("2")
                .memory("3")
                .mainboard("4")
                .build();
        System.out.println(build.toString());
    }
}
