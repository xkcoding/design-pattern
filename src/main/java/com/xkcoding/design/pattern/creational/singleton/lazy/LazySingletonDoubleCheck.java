package com.xkcoding.design.pattern.creational.singleton.lazy;

import com.xkcoding.design.pattern.utils.ConcurrentExecutor;

/**
 * <p>
 * 懒汉式单例，双重检查锁
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019-08-11 19:19
 */
public class LazySingletonDoubleCheck {
    /**
     * 添加 {@code volatile} 解决底层 CPU 指令重排的问题
     */
    private volatile static LazySingletonDoubleCheck INSTANCE = null;

    private LazySingletonDoubleCheck() {
    }

    public static LazySingletonDoubleCheck getInstance() {
        if (INSTANCE == null) {
            synchronized (LazySingletonDoubleCheck.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazySingletonDoubleCheck();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) throws InterruptedException {
        ConcurrentExecutor.execute(() -> {
            System.out.println("线程号: " + Thread.currentThread().getName() + "，" + LazySingletonDoubleCheck.getInstance());
        }, 10, 5);
    }
}
