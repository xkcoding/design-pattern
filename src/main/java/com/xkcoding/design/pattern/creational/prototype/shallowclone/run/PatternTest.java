package com.xkcoding.design.pattern.creational.prototype.shallowclone.run;

import com.xkcoding.design.pattern.creational.prototype.Shape;
import com.xkcoding.design.pattern.creational.prototype.shallowclone.HundredMoney;

/**
 * <p>
 * 原型模式，浅克隆测试
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019-08-14 16:35
 */
public class PatternTest {
    public static void main(String[] args) {
        HundredMoney money1 = new HundredMoney();
        money1.setShape(new Shape("纸币"));

        // 原型模式 浅克隆
        HundredMoney money2 = (HundredMoney) money1.print();

        System.out.println("money1 -> 引用对象地址：" + money1.getShape());
        System.out.println("money2 -> 引用对象地址：" + money2.getShape());
        System.out.println("引用对象地址比较：" + (money1.getShape() == money2.getShape()));
    }
}
