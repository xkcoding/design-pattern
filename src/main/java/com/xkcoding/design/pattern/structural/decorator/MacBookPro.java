package com.xkcoding.design.pattern.structural.decorator;

/**
 * <p>
 * 苹果笔记本
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019/12/13 16:51
 */
public interface MacBookPro {
    /**
     * 套餐名称
     *
     * @return 套餐名称
     */
    String getComboName();

    /**
     * 硬盘
     *
     * @return 硬盘
     */
    String getHardDisk();

    /**
     * 内存
     *
     * @return 内存
     */
    String getMemory();

    /**
     * 价格
     *
     * @return 价格
     */
    Double getPrice();
}
