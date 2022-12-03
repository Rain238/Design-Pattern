package design.patterns.行为型模式.模板方法模式;

/**
 * @author LightRain
 * 抽象类（定义模板方法和基本方法）
 */
public abstract class AsbstractClass {
    /**
     * 模板方法定义
     */
    public void cookProcess() {
        pourOil();
        heatOil();
        pourVegetable();
        pourSauce();
        fry();
    }

    public void pourOil() {
        System.out.println("倒油");
    }

    public void heatOil() {
        System.out.println("热油");
    }

    /**
     * 倒蔬菜
     */
    public abstract void pourVegetable();

    /**
     * 倒调料品
     */
    public abstract void pourSauce();

    public void fry() {
        System.out.println("翻炒");
    }
}
