package com.xkcoding.design.pattern.creational.singleton.register;

import com.xkcoding.design.pattern.utils.ConcurrentExecutor;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <p>
 * 注册式单例，容器实现，Spring 容器的实现
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019-08-11 19:38
 */
public class RegisterSingletonContainer {
    private static final Map<String, Object> BEAN_CACHE = new ConcurrentHashMap<>();

    private RegisterSingletonContainer() {
    }

    public static Object getInstance(String className) {
        synchronized (BEAN_CACHE) {
            // 判断缓存是否存在
            if (!BEAN_CACHE.containsKey(className)) {
                // 构建对象，放在缓存
                Class<?> aClass = null;
                try {
                    aClass = Class.forName(className);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                BEAN_CACHE.put(className, aClass);
                return aClass;
            } else {
                return BEAN_CACHE.get(className);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ConcurrentExecutor.execute(() -> {
            Object instance = RegisterSingletonContainer.getInstance("com.xkcoding.design.pattern.creational.singleton.register.RegisterSingletonContainer");
            System.out.println(System.currentTimeMillis() + " :: " + instance);
        }, 10, 5);
    }
}
