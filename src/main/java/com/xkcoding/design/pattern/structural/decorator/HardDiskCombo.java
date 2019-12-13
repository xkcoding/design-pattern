package com.xkcoding.design.pattern.structural.decorator;

/**
 * <p>
 * 硬盘套餐
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019/12/13 17:15
 */
public class HardDiskCombo extends ComboDecorator {
    public HardDiskCombo(MacBookPro macBookPro) {
        super(macBookPro);
    }

    /**
     * 套餐名称
     *
     * @return 套餐名称
     */
    @Override
    public String getComboName() {
        return super.getComboName() + " + 升级硬盘";
    }

    /**
     * 硬盘
     *
     * @return 硬盘
     */
    @Override
    public String getHardDisk() {
        return super.getHardDisk() + " + 1TB 固态硬盘";
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
