package 线程;

/**
 * 线程间的通讯技术就是通过等待和唤醒机制，来实现多个线程协同操作完成某一项任务;
 *
 * 1）等待方法
 *
 * void wait()  让线程进入无限等待。
 * void wait(long timeout)  让线程进入计时等待 以上两个方法调用会导致当前线程释放掉锁资源。
 *
 * 2）唤醒方法
 *
 * void notify()  随机唤醒在此对象监视器（锁对象）上等待的单个线程。 void notifyAll() 唤醒在此对象监视器上等待的所有线程。
 * 以上两个方法调用不会导致当前线程释放掉锁资源。
 *
 * 注意：
 * 等待和唤醒的方法，都要使用锁对象调用（需要在同步代码块中使用）。
 * 等待和唤醒方法应该使用相同的锁对象调用。
 *
 * wait(5000)：5秒钟之内还可以被唤醒
 * sleep(5000)：5秒钟之后自动唤醒
 *
 * */
public class 线程通讯方法 {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.println("a线程开始执行");
                    try {
                        System.out.println("a线程进入等待状态");
                        lock.wait();   // 会释放锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("a线程执行结束");
            }
        }, "a线程").start();

        Thread.sleep(3000);

        new Thread(() -> {
            synchronized (lock) {
                System.out.println("b线程开始执行");
                try {
                    System.out.println("b线程唤醒a线程");
                    lock.notify();   // 不会释放锁
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.println("b线程执行结束");
        }, "b线程").start();
    }
}


