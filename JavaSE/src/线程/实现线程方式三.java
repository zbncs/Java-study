package 线程;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * 线程实现方式区别：
 *
 * 继承Thread类：
 *      优点：代码简单，可以直接使用Thread类中的功能
 *      缺点：扩展性差，只能继承Thread类，任务执行完毕没有返回结果，有异常只能捕获
 *
 * 实现Runnable接口
 *      优点：代码实现简单，扩展性较强，因为还可以继承其他类
 *      缺点：不能直接使用Thread类中的功能，任务执行完毕没有返回结果，有异常只能捕获
 *
 * 实现Callable接口
 *      优点：扩展性较强因为还可以继承其他的类，任务执行完毕会有一个返回值结果，有异常可以捕获
 *      缺点：实现太过复杂，不能直接使用Thread类中的功能
 *
 *
 * */

public class 实现线程方式三 {
    public static void main(String[] args) {
        MyCallable myCallable = new MyCallable();

        //
        FutureTask<String> task = new FutureTask<>(myCallable);
        Thread thread = new Thread(task, "新线程");
        thread.start();
        
        // 获取线程执行完毕的结果
        try {
            String s = task.get(); // 具有阻塞后面线程的作用
            System.out.println(s);
        } catch (Exception e) {
            System.out.println(e);
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
        return Thread.currentThread().getName() + "执行完毕";
    }
}

