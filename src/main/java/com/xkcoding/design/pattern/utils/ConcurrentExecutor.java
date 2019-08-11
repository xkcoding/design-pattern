package com.xkcoding.design.pattern.utils;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * <p>
 * 并发测试执行器
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019-08-11 14:01
 */
public class ConcurrentExecutor {
    /**
     * 处理
     *
     * @param runHandler      请求处理器
     * @param requestCount    请求数
     * @param concurrentCount 并发数
     */
    public static void execute(RunHandler runHandler, int requestCount, int concurrentCount) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();

        // 使用信号量控制并发数量
        Semaphore semaphore = new Semaphore(concurrentCount);
        // 控制主线程阻塞
        CountDownLatch countDownLatch = new CountDownLatch(requestCount);

        for (int i = 0; i < requestCount; i++) {
            executorService.execute(() -> {
                try {
                    // 获取信号量
                    semaphore.acquire();
                    // 执行操作
                    runHandler.handler();
                    // 释放信号量
                    semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    // 释放countDownLatch
                    countDownLatch.countDown();
                }
            });
        }
        // 阻塞主线程
        countDownLatch.await();
        // 关闭线程池
        executorService.shutdown();
    }

    public interface RunHandler {
        /**
         * 处理器
         */
        void handler();
    }
}
