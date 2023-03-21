package 线程.lock锁机制;

import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable {
    private int ticketCount = 100;
    private static ReentrantLock lock = new ReentrantLock();


    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                if (ticketCount > 0) {
                    ticketCount--;
                    System.out.println(Thread.currentThread().getName() + "卖了" + ticketCount + "票");
                } else {
                    break;
                }
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}
