package com.xkcoding.design.pattern.creational.simplefactory.run;

import com.xkcoding.design.pattern.creational.simplefactory.Candy;
import com.xkcoding.design.pattern.creational.simplefactory.LemonCandy;
import com.xkcoding.design.pattern.creational.simplefactory.WatermelonCandy;

/**
 * <p>
 * 不使用设计模式测试类
 * </p>
 *
 * @package: com.xkcoding.design.pattern.creational.simplefactory.run
 * @description: 不使用设计模式测试类
 * @author: yangkai.shen
 * @date: Created in 2019-02-13 10:37
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
public class NoPatternTest {
    public static void main(String[] args) {
        Candy candy1 = new LemonCandy();
        candy1.taste();
        Candy candy2 = new WatermelonCandy();
        candy2.taste();
    }
}
