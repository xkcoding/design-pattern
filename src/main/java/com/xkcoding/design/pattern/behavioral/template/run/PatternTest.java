package com.xkcoding.design.pattern.behavioral.template.run;

import com.xkcoding.design.pattern.behavioral.template.EmailSender;
import com.xkcoding.design.pattern.behavioral.template.SmsSender;

/**
 * <p>
 * 模板模式，测试类
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019/11/18 17:10
 */
public class PatternTest {
    public static void main(String[] args) {
        EmailSender emailSender = new EmailSender();
        emailSender.send("测试内容");

        SmsSender smsSender = new SmsSender();
        smsSender.send("17312341234");
    }
}
