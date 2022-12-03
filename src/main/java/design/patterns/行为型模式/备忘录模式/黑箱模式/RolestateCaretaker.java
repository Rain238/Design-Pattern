package design.patterns.行为型模式.备忘录模式.黑箱模式;

/**
 * 备忘录管理对象，黑箱模式，面向接口
 */
public class RolestateCaretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
