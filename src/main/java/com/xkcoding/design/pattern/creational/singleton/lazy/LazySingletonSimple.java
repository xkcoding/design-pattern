package com.xkcoding.design.pattern.creational.singleton.lazy;

import com.xkcoding.design.pattern.utils.ConcurrentExecutor;

/**
 * <p>
 * 懒汉式单例，简单实现
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019-08-11 19:15
 */
public class LazySingletonSimple {
    private static LazySingletonSimple INSTANCE = null;

    private LazySingletonSimple() {
    }

    /**
     * 此处需要加 {@code synchronized}，保证线程安全
     */
    public synchronized static LazySingletonSimple getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingletonSimple();
        }
        return INSTANCE;
    }

    public static void main(String[] args) throws InterruptedException {
        ConcurrentExecutor.execute(() -> {
            System.out.println("线程号: " + Thread.currentThread().getName() + "，" + LazySingletonSimple.getInstance());
        }, 10, 5);
    }
}
