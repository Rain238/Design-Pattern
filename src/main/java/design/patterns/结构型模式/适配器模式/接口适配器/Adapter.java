package design.patterns.结构型模式.适配器模式.接口适配器;

public abstract class Adapter implements Computer{
    @Override
    public String cpu() {
        return null;
    }

    @Override
    public void network() {

    }

    @Override
    public void disk() {

    }

    @Override
    public void memory() {

    }
}
