package com.xkcoding.design.pattern.creational.singleton.eager;

import com.xkcoding.design.pattern.utils.ConcurrentExecutor;

/**
 * <p>
 * 饿汉式单例，在静态代码块初始化
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019-08-11 11:46
 */
public class EagerSingleton2 {
    /**
     * 此处需要设置为 {@code final} 的，防止被后续赋值！
     */
    private final static EagerSingleton2 INSTANCE;

    static {
        INSTANCE = new EagerSingleton2();
    }

    /**
     * 私有化构造方法
     */
    private EagerSingleton2() {
    }

    /**
     * 提供全局访问入口
     */
    public static EagerSingleton2 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) throws InterruptedException {
        ConcurrentExecutor.execute(() -> {
            System.out.println("线程号: " + Thread.currentThread().getName() + "，" + EagerSingleton2.getInstance());
        }, 10, 5);
    }
}
