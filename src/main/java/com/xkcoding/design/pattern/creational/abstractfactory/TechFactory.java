package com.xkcoding.design.pattern.creational.abstractfactory;

/**
 * <p>
 * 科技公司抽象类
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019-08-09 17:34
 */
public abstract class TechFactory {
    /**
     * 卖手机
     *
     * @return 手机
     */
    public abstract Phone sellPhone();

    /**
     * 卖笔记本
     *
     * @return 笔记本
     */
    public abstract Laptop sellLaptop();

    /**
     * 卖耳机
     *
     * @return 耳机
     */
    public abstract EarPhone sellEarPhone();
}
