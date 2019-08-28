package com.xkcoding.design.pattern.behavioral.delegate;

/**
 * <p>
 * 工人接口
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019/8/28 11:17
 */
public interface Worker {
    /**
     * 做事情
     *
     * @param thing 任务
     */
    void doing(String thing);
}
