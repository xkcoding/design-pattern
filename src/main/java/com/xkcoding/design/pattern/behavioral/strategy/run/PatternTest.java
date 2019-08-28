package com.xkcoding.design.pattern.behavioral.strategy.run;

import com.xkcoding.design.pattern.behavioral.strategy.PaymentStrategy;
import com.xkcoding.design.pattern.behavioral.strategy.payment.Payment;

/**
 * <p>
 * 策略模式，测试类
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019/8/28 14:54
 */
public class PatternTest {
    public static void main(String[] args) {
        Payment payment = PaymentStrategy.choose(PaymentStrategy.ALI_PAY);
        payment.pay(200);

        System.out.println("--------------------");

        payment = PaymentStrategy.choose(PaymentStrategy.UNION_PAY);
        payment.pay(200);
    }
}
