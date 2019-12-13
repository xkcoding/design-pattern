package com.xkcoding.design.pattern.structural.decorator;

/**
 * <p>
 * 苹果笔记本基础套餐
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019/12/13 16:52
 */
public class BaseMacBookProCombo implements MacBookPro {

    /**
     * 套餐名称
     *
     * @return 套餐名称
     */
    @Override
    public String getComboName() {
        return "基础套餐";
    }

    /**
     * 硬盘
     *
     * @return 硬盘
     */
    @Override
    public String getHardDisk() {
        return "1T 固态硬盘";
    }

    /**
     * 内存
     *
     * @return 内存
     */
    @Override
    public String getMemory() {
        return "16GB 2666MHz DDR4 内存";
    }

    /**
     * 价格
     *
     * @return 价格
     */
    @Override
    public Double getPrice() {
        return 22199d;
    }
}
