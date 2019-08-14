package com.xkcoding.design.pattern.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * <p>
 * 形状
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019-08-14 15:59
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Shape implements Serializable {
    /**
     * 描述
     */
    private String desc;
}
