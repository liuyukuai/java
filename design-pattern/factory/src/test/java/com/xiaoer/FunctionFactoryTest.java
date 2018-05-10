package com.xiaoer;

import com.xiaoer.function.BallPenFactory;
import com.xiaoer.function.PencilFactory;

/**
 * 工厂方法模式缺点：
 * 1、在添加新产品的时候需要添加新的产品，并需要添加新的工厂类，系统中的类将成对增加，一定程度上增加了系统的复杂度，有更多的类需要编译，会带来一些系统的额外开销。
 *
 * 工厂方法模式适用环境：
 *1、只需要知道产品的对应的工厂类。
 * 2、一个类通过子类来指定创建那个对象。
 */
public class FunctionFactoryTest {

    public static void main(String[] args) {
        System.out.println(new BallPenFactory().product().getName());
        System.out.println(new PencilFactory().product().getName());
    }
}
