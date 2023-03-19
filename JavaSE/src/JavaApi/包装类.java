package JavaApi;

/**
 *  包装类：
 *
 *    byte      Byte
 *    short     Short
 *    int       Integer
 *    long      Long
 *    float     Float
 *    double  Double
 *    char     Character
 *    boolean  Boolean
 *
 *  自动装箱：基本数据类型自动转换为对应的包装类型
 *
 *  自动拆箱：包装类型自动转换为对应的基本类型
 *
 *  包装类注意事项
 *      包装类的初始化值为null；
 *      Java中除了float和double其他基本数据类型都有常量池；
 *          整数类型：[-128 127]值都在常量池
 *          字符类型：[0 127]都在常量池
 *          布尔类型：true false都在常量池
 *      在常量池的数据会进行共享，减少频繁创建
 *
 * */

public class 包装类 {
    public static void main(String[] args) {
        // baseGaiNian();
        // TypeTrans();

        Integer a = 10;
        Integer b = 10;

        // 虽然是对象，但是在常量池中共享
        System.out.println(a == b); // true

        Integer c = 128;
        Integer d = 128;
        // 不在常量池中
        System.out.println(c == d); // false

    }

    private static void TypeTrans() {
        // 基本数据类型转换（转成字符串）
        int a = 10;
        System.out.println(a + "");
        System.out.println(String.valueOf(a));
        System.out.println("-----------------------------------------------");

        // 字符串转基本数据类型
        String s = "123";
        System.out.println(Integer.parseInt(s));
        String s1 = "123.89";
        System.out.println(Float.parseFloat(s1));
        System.out.println(Double.parseDouble(s1));
        /**
         *  包装类型除了Character之外，都存在一个静态方法：parseXxxx
         * */}

    private static void baseGaiNian() {
        // 相当于 Integer.valueOf(10);完成装箱
        Integer a = 10; // 装箱
        // 相当于 a.intValue();完成拆箱
        int b = a; // 拆箱
    }
}
