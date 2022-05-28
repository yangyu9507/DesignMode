package com.yaron;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author yyu
 * @Daet 2021/11/18
 * @Version 1.0
 * @Description
 */
public class TestClassForTherd {

    private static int Fords = 100;

    private static final long time = System.currentTimeMillis();

    private static int i = 0;

    public static void main(String[] args) throws Exception {
        System.out.println("开始时间:" + time);
        /**
         * 线程池的五种创建方式
         */
        /**
         * 单例线程池,只有一个线程
         * */

        ThreadPoolTaskExecutor init = init();
        for (int id = 0; id <= Fords ; id++) {
            // ExecutorService signService = Executors.newSingleThreadExecutor();
            TestThreadHander testThreadHander = new TestThreadHander();
            testThreadHander.setName(i);
            init.execute(testThreadHander);
        }
        init.shutdown();
        /* *//**
         * 缓存线程池,有多少个请求,就会创建多少个线程池,最大线程数量为int的最大值
         */
//        ExecutorService cashService = Executors.newCachedThreadPool();

        /**
         * 可以初始化线程池的数量,可以指定线程池使用的执行器
         */
//        ThreadPoolTaskExecutor factory = new ThreadPoolTaskExecutor();
//        factory.setMaxPoolSize(10);
//        ExecutorService fixService = Executors.newFixedThreadPool(10, factory);
        /**
         * 定时执行线程池,可以定时的去执行任务,定义queue的大小
         */
//        ExecutorService sechService = Executors.newScheduledThreadPool(10);
    }

    private static ThreadPoolTaskExecutor init() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(2);
        executor.setMaxPoolSize(2);
        //executor.setQueueCapacity(Integer.MAX_VALUE);
        executor.setQueueCapacity(15);

        executor.setThreadNamePrefix("线程测试----");
        executor.setKeepAliveSeconds(5);
//        executor.setAllowCoreThreadTimeOut(true);
        executor.setRejectedExecutionHandler((r,e) -> {
            try {
                e.getQueue().put(r);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });
        executor.initialize();
        return executor;
    }

    /**
     * 线程执行处理类
     */
    static class TestThreadHander implements Runnable {
        private int name;

        void setName(int name) {
            this.name = name;
        }

        @Override
        public void run() {
            TestThread testThread = new TestThread();
            testThread.sout(name);
        }
    }

    public final ReentrantLock lock = new ReentrantLock();

    /**
     * 假设为业务方法
     */
    static class TestThread {
        synchronized void sout(int name) {
            System.out.println(i++);
            sou();
        }
    }

    private static void sou() {
        if (i == 100000) {
            long end = System.currentTimeMillis();
            System.out.println("结束时间:" + end);
            System.out.println("耗时:" + (time - end) + "ms");
        }
    }
}
