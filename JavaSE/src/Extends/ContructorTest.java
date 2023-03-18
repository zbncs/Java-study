package Extends;

public class ContructorTest {
    public static void main(String[] args) {
        Zi z = new Zi();
    }
}

class Fu {
    public Fu() {
        System.out.println("父类空参构造函数");
    }
    public Fu(int n) {
        this();
        System.out.println("父类有参构造函数");
    }
}

class Zi extends Fu {
    public Zi() {
        this(1);
        System.out.println("子类空参构造函数");
    }
    public Zi(int n) {
        super(1);
        System.out.println("子类有参构造函数");
    }
}
