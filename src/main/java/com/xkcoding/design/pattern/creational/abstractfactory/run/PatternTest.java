package com.xkcoding.design.pattern.creational.abstractfactory.run;

import com.xkcoding.design.pattern.creational.abstractfactory.AppleTechCompany;
import com.xkcoding.design.pattern.creational.abstractfactory.HuaweiTechCompany;
import com.xkcoding.design.pattern.creational.abstractfactory.MiTechCompany;
import com.xkcoding.design.pattern.creational.abstractfactory.TechFactory;

/**
 * <p>
 * 抽象工厂模式测试类
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019-08-09 18:05
 */
public class PatternTest {
    public static void main(String[] args) {
        TechFactory mi = new MiTechCompany();
        mi.sellPhone().describe();
        mi.sellLaptop().describe();
        mi.sellEarPhone().describe();

        TechFactory huawei = new HuaweiTechCompany();
        huawei.sellPhone().describe();
        huawei.sellLaptop().describe();
        huawei.sellEarPhone().describe();

        TechFactory apple = new AppleTechCompany();
        apple.sellPhone().describe();
        apple.sellLaptop().describe();
        apple.sellEarPhone().describe();
    }
}
