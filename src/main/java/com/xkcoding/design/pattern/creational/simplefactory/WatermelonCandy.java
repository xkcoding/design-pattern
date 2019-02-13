package com.xkcoding.design.pattern.creational.simplefactory;

/**
 * <p>
 * 西瓜味糖果
 * </p>
 *
 * @package: com.xkcoding.design.pattern.creational.simplefactory
 * @description: 西瓜味糖果
 * @author: yangkai.shen
 * @date: Created in 2019-02-13 10:36
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
public class WatermelonCandy extends Candy {
    /**
     * 口味
     */
    @Override
    public void taste() {
        System.out.println("西瓜味");
    }
}
