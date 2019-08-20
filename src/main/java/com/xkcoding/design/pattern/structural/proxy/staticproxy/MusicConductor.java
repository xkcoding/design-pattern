package com.xkcoding.design.pattern.structural.proxy.staticproxy;

import com.xkcoding.design.pattern.structural.proxy.MusicTicket;
import com.xkcoding.design.pattern.structural.proxy.Ticket;

/**
 * <p>
 * 静态代理类，演唱会售票员(只卖演唱会门票)
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019-08-20 22:24
 */
public class MusicConductor implements Ticket {
    private MusicTicket ticket;

    public MusicConductor(MusicTicket ticket) {
        this.ticket = ticket;
    }

    /**
     * 卖票
     */
    @Override
    public void sell() {
        before();
        this.ticket.sell();
        after();
    }

    private void before() {
        System.out.println("方法前增强");
    }

    private void after() {
        System.out.println("方法后增强");
    }
}
