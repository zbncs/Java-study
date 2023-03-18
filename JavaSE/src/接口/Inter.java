package 接口;

public interface Inter {
    public abstract void show();
    public abstract void method();
}

interface Inter1 {
    public abstract void show();
    public abstract void method();
}

class InterImpl implements Inter, Inter1 {

    @Override
    public void show() {

    }

    @Override
    public void method() {

    }
}

abstract class InterImpl1 implements Inter {

}
