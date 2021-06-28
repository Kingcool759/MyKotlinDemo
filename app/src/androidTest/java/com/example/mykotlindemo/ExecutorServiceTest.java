package com.example.mykotlindemo;

import org.junit.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @data on 2021/6/28 1:54 下午
 * @auther KC
 * @describe 线程池用法探究
 */
public class ExecutorServiceTest {
    @Test
    private static void main(String[] args){
        /**
         *  public ThreadPoolExecutor(
         *      int corePoolSize,  线程池中的核心线程数
         *      int maximumPoolSize,  线程池中所容纳的最大线程数
         *      long keepAliveTime,  非核心线程闲置时的超时时长
         *      TimeUnit unit,  用于指定keepAliveTime参数的时间单位
         *      BlockingQueue<Runnable> workQueue,  线程池中保存等待执行的任务的阻塞队列
         *      ThreadFactory threadFactory, 线程工厂，为线程池提供新线程的创建
         *      RejectedExecutionHandler handler 是RejectedExecutionHandler对象，而RejectedExecutionHandler是一个接口，里面只有一个rejectedExecution方法
         *      )
         */
        //ExecutorService使用
        ExecutorService service = new ThreadPoolExecutor(5,10,10, TimeUnit.SECONDS,new LinkedBlockingDeque<>());
        //向线程池提交一个任务:
        // (1)使用execute（Runnable）的方式-没有返回值，因此无法判定任务是否被线程池执行成功。
        service.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("execute方式");
            }
        });
        //（2）使用Submit方式
        Future<Integer> future = service.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("submit方式");
                return 2;
            }
        });
        try {
            Integer number = future.get();  //通过判断返回值，来判定任务是否被线程池执行成功
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //如何关闭线程池？
        //（1）使用shutdown()方法，将线程池状态设置成SHUTDOWN状态，然后中断所有没有正在执行任务的线程。
        service.shutdown();
        //（2）将线程池的状态设置成STOP状态，然后中断所有任务(包括正在执行的)的线程，并返回等待执行任务的列表。
//        service.shutdownNow()

        /**
         * 四种线程池分类：
         */
        //(1)newFixedThreadPool：一种线程数量固定的线程池。
        //特点：这个线程池中 所容纳最大的线程数就是我们设置的核心线程数。
        // newFixedThreadPool只有核心线程，并且这些线程都不会被回收，也就是 它能够更快速的响应外界请求。
        // 除非线程池关闭，所有线程才会被回收。
        ExecutorService service1 = Executors.newFixedThreadPool(4);
        //实现方式
//        public static ExecutorService newFixedThreadPool(int nThreads) {
//            return new ThreadPoolExecutor(nThreads, nThreads,
//                    0L, TimeUnit.MILLISECONDS,
//                    new LinkedBlockingQueue<Runnable>());
//        }
        //(2)newCachedThreadPool：可缓存线程池。
        // 特点：线程处于闲置状态超过60秒的时候便会被回收。
        ExecutorService service2 = Executors.newCachedThreadPool();
        //实现方式
//        public static ExecutorService newCachedThreadPool() {
//            return new ThreadPoolExecutor(0, Integer.MAX_VALUE,
//                    60L, TimeUnit.SECONDS,
//                    new SynchronousQueue<Runnable>());
//        }
        //(3)newScheduledThreadPool：可定时执行或周期执行任务的线程池：
        //特点：它的核心线程数是固定的，对于非核心线程几乎可以说是没有限制的，并且当非核心线程处于限制状态的时候就会立即被回收。
        ExecutorService service3 = Executors.newScheduledThreadPool(5);
        //实现方式
//        public static ScheduledExecutorService newScheduledThreadPool(int corePoolSize) {
//            return new ScheduledThreadPoolExecutor(corePoolSize);
//        }
//        public ScheduledThreadPoolExecutor(int corePoolSize) {
//            super(corePoolSize, Integer.MAX_VALUE, 0, NANOSECONDS,
//                    new DelayedWorkQueue());
//        }
        //(4)newSingleThreadExecutor：单个线程池
        //特点：在这个线程池中只有一个核心线程，对于任务队列没有大小限制，也就意味着这一个任务处于活动状态时，其他任务都会在任务队列中排队等候依次执行。
        ExecutorService service4 = Executors.newSingleThreadExecutor();
        //实现方式
//        public static ExecutorService newSingleThreadExecutor() {
//            return new FinalizableDelegatedExecutorService
//                    (new ThreadPoolExecutor(1, 1,
//                            0L, TimeUnit.MILLISECONDS,
//                            new LinkedBlockingQueue<Runnable>()));
//        }

    }
}
