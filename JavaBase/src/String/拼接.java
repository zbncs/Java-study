package String;

import java.util.StringJoiner;

public class 拼接 {
    public static void main(String[] args) {
        // 1.加号拼接：原理就是StringBuilder.append方法
        String str = "abc";
        String s = str + "def";
        System.out.println(s);
        // 2.concat 原理：new String()
        String s1 = str.concat("def");
        System.out.println(s1);
        // 3.StringBuffer.append (线程安全) 和 StringBuilder.append
        // 都创建可以改变的字符串
        StringBuffer s2 = new StringBuffer(str).append("def");
        System.out.println(s2);
        StringBuilder s3 = new StringBuilder(str).append("def");
        System.out.println(s3);

        // 比较耗时：StringBuilder < StringBuffer < concat < +
        // 在循环中拼接字符串使用StringBuilder，+号是通过new StringBuilder实现的，每循环一次都new，浪费内存和影响性能

        // 4.StringJoiner(分隔符, 前缀, 后缀)
        StringJoiner joiner = new StringJoiner(":");
        StringJoiner stringJoiner = joiner.add("2023").add("04").add("02");
        System.out.println(stringJoiner); // 2023:04:02

        StringJoiner stringJoiner1 = new StringJoiner(":", "(", ")");
        StringJoiner stringJoiner2 = stringJoiner1.add("2023").add("04").add("02");
        System.out.println(stringJoiner2); // (2023:04:02)

    }
}
