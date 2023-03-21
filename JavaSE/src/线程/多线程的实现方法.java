package 线程;

public class 多线程的实现方法 {
    public static void main(String[] args) {
        /**
         * 线程的创建：
         * Thread类
         *
         *
         *
         * */
        MyThread myThread = new MyThread();
        myThread.setName("新线程");
        myThread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("main: " + i);
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+ ": " + i);
        }
    }
}
