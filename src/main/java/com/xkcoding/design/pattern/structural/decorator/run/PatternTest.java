package com.xkcoding.design.pattern.structural.decorator.run;

import com.xkcoding.design.pattern.structural.decorator.BaseMacBookProCombo;
import com.xkcoding.design.pattern.structural.decorator.HardDiskCombo;
import com.xkcoding.design.pattern.structural.decorator.MacBookPro;
import com.xkcoding.design.pattern.structural.decorator.MemoryCombo;

/**
 * <p>
 * 装饰者模式 - 测试类
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019/12/13 17:19
 */
public class PatternTest {
    public static void main(String[] args) {
        // MacBookPro 基础套餐
        MacBookPro macBookPro = new BaseMacBookProCombo();
        printInfo(macBookPro);

        // 升级内存 16G -> 64G
        macBookPro = new MemoryCombo(macBookPro);
        macBookPro = new MemoryCombo(macBookPro);
        macBookPro = new MemoryCombo(macBookPro);
        printInfo(macBookPro);

        // 升级硬盘 1T -> 2T
        macBookPro = new HardDiskCombo(macBookPro);
        printInfo(macBookPro);
    }

    private static void printInfo(MacBookPro macBookPro) {
        System.out.println("当前套餐: " + macBookPro.getComboName());
        System.out.println("内存: " + macBookPro.getMemory());
        System.out.println("硬盘: " + macBookPro.getHardDisk());
        System.out.println("总价为: " + macBookPro.getPrice() + " 元");
        System.out.println("\n======================================\n");
    }
}
