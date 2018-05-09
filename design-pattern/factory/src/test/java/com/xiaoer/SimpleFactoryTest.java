package com.xiaoer;

import com.xiaoer.simple.SimpleFactory;

public class SimpleFactoryTest {

    public static void main(String[] args) {
        System.out.println(new SimpleFactory().product("铅笔").getName());
        System.out.println(new SimpleFactory().product("圆珠笔").getName());

        /**
         * 每次有新的笔都要修改Factory，扩展性很差
         */

    }
}
