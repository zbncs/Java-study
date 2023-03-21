package 线程.lock锁机制;

public class LockDemo {
    public static void main(String[] args) {
        //System.out.println(show());
    }

    // try catch finally
    private static int show() {
        try {
            int[] arr = {1, 2, 3};
            //return arr[2];
            System.exit(0);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("11111111");
        }
        return 0;
    }
}
