package com.xkcoding.design.pattern.creational.factorymethod;

/**
 * <p>
 * 柠檬味糖果
 * </p>
 *
 * @package: com.xkcoding.design.pattern.creational.factorymethod
 * @description: 柠檬味糖果
 * @author: yangkai.shen
 * @date: Created in 2019-02-14 11:28
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
public class LemonCandy extends Candy {
    /**
     * 口味
     */
    @Override
    public void taste() {
        System.out.println("柠檬味");
    }
}
