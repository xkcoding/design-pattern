package com.xkcoding.design.pattern.structural.decorator;

import lombok.AllArgsConstructor;

/**
 * <p>
 * 套餐 - 装饰器
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019/12/13 17:08
 */
@AllArgsConstructor
public abstract class ComboDecorator implements MacBookPro {
    private MacBookPro macBookPro;

    /**
     * 套餐名称
     *
     * @return 套餐名称
     */
    @Override
    public String getComboName() {
        return this.macBookPro.getComboName();
    }

    /**
     * 硬盘
     *
     * @return 硬盘
     */
    @Override
    public String getHardDisk() {
        return this.macBookPro.getHardDisk();
    }

    /**
     * 内存
     *
     * @return 内存
     */
    @Override
    public String getMemory() {
        return this.macBookPro.getMemory();
    }

    /**
     * 价格
     *
     * @return 价格
     */
    @Override
    public Double getPrice() {
        return this.macBookPro.getPrice();
    }
}
