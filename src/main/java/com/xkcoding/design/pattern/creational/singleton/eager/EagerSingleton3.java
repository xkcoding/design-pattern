package com.xkcoding.design.pattern.creational.singleton.eager;

import java.io.*;

/**
 * <p>
 * 饿汉式单例，测试反序列化被破坏的情况
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019-08-11 20:11
 */
public class EagerSingleton3 implements Serializable {
    private final static EagerSingleton3 INSTANCE = new EagerSingleton3();

    private EagerSingleton3() {
    }

    public static EagerSingleton3 getInstance() {
        return INSTANCE;
    }

    /**
     * 重写 {@code readResolve} 方法，可解决反序列化单例破坏的场景
     */
    private Object readResolve() {
        return INSTANCE;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 正常获取实例
        EagerSingleton3 instance1 = EagerSingleton3.getInstance();

        // 通过序列化获取
        EagerSingleton3 instance2 = null;

        // 将 instance1 写出到文件
        FileOutputStream fos = new FileOutputStream("EagerSingleton3.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(instance1);
        oos.flush();
        oos.close();

        // 读取文件到 instance2
        FileInputStream fis = new FileInputStream("EagerSingleton3.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        instance2 = (EagerSingleton3) ois.readObject();
        ois.close();

        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance1 == instance2);
    }
}
