package 线程.线程池;

import java.util.concurrent.*;

/**
 * Callable与Runnable的不同点：
 * Callable支持结果返回，Runnable不行
 * Callable可以 抛出异常，Runnable不行
 * */

public class CallableInter {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);

        Future<Integer> future = threadPool.submit(new Calc(100));

        Integer res = future.get();
        System.out.println(res);


    }
}

class Calc implements Callable<Integer> {
    private int n;

    public Calc(int n) {
        this.n = n;
    }
    static int sum = 0;
    @Override
    public Integer call() throws Exception {
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
