package com.xkcoding.design.pattern.structural.proxy.dynamicproxy.jdk.run;

import com.xkcoding.design.pattern.structural.proxy.MusicTicket;
import com.xkcoding.design.pattern.structural.proxy.Ticket;
import com.xkcoding.design.pattern.structural.proxy.dynamicproxy.jdk.Conductor;
import com.xkcoding.design.pattern.structural.proxy.dynamicproxy.jdk.SportTicket;

/**
 * <p>
 * 代理模式 - 动态代理 - JDK动态代理，测试类
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019-08-20 23:04
 */
public class PatternTest {
    public static void main(String[] args) {
        // 代理演唱会门票
        Ticket musicTicket = (Ticket) new Conductor().getInstance(new MusicTicket());
        musicTicket.sell();

        // 代理运动会门票
        Ticket sportTicket = (Ticket) new Conductor().getInstance(new SportTicket());
        sportTicket.sell();
    }
}
