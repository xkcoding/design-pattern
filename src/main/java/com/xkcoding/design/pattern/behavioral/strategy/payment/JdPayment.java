package com.xkcoding.design.pattern.behavioral.strategy.payment;

/**
 * <p>
 * 京东支付
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019/8/28 14:38
 */
public class JdPayment implements Payment {
    /**
     * 支付渠道
     *
     * @return 支付渠道
     */
    @Override
    public String channelName() {
        return "京东支付";
    }

    /**
     * 余额
     *
     * @return 账户余额
     */
    @Override
    public double balance() {
        return 500;
    }

    /**
     * 支付金额
     *
     * @param money 金额
     */
    @Override
    public void pay(double money) {
        if (balance() < money) {
            System.err.println("余额不足，当前余额：" + balance());
        } else {
            System.out.println("支付成功，交易金额：" + money);
        }
    }
}
