package com.xkcoding.design.pattern.behavioral.strategy.payment;

/**
 * <p>
 * 支付接口
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019/8/28 14:31
 */
public interface Payment {
    /**
     * 支付渠道
     *
     * @return 支付渠道
     */
    String channelName();

    /**
     * 余额
     *
     * @return 账户余额
     */
    double balance();

    /**
     * 支付金额
     *
     * @param money 金额
     */
    void pay(double money);
}
