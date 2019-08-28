package com.xkcoding.design.pattern.behavioral.delegate;

/**
 * <p>
 * 领导
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019/8/28 11:26
 */
public class Boss {
    /**
     * 下命令
     *
     * @param thing  需要处理的事情
     * @param leader 安排给一个组长
     */
    public void command(String thing, Leader leader) {
        System.out.println("我是领导，我现在需要处理: " + thing);
        leader.doing(thing);
    }
}
