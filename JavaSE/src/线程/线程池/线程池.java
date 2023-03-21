package 线程.线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 其实就是一个容纳多个线程的容器，其中的线程可以反复使用，省去了频繁创建线程对象的操作，无需反复创建线程而消耗过多资源。
 *
 * 线程池使用大致流程：
 * 创建线程池指定线程开启的数量
 * 提交任务给线程池，线程池中的线程就会获取任务，进行处理任务。
 * 线程处理完任务，不会销毁，而是返回到线程池中，等待下一个任务执行。
 * 如果线程池中的所有线程都被占用，提交的任务，只能等待线程池中的线程处理完当前任务。
 *
 * 线程池ExecutorService的相关方法：
 * 提交执行任务方法：
 * <T> Future<T>  submit(Callable<T> task)
 * Future<?> submit(Runnable task)
 * 关闭线程池方法（一般不使用关闭方法，除非后期不用或者很长时间都不用，就可以关闭）
 * void shutdown()  启动一次顺序关闭，执行以前提交的任务，但不接受新任务。
 *
 * */

public class 线程池 {
    public static void main(String[] args) {
        // 创建线程池
        ExecutorService threadPool = Executors.newFixedThreadPool(2);

        // 把学员放入线程池
        threadPool.submit(new Students("1"));
        threadPool.submit(new Students("2"));
        threadPool.submit(new Students("3"));
        threadPool.submit(new Students("4"));
        threadPool.submit(new Students("5"));

        // 关闭线程池
        threadPool.shutdown();
    }
}

// 创建实现类Runnable
class Students implements Runnable {
    private String name;

    public Students(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "正在教" + name + "游泳");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
