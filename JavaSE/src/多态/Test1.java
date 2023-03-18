package 多态;

/**
 *     多态的成员访问：
 *         1.成员变量：编译看左边，执行看左边；
 *         2.成员方法：编译看左边，执行看右边，右边没有去继承左边父类；
 *         3.构造函数默认右super()，会访问父类的无参构造函数
 *
 *
 * */

public class Test1 {
    public static void main(String[] args) {
        // 左边           右边
        Father father = new Child();
        father.show();
    }
}

class Father {
    int a = 10;

    public void show() {
        System.out.println("父类的show");
    }
}

class Child extends Father {
    int a = 20;
    int b = 0;

    @Override
    public void show() {
        System.out.println("子类的show");
    }
}


