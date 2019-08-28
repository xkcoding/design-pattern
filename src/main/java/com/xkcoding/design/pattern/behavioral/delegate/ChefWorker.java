package com.xkcoding.design.pattern.behavioral.delegate;

/**
 * <p>
 * 厨师工
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019/8/28 11:19
 */
public class ChefWorker implements Worker {
    /**
     * 做事情
     *
     * @param thing 任务
     */
    @Override
    public void doing(String thing) {
        System.out.println("我是厨师，我接到任务，需要做美食。");
    }
}
