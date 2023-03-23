package 设计模式.多例设计模式;

import java.util.ArrayList;
import java.util.Random;

/**
 *  多例模式，是一种常用的设计模式之一。通过多例模式可以保证项目中，应用该模式的类有**固定数量的实例**。
 *  多例类要自我创建并管理自己的实例，还要向外界提供获取本类实例的方法。
 *
 *  实现步骤：
 *
 *  1.创建一个类,  将构造方法私有化，使其不能在类的外部通过new关键字实例化该类对象。
 *
 *  2.在类中定义该类被创建对象的总数量
 *
 * 	3.在类中定义存放类实例的list集合
 *
 * 	4.在类中提供静态代码块,在静态代码块中创建类的实例
 *
 * 	5.提供获取类实例的静态方法
 *
 * */

public class 多例 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Teacher instance = Teacher.getInstance();
            System.out.println(instance);
        }
    }
}

class Teacher {
    private Teacher() {
    }

    private static int count = 3;

    static ArrayList<Teacher> list = new ArrayList<>();

    static {
        for (int i = 0; i < count; i++) {
            list.add(new Teacher());
        }
    }

    public static Teacher getInstance() {
        int i = new Random().nextInt(count);
        return list.get(i);
    }

}

