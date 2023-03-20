package Lambda表达式;

/**
 * @FunctionalInterface: 函数式接口注解
 *
 *函数式接口: 只有一个抽象方法需要重写的接口。
 * 函数式接口是允许有其他的非抽象方法的存在例如静态方法，默认方法，私有方法。
 *
 * 只有一个抽象方法需要重写的接口是函数式接口是错误的！！！
 * Object类中的方法如果作为抽象方法，子类可以不用重写。
 *
 * */

public class 函数式接口 {
    public static void main(String[] args) {

    }
}

@FunctionalInterface
interface Swim {
    public abstract void show();
}

