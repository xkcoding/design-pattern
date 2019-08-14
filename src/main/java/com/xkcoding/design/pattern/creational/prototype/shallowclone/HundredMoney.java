package com.xkcoding.design.pattern.creational.prototype.shallowclone;

import com.xkcoding.design.pattern.creational.prototype.Money;
import com.xkcoding.design.pattern.creational.prototype.Shape;
import lombok.Data;

/**
 * <p>
 * 一百元
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019-08-14 15:56
 */
@Data
public class HundredMoney implements Money {
    private Shape shape;

    /**
     * 打印
     *
     * @return {@link Money}
     */
    @Override
    public Money print() {
        HundredMoney hundredMoney = new HundredMoney();
        hundredMoney.setShape(this.shape);
        return hundredMoney;
    }
}
