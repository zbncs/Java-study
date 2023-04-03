package String;

public class 删除空格 {
    public static void main(String[] args) {
        // 1.trim: 删除开头和结尾空格；
        String s = "  666   ";
        String s1 = " 666 ";
        System.out.println(s);
        System.out.println(s.trim());

        // 2.strip: 删除开头和结尾空格；
        System.out.println(s.strip());

        // 3.stripLeading: 只删除开头空格
        System.out.println(s.stripLeading());

        // 4.stripTrailing: 只删除结尾空格
        System.out.println(s.stripTrailing());

        System.out.println(s.replaceFirst("\\s+", ""));

    }
}
