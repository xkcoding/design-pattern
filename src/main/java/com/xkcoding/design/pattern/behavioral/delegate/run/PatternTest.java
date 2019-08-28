package com.xkcoding.design.pattern.behavioral.delegate.run;

import com.xkcoding.design.pattern.behavioral.delegate.Boss;
import com.xkcoding.design.pattern.behavioral.delegate.Leader;

/**
 * <p>
 * 委派模式，测试类
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019/8/28 11:28
 */
public class PatternTest {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.command("cooking", new Leader());
        System.out.println("------------------- ");
        boss.command("sewing", new Leader());
        System.out.println("------------------- ");
        boss.command("selling", new Leader());
    }
}
