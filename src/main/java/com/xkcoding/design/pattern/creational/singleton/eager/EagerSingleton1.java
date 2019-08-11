package com.xkcoding.design.pattern.creational.singleton.eager;

import com.xkcoding.design.pattern.utils.ConcurrentExecutor;

/**
 * <p>
 * 饿汉式单例，在属性初始化
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019-08-11 11:32
 */
public class EagerSingleton1 {
    private final static EagerSingleton1 INSTANCE = new EagerSingleton1();

    /**
     * 私有化构造方法
     */
    private EagerSingleton1() {
    }

    /**
     * 提供全局访问入口
     */
    public static EagerSingleton1 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) throws InterruptedException {
        ConcurrentExecutor.execute(() -> {
            System.out.println("线程号: " + Thread.currentThread().getName() + "，" + EagerSingleton1.getInstance());
        }, 10, 5);
    }

}
