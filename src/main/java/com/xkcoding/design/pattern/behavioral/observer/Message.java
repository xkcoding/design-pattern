package com.xkcoding.design.pattern.behavioral.observer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 消息
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019/11/26 17:36
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {
    private String message;
    private String from;
    private String to;
}
