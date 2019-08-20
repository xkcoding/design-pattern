package com.xkcoding.design.pattern.structural.proxy;

/**
 * <p>
 * 演唱会门票
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019-08-20 22:16
 */
public class MusicTicket implements Ticket {
    /**
     * 卖票
     */
    @Override
    public void sell() {
        System.out.println("卖演唱会门票");
    }
}
