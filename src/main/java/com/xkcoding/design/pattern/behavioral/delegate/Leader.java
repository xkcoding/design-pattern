package com.xkcoding.design.pattern.behavioral.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 组长
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019/8/28 11:21
 */
public class Leader implements Worker {
    private static Map<String, Worker> OFFICE = new HashMap<>();

    public Leader() {
        OFFICE.put("cooking", new ChefWorker());
        OFFICE.put("sewing", new TailorWorker());
    }

    /**
     * 做事情
     *
     * @param thing 任务
     */
    @Override
    public void doing(String thing) {
        System.out.println("我是组长，领导需要: " + thing + "，我来安排任务: " + thing);
        if (OFFICE.containsKey(thing)) {
            OFFICE.get(thing).doing(thing);
        } else {
            System.err.println("目前办公室没有对应职位的工人");
        }
    }
}
