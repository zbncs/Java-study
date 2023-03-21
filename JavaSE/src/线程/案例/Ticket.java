package 线程.案例;

public class Ticket implements Runnable {
    private int ticketCount = 100;
    private static Object obj = new Object();
    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (ticketCount > 0) {
                    ticketCount--;
                    System.out.println(Thread.currentThread().getName() + "卖了" + ticketCount + "票");
//                    try {
//                        Thread.sleep(200);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                } else {
                    break;
                }
            }
        }
    }
}
