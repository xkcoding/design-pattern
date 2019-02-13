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
        Candy candy = factory.produceCandy("lemon");
        candy.taste();
        candy = factory.produceCandy("watermelon");
        candy.taste();

        // 测试工厂类方法 - 2
        candy = factory.produceCandy(LemonCandy.class);
        candy.taste();
        candy = factory.produceCandy(WatermelonCandy.class);
        candy.taste();
    }
}
