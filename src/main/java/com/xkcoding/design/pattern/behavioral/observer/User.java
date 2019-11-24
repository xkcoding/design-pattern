package com.xkcoding.design.pattern.behavioral.observer;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Observable;
import java.util.Observer;

/**
 * <p>
 * 用户，观察者
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019/11/26 17:43
 */
@Data
@AllArgsConstructor
public class User implements Observer {
    private String name;

    /**
     * 被观察对象改变的时候，会触发这个方法
     *
     * @param o   the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     */
    @Override
    public void update(Observable o, Object arg) {
        Message message = (Message) arg;

        if (this.getName().equals(message.getTo())) {
            System.err.println(name + "，你收到一条来自 " + message.getFrom() + " 的私信！");
            System.err.println("私信内容: " + message.getMessage());
        }

    }
}
