package String;

public class Replace系列 {
    public static void main(String[] args) {
        String str = "1123456";
        // 1.replace
        String a = str.replace("1", "A");
        System.out.println(a);

        // 2.replaceFirst()
        String a1 = str.replaceFirst("1", "A");
        String a2 = str.replaceFirst("\\d", "a");
        System.out.println(a2);

        // 3.replaceAll
        String a4 = str.replaceAll("1", "a");
        String a3 = str.replaceAll("\\d", "a");
        System.out.println(a4);
    }
}
