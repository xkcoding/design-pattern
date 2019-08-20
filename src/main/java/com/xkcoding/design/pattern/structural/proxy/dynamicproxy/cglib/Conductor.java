package com.xkcoding.design.pattern.structural.proxy.dynamicproxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * <p>
 * CGLIB动态代理类，售票员(不论什么票都卖)
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019-08-20 22:35
 */
public class Conductor implements MethodInterceptor {

    public Object getInstance(Class<?> clazz) {
        // Enhancer 相当于 JDK 动态代理的 Proxy 类
        Enhancer enhancer = new Enhancer();
        // 设置动态生成的对象的父类为传进来的 被代理类
        enhancer.setSuperclass(clazz);
        // MethodInterceptor 继承 Callback 接口
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        // 调用生成代理对象的父类方法
        Object result = methodProxy.invokeSuper(o, objects);
        after();
        return result;
    }

    private void before() {
        System.out.println("动态代理 - CGLIB动态代理 - 方法前增强");
    }

    private void after() {
        System.out.println("动态代理 - CGLIB动态代理 - 方法后增强");
    }

}
