package Lambda表达式;

import java.math.BigInteger;

/**
 *  ( 形式参数 )  -> { 代码块 }
 *
 * Lambda表达式的使用前提:
 *      有一个接口
 *      接口中有且仅有一个抽象方法需要被重写
 *
 * */
public class Lambda练习 {
    public static void main(String[] args) {
        useShowHandler(() -> {
            System.out.println("useShowHandler方法lambda");
        });

        useStringHandler((String s) -> {
            System.out.println(s);
        });

        useRandomNumHandler(() -> {
            return 1;
        });

        useCalculator((int a) -> {
            return a + 1;
        });
    }

    public static void useShowHandler(ShowHandler showHandler) {
        showHandler.show();
    }

    public static void useStringHandler(StringHandler showHandler) {
        showHandler.printMessage("haha");
    }

    public static void useRandomNumHandler(RandomNumHandler randomNumHandler) {
        int a = randomNumHandler.getNumber();
        System.out.println(a);
    }

    public static void useCalculator(Calculator calculator) {
        int a = calculator.calc(9);
        System.out.println(a);
    }
}

@FunctionalInterface
interface ShowHandler {
    public abstract void show();
}

@FunctionalInterface
interface StringHandler {
    public abstract void printMessage(String s);
}

@FunctionalInterface
interface RandomNumHandler {
    public abstract int getNumber();
}

@FunctionalInterface
interface Calculator {
    public abstract int calc(int a);
}




