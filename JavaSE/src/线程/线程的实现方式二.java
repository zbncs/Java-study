package 线程;

public class 线程的实现方式二 {
    /**
     *第二种创建方式使用如下构造方法，指定任务给线程执行
     *   public Thread(Runnable target)
     *   public Thread(Runnalbe target , String name)
     * 参数中的Runnable是一个接口，用来定义线程要执行的任务
     *
     * */
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable, "my");
        //thread.start();

        // 匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                }
            }
        }, "匿名内部类方式").start();

        // lambda
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }, "lambda").start();


    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
