package com.xkcoding.design.pattern.creational.simplefactory;

/**
 * <p>
 * 糖果工厂类
 * </p>
 *
 * @package: com.xkcoding.design.pattern.creational.simplefactory
 * @description: 糖果工厂类
 * @author: yangkai.shen
 * @date: Created in 2019-02-13 10:43
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
public class CandyFactory {
    /**
     * 生产糖果
     *
     * @param taste 具体口味
     * @return 对应口味的糖果
     */
    public Candy produceCandy(String taste) {
        if ("lemon".equalsIgnoreCase(taste)) {
            return new LemonCandy();
        } else if ("watermelon".equalsIgnoreCase(taste)) {
            return new WatermelonCandy();
        }
        return null;
    }

    /**
     * 生产糖果
     * @param c 具体口味的糖果类
     * @return 对应口味的糖果
     */
    public Candy produceCandy(Class c) {
        Candy candy = null;
        try {
            candy = (Candy) Class.forName(c.getSimpleName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return candy;
    }
}
