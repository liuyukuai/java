package com.xiaoer;

import com.xiaoer.simple.SimpleFactory;


/***
 *
 * 简单工厂缺点：
 * 1、由于工厂类集中了所有产品的创建逻辑，一旦不能正常工作，将影响整个系统
 * 2、系统扩展困难，一旦添加新产品就必须要修改工厂逻辑，在产品类型比较多的时候，工厂逻辑比较复杂，不利于系统的扩展和维护。
 * 3、简单工厂会一定程度上增加系统的类的数量，一定程度上增加系统的复杂度和理解难度。
 *
 * 简单工厂适用环境：
 * 1、工厂创建的类比较少，由于创建的产品比较少，不会造成工厂业务过于复杂。
 * 2、客服端只知道工厂类型的参数，对于如何创建对象并不关心，不需要关心创建细节，甚至类名都不需要记住，只需知道类型的参数。
 * @author  happy
 */

public class SimpleFactoryTest {

    public static void main(String[] args) {
        System.out.println(new SimpleFactory().product("铅笔").getName());
        System.out.println(new SimpleFactory().product("圆珠笔").getName());
    }
}
