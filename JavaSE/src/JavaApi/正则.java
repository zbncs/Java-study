package JavaApi;

import java.util.Arrays;

public class 正则 {
    public static void main(String[] args) {
       /**
        *  方括号用于指定字符：
        *
        * [abc] ：代表a或者b，或者c字符中的一个。
        * [^abc]：代表除a,b,c以外的任何字符。
        * [a-z] ：代表a-z的所有小写字符中的一个。
        * [A-Z] ：代表A-Z的所有大写字符中的一个。
        * [0-9] ：代表0-9之间的某一个数字字符。
        * [a-zA-Z0-9]：代表a-z或者A-Z或者0-9之间的任意一个字符。
        * [a-dm-p]：a 到 d 或 m 到 p之间的任意一个字符
        *
        * */
       // boolean  matches（正则表达式） :如果匹配正则表达式就返回true，否则返回false

        /**
         * 逻辑运算
         *  && 并且
         *  | 或
         * */
        // 要求字符串是除a、e、i、o、u外的其它小写字符开头，后跟ad
        System.out.println("as".matches("[[^aeiou]&&a-z]ad"));
        // 要求字符串是aeiou中的某个字符开头，后跟ad
        System.out.println("sdsd".matches("[aeiou]ad"));

        /**
         * 预定义字符（语法糖）
         *
         * "."  ： 匹配任何字符。
         * "\d"：任何数字[0-9]的简写；
         * "\D"：任何非数字[^0-9]的简写；
         * "\s" ： 空白字符：[ \t\n\x0B\f\r] 的简写
         * "\S" ： 非空白字符：[^\s] 的简写
         * "\w" ：单词字符：[a-zA-Z_0-9]的简写
         * "\W"：非单词字符：[^\w]
         * */
        // 验证str是否3位数字
        String str = "890";
        System.out.println(str.matches("\\d{3}"));
        //验证手机号：1开头，第二位：3/5/8，剩下9位都是0-9的数字 ）
        String str1 = "18796509853";
        System.out.println(str1.matches("1[358]\\d{9}"));

        /**
         *  数量词
         *
         *  X? : 0次或1次
         * X* : 0次到多次
         * X+ : 1次或多次
         *
         * X{n} : 恰好n次
         * X{n,} : 至少n次
         * X{n,m}: n到m次(n和m都是包含的)
         *
         * */
        // 验证qq号码：1).5--15位；2).全部是数字;3).第一位不是0。
        String s0 = "12986756690";
        System.out.println(s0.matches("[1-9]\\d{4,14}"));

        /**
         *  小括号分组
         *
         * */
        String s1 = "DG8FV-B9TKY-FRT9J-99899-XPQ4G";
        System.out.println(s1.matches("([0-9A-Z]{5}-){4}[0-9A-Z]"));

        /**
         *  常用方法
         * public String[] split ( String regex ) 可以将当前字符串中匹配regex正则表达式的符号作为"分隔符"来切割字符串。
         * public String replaceAll ( String regex , String newStr ) 可以将当前字符串中匹配regex正则表达式的字符串替换为newStr。
         * */

        //1 将以下字符串按照数字进行切割成[aa, bb, cc, dd]
        String s2 = "aa123bb234cc909dd";
        System.out.println(Arrays.toString(s2.split("\\d+")));
        //2 将下面字符串中的"数字"替换为 "*“
        String s3 = "我卡里有100000元，我告诉你卡的密码是123456，要保密哦";
        System.out.println(s3.replaceAll("\\d+", "*"));

    }
}
