package JavaApi;

import java.util.Arrays;

/**
 *
 *
 * */

public class Stringcls {
    public static void main(String[] args) {
        String a = "1212";
        String b = "56789077";

        System.out.println(a.concat(b));
        System.out.println(a.contains("3"));
        System.out.println(a.endsWith("2"));
        System.out.println(a.startsWith("1"));
        System.out.println(a.indexOf("1"));
        System.out.println(a.indexOf("0"));
        System.out.println(a.lastIndexOf("2"));
        System.out.println(b.replace("5", "6"));
        System.out.println(Arrays.toString(b.split("")));
        System.out.println(b.substring(3));
        System.out.println(b.substring(3, 6)); // 不包括结束索引
        System.out.println(b.charAt(1));
        // ....
    }
}
