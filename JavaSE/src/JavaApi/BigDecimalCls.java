package JavaApi;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *  BigDecimal:
 *      java.math.BigDecimal可以对大浮点数进行运算，保证运算的准确性。
 *      float，double 他们在存储及运算的时候，会导致数据精度的丢失。如果要保证运算的准确性，就需要使用BigDecimal。
 *
 * */

public class BigDecimalCls {
    public static void main(String[] args) {
        // 精确计算，从参数必须是字符串
        BigDecimal bigDecimal = new BigDecimal("0.1");
        BigDecimal bigDecimal1 = new BigDecimal("0.2");

        // add
        BigDecimal add = bigDecimal.add(bigDecimal1);
        System.out.println(add);

        //
        BigDecimal a = new BigDecimal("10");
        BigDecimal b = new BigDecimal("3");

        System.out.println(a.divide(b, 3, RoundingMode.HALF_UP));
        System.out.println(a.divide(b, 3, RoundingMode.HALF_DOWN));
        System.out.println(a.divide(b, 3, RoundingMode.HALF_EVEN));

        System.out.println(a.divide(b, 3, RoundingMode.UP));
        System.out.println(a.divide(b, 3, RoundingMode.DOWN));
        System.out.println(a.divide(b, 3, RoundingMode.FLOOR));
        System.out.println(a.divide(b, 3, RoundingMode.CEILING));
    }
}
