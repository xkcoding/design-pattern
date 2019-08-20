package com.xkcoding.design.pattern.structural.proxy.staticproxy.run;

import com.xkcoding.design.pattern.structural.proxy.MusicTicket;
import com.xkcoding.design.pattern.structural.proxy.staticproxy.MusicConductor;

/**
 * <p>
 * 代理模式 - 静态代理测试类
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019-08-20 22:29
 */
public class PatternTest {
    public static void main(String[] args) {
        MusicConductor conductor = new MusicConductor(new MusicTicket());
        conductor.sell();
    }
}
