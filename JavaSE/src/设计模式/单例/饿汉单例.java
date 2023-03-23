package 设计模式.单例;

/**
 * 单例设计模式实现步骤：
 *
 * 1. 将构造方法私有化，使其不能在类的外部通过new关键字实例化该类对象。
 * 2. 在该类内部产生一个唯一的实例化对象，并且将其封装为private static 类型的成员变量。
 * 3. 定义一个静态方法返回这个唯一对象。
 *
 *
 *  饿汉单例设计模式就是使用类的时候已经将对象创建完毕(已经自己实例化完成了)
 *  不管以后会不会使用到该实例化对象，先创建了再说。很着急的样子，故被称为“饿汉模式”。
 *
 * */

public class 饿汉单例 {
    public static void main(String[] args) {
        King instance = King.getInstance();
        System.out.println(instance);
    }
}

class King {
    private King() {}

    private static final King KING = new King();

    public static King getInstance() {
        return KING;
    }
}
