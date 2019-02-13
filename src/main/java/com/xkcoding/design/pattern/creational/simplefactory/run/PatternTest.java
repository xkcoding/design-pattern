package com.xkcoding.design.pattern.creational.simplefactory.run;

import com.xkcoding.design.pattern.creational.simplefactory.Candy;
import com.xkcoding.design.pattern.creational.simplefactory.CandyFactory;
import com.xkcoding.design.pattern.creational.simplefactory.LemonCandy;
import com.xkcoding.design.pattern.creational.simplefactory.WatermelonCandy;

/**
 * <p>
 * 简单工厂模式测试类
 * </p>
 *
 * @package: com.xkcoding.design.pattern.creational.simplefactory.run
 * @description: 简单工厂模式测试类
 * @author: yangkai.shen
 * @date: Created in 2019-02-13 10:40
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
public class PatternTest {
    public static void main(String[] args) {
        CandyFactory factory = new CandyFactory();
        // 测试工厂类方法 - 1
        Candy candy1 = factory.produceCandy("lemon");
        candy1.taste();
        Candy candy2 = factory.produceCandy("watermelon");
        candy2.taste();

        // 测试工厂类方法 - 2
        Candy candy3 = factory.produceCandy(LemonCandy.class);
        candy3.taste();
        Candy candy4 = factory.produceCandy(WatermelonCandy.class);
        candy4.taste();
    }
}
