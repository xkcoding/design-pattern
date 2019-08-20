package com.xkcoding.design.pattern.structural.proxy.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <p>
 * JDK动态代理类，售票员(不论什么票都卖)
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019-08-20 22:35
 */
public class Conductor implements InvocationHandler {
    /**
     * 被代理对象
     */
    private Object target;

    /**
     * 可以代理任意门票，所以为 {@link Object}
     *
     * @param target 被代理对象，但是必须有统一的接口
     * @return 被代理对象
     */
    public Object getInstance(Object target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    /**
     * 反射调用的方法
     *
     * @param proxy  代理对象
     * @param method 被代理对象需要执行的方法
     * @param args   被代理对象需要执行的方法 的参数
     * @return 被代理对象需要执行的方法 的返回值
     * @throws Throwable 抛出异常
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(target, args);
        after();
        return result;
    }

    private void before() {
        System.out.println("动态代理 - JDK动态代理 - 方法前增强");
    }

    private void after() {
        System.out.println("动态代理 - JDK动态代理 - 方法后增强");
    }
}
