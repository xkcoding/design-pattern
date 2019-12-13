package com.xkcoding.design.pattern.structural.decorator;

/**
 * <p>
 * 内存套餐
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019/12/13 17:17
 */
public class MemoryCombo extends ComboDecorator {
    public MemoryCombo(MacBookPro macBookPro) {
        super(macBookPro);
    }

    /**
     * 套餐名称
     *
     * @return 套餐名称
     */
    @Override
    public String getComboName() {
        return super.getComboName() + " + 升级内存";
    }

    /**
     * 内存
     *
     * @return 内存
     */
    @Override
    public String getMemory() {
        return super.getMemory() + " + 16G 内存";
    }

    /**
     * 价格
     *
     * @return 价格
     */
    @Override
    public Double getPrice() {
        return super.getPrice() + 2936;
    }
}
