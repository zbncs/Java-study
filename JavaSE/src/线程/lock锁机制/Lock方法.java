package 线程.lock锁机制;

import java.util.concurrent.locks.ReentrantLock;

/**
 *虽然我们可以理解同步代码块和同步方法的锁对象问题，但是我们并没有直接看到在哪里加上了锁，在哪里释放了锁，
 * 为了更清晰的表达如何加锁和释放锁，JDK5以后提供了一个新的锁对象Lock
 *
 * Lock中提供了获得锁和释放锁的方法
 * void lock()：获得锁
 * void unlock()：释放锁
 *
 * Lock是接口不能直接实例化，这里采用它的实现类ReentrantLock来实例化
 * ReentrantLock的构造方法
 * ReentrantLock()：创建一个ReentrantLock的实例
 * */

public class Lock方法 {
    private static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        //lock.lock();
        //lock.unlock();
    }
}



