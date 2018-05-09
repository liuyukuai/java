package com.xiaoer;

import com.xiaoer.abs.BallPenFactory;
import com.xiaoer.abs.PencilFactory;

public class AbsFactoryTest {

    public static void main(String[] args) {
        System.out.println(new BallPenFactory().product().getName());
        System.out.println(new PencilFactory().product().getName());

        /**
         * 有新增只需要新增工厂即可
         */

    }
}
