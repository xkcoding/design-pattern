package com.xkcoding.design.pattern.structural.adapter;

/**
 * <p>
 * 定义标准的电脑USB接口类
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019/9/16 17:07
 */
public class Usb {
    /**
     * 接口类型
     *
     * @return USB
     */
    public String slot() {
        String type = "USB";
        System.out.println("接口类型：" + type);
        return type;
    }
}
