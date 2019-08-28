package com.xkcoding.design.pattern.behavioral.delegate;

/**
 * <p>
 * 缝纫工
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019/8/28 11:19
 */
public class TailorWorker implements Worker {
    /**
     * 做事情
     *
     * @param thing 任务
     */
    @Override
    public void doing(String thing) {
        System.out.println("我是缝纫工，我接到任务，需要做衣服。");
    }
}
