package 设计模式.单例;

/**
 *  懒汉单例设计模式就是调用getInstance()方法时对象才被创建
 *  也就是说先不急着实例化出对象，等要用的时候才实例化出对象。不着急，故称为“懒汉模式”。
 *
 * */
public class 懒汉单例 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            King1 king1 = King1.getInstance();
            System.out.println(king1);
        }
    }
}

class King1 {
    private King1() {}

    private static King1 king1;

    public static synchronized King1 getInstance() {
        if (king1 == null) {
            king1 =  new King1();
        }

        return king1;
    }
}
