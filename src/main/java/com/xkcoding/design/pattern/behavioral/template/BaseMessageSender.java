package com.xkcoding.design.pattern.behavioral.template;

/**
 * <p>
 * 消息发送器
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019/11/18 17:22
 */
public abstract class BaseMessageSender {
    /**
     * 发送消息
     *
     * @param content 内容
     */
    public void send(String content) {
        validate(content);
        if (!execute(content)) {
            error(content);
        }
    }

    /**
     * 校验消息
     *
     * @param content 数据
     */
    protected abstract void validate(String content);

    /**
     * 发送消息
     *
     * @param content 数据
     * @return {@code true} - 发送成功，{@code false} - 发送失败
     */
    protected abstract boolean execute(String content);

    /**
     * 错误记录
     *
     * @param content 数据
     */
    protected abstract void error(String content);
}
