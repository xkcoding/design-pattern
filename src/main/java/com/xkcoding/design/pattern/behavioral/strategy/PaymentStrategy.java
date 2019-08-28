package com.xkcoding.design.pattern.behavioral.strategy;

import com.xkcoding.design.pattern.behavioral.strategy.payment.*;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 支付策略
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019/8/28 14:43
 */
public enum PaymentStrategy {
    /**
     * 支付宝
     */
    ALI_PAY,
    /**
     * 微信支付
     */
    WECHAT_PAY,
    /**
     * 京东支付
     */
    JD_PAY,
    /**
     * 银联支付
     */
    UNION_PAY;

    /**
     * 支付方式容器池
     */
    private static Map<PaymentStrategy, Payment> PAYMENT_POOL = new HashMap<>();

    static {
        PAYMENT_POOL.put(ALI_PAY, new AliPayment());
        PAYMENT_POOL.put(WECHAT_PAY, new WeChatPayment());
        PAYMENT_POOL.put(JD_PAY, new JdPayment());
        PAYMENT_POOL.put(UNION_PAY, new UnionPayment());
    }

    /**
     * 选择支付方式
     *
     * @param strategy 支付策略
     * @return 支付方式
     */
    public static Payment choose(PaymentStrategy strategy) {
        Payment payment = PAYMENT_POOL.get(ALI_PAY);

        if (PAYMENT_POOL.containsKey(strategy)) {
            payment = PAYMENT_POOL.get(strategy);
        }

        System.out.println("欢迎使用: " + payment.channelName());
        return payment;
    }
}
