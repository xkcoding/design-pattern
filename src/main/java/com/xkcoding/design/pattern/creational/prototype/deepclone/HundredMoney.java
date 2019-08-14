package com.xkcoding.design.pattern.creational.prototype.deepclone;

import com.xkcoding.design.pattern.creational.prototype.Money;
import com.xkcoding.design.pattern.creational.prototype.Shape;
import lombok.Cleanup;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;

import java.io.*;

/**
 * <p>
 * 一百元
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019-08-14 15:56
 */
@Getter
@Setter
public class HundredMoney implements Money, Cloneable, Serializable {
    private Shape shape;

    /**
     * 打印
     *
     * @return {@link Money}
     */
    @Override
    public Money print() {
        return (Money) this.clone();
    }

    @Override
    protected Object clone() {
        return this.deepClone();
    }

    @SneakyThrows
    private Object deepClone() {
        @Cleanup ByteArrayOutputStream bos = new ByteArrayOutputStream();
        @Cleanup ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        @Cleanup ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        @Cleanup ObjectInputStream ois = new ObjectInputStream(bis);

        return ois.readObject();
    }

}
