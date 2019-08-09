package com.xkcoding.design.pattern.creational.abstractfactory;

/**
 * <p>
 * 苹果公司
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019-08-09 18:00
 */
public class AppleTechCompany extends TechFactory {
    /**
     * 卖手机
     *
     * @return 手机
     */
    @Override
    public Phone sellPhone() {
        return new IPhone();
    }

    /**
     * 卖笔记本
     *
     * @return 笔记本
     */
    @Override
    public Laptop sellLaptop() {
        return new MacBookPro();
    }

    /**
     * 卖耳机
     *
     * @return 耳机
     */
    @Override
    public EarPhone sellEarPhone() {
        return new AirPod();
    }
}
