package com.xiaoer.function;

import com.xiaoer.Pen;
import com.xiaoer.Pencil;

/**
 * 铅笔工厂类
 */
public class PencilFactory implements Factory {

    public Pen product() {
        return new Pencil();
    }
}
