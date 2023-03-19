package JavaApi;

import java.math.BigInteger;

/**
 *    BigInteger：
 *          java.math.BigInteger类是一个引用数据类型，可以用来对一些大整数做运算。
 *          当超出基本数据类型数据范围的整数运算时就可以使用BigInteger了。
 */

public class BigIntegerCls {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("2145687903");

        // add
        BigInteger add = bigInteger.add(new BigInteger("100"));
        System.out.println(add);

        // subtract
        BigInteger subtract = bigInteger.subtract(new BigInteger("200"));
        System.out.println(subtract);

        // multiply
        BigInteger multiply = bigInteger.multiply(new BigInteger("10"));
        System.out.println(multiply);

        // divide
        BigInteger divide = bigInteger.divide(new BigInteger("10"));
        System.out.println(divide);

    }
}
