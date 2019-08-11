package com.xkcoding.design.pattern.creational.singleton.register;

import com.xkcoding.design.pattern.utils.ConcurrentExecutor;

/**
 * <p>
 * 注册式单例，ThreadLocal实现，伪线程安全，保证线程内部全部唯一，同一线程内线程安全
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019-08-11 19:55
 */
public class RegisterSingletonThreadLocal {
    private static final ThreadLocal<RegisterSingletonThreadLocal> INSTANCE = ThreadLocal.withInitial(RegisterSingletonThreadLocal::new);

    private RegisterSingletonThreadLocal() {
    }

    public static RegisterSingletonThreadLocal getInstance() {
        return INSTANCE.get();
    }

    /**
     * 测试可见，同一线程内单例，不同线程间非单例
     */
    public static void main(String[] args) throws InterruptedException {
        System.out.println("线程号: " + Thread.currentThread().getName() + "，" + RegisterSingletonThreadLocal.getInstance());
        System.out.println("线程号: " + Thread.currentThread().getName() + "，" + RegisterSingletonThreadLocal.getInstance());
        System.out.println("线程号: " + Thread.currentThread().getName() + "，" + RegisterSingletonThreadLocal.getInstance());
        System.out.println("线程号: " + Thread.currentThread().getName() + "，" + RegisterSingletonThreadLocal.getInstance());

        ConcurrentExecutor.execute(() -> {
            System.out.println("线程号: " + Thread.currentThread().getName() + "，" + RegisterSingletonThreadLocal.getInstance());
        }, 10, 5);
    }
}
