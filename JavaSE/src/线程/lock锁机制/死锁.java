package 线程.lock锁机制;

/**
 * 死锁产生的条件分析：
 * 多个线程
 * 存在锁对象的循环依赖
 *
 * */

public class 死锁 {
    private static Object objA = new Object();
    private static Object objB = new Object();
    public static void main(String[] args) {
        synchronized (objA) {
            System.out.println("嵌套1 objA");
            synchronized (objB) {
                System.out.println("嵌套1 objB");
            }
        }
        synchronized (objB) {
            System.out.println("嵌套2 objB");
            synchronized (objA) {
                System.out.println("嵌套2 objA");
            }
        }
    }
}
