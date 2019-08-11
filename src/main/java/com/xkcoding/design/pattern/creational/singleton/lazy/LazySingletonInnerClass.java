package com.xkcoding.design.pattern.creational.singleton.lazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * <p>
 * 懒汉式单例，内部类写法，{@code 推荐写法之一}
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019-08-11 19:24
 */
public class LazySingletonInnerClass {
    private LazySingletonInnerClass() {
        // 反射获取类的构造方法，通过newInstance() 获取对象会存在单例被破坏的问题
        // 添加以下代码解决，强制不允许构建
        if (SingletonHolder.INSTANCE != null) {
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    public static LazySingletonInnerClass getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private final static LazySingletonInnerClass INSTANCE = new LazySingletonInnerClass();
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 普通方式获取
        LazySingletonInnerClass instance1 = LazySingletonInnerClass.getInstance();

        // 反射方式获取
        Class<LazySingletonInnerClass> clazz = LazySingletonInnerClass.class;
        Constructor<LazySingletonInnerClass> constructor = clazz.getDeclaredConstructor(null);
        // 设置访问级别，因为是private的
        constructor.setAccessible(true);
        LazySingletonInnerClass instance2 = constructor.newInstance();

        System.out.println("instance1 = " + instance1);
        System.out.println("instance2 = " + instance2);
    }
}
