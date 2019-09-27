package com.xkcoding.design.pattern.structural.adapter;

/**
 * <p>
 * USB接口 转 Type-C接口 转接头
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019/9/16 17:11
 */
public class TypeCAdapter implements TypeC {
    private Usb usb;

    public TypeCAdapter(Usb usb) {
        this.usb = usb;
    }

    /**
     * 接口类型
     *
     * @return USB
     */
    @Override
    public String slot() {
        String originalType = usb.slot();
        String type = transformSlot(originalType);
        System.out.println("接口类型：" + type);
        return type;
    }

    private String transformSlot(String originalType) {
        String type = "Type-C";
        System.out.println("使用 " + originalType + " 转 " + type + " 转接头");
        return type;
    }
}
