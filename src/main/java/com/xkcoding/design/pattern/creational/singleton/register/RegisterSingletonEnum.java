package com.xkcoding.design.pattern.creational.singleton.register;

import com.xkcoding.design.pattern.utils.ConcurrentExecutor;

/**
 * <p>
 * 注册式单例，枚举实现，{@code 推荐写法之一}
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019-08-11 19:35
 */
public enum RegisterSingletonEnum {
    /**
     * 单例
     */
    INSTANCE;

    public static RegisterSingletonEnum getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) throws InterruptedException {
        ConcurrentExecutor.execute(() -> {
            System.out.println("线程号: " + Thread.currentThread().getName() + "，" + RegisterSingletonEnum.getInstance());
        }, 10, 5);
    }
}
