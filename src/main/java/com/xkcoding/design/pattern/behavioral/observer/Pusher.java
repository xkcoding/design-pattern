package com.xkcoding.design.pattern.behavioral.observer;

import java.util.Observable;

/**
 * <p>
 * 消息推送，被观察者
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019/11/24 17:36
 */
public class Pusher extends Observable {
    private static Pusher PUSHER = null;

    private Pusher() {
    }

    public static Pusher getInstance() {
        if (null == PUSHER) {
            PUSHER = new Pusher();
        }
        return PUSHER;
    }

    /**
     * 推送消息
     *
     * @param message 消息
     */
    public void pushMessage(Message message) {
        System.out.println(message.getFrom() + " 向 " + message.getTo() + " 发送了一条私信~~");
        // 触发状态变化
        setChanged();
        // 提醒观察者
        notifyObservers(message);
    }
}
