package com.xkcoding.design.pattern.creational.factorymethod;

/**
 * <p>
 * 糖果工厂抽象类
 * </p>
 *
 * @package: com.xkcoding.design.pattern.creational.factorymethod
 * @description: 糖果工厂抽象类
 * @author: yangkai.shen
 * @date: Created in 2019-02-14 11:29
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
public abstract class CandyFactory {
    /**
     * 生产糖果
     *
     * @return 对应口味的糖果
     */
    public abstract Candy produceCandy();
}
