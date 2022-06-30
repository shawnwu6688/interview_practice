package threadlock;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ProjectName: interview_practice
 * @Package: threadlock
 * @ClassName: Locks
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/6/30 15:55
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 **/
public class Locks {
    // ------------------------- 悲观锁的调用方式 -------------------------
// synchronized
    public synchronized void testMethod() {
        // 操作同步资源
    }

    // ReentrantLock
    private ReentrantLock lock = new ReentrantLock(); // 需要保证多个线程使用的是同一个锁

    public void modifyPublicResources() {
        lock.lock();
        // 操作同步资源
        lock.unlock();
    }

    // ------------------------- 乐观锁的调用方式 -------------------------
    private AtomicInteger atomicInteger = new AtomicInteger();  // 需要保证多个线程使用的是同一个AtomicInteger
    public void testIncrementAndGet(){
        atomicInteger.incrementAndGet(); //执行自增1
    }
}