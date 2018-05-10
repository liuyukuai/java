package com.xiaoer.function;

import com.xiaoer.BallPen;
import com.xiaoer.Pen;

/**
 * 圆珠笔工厂类
 */
public class BallPenFactory implements Factory {

    public Pen product() {
        return new BallPen();
    }
}
