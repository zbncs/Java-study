package 异常;

public class Throwable方法 {
    public static void main(String[] args) {
        /**
         *public String getMessage()：返回此 throwable 的详细消息字符串
         *
         * public String toString()：返回此可抛出的简短描述
         *
         * public void printStackTrace()：把异常的错误信息输出在控制台
         *
         * */

        try {
            int[] a = {1, 2};
            System.out.println(a[3]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }
}
