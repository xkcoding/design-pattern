package com.xkcoding.design.pattern.behavioral.observer.run;

import com.xkcoding.design.pattern.behavioral.observer.Message;
import com.xkcoding.design.pattern.behavioral.observer.Pusher;
import com.xkcoding.design.pattern.behavioral.observer.User;

/**
 * <p>
 * 观察者模式，测试类
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019/11/26 17:52
 */
public class PatternTest {
    public static void main(String[] args) {
        User xkcoding = new User("xkcoding");
        Pusher pusher = Pusher.getInstance();
        Message message = new Message("你好", "user-1", "xkcoding");
        pusher.addObserver(xkcoding);
        pusher.pushMessage(message);
    }
}
