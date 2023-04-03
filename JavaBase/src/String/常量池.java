package String;

public class 常量池 {
    public static void main(String[] args) {
        String s1 = new String("1");
        s1.intern();
        String s2 = "1";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);


        String s3 = new String("1") + new String("1");
        s3.intern();
        String s4 = "11";
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s3 == s4);


        String s5 = new String("1");
        String s6 = s5.intern();
        System.out.println(s5 == s6);
    }
}
