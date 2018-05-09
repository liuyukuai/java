package com.xiaoer.simple;

import com.xiaoer.BallPen;
import com.xiaoer.Pen;
import com.xiaoer.Pencil;

public class SimpleFactory {

    public Pen product(String name) {
        if ("铅笔".equals(name)) {
            return new Pencil();
        } else if("圆珠笔".equals(name)){
            return new BallPen();
        }
        return null;
    }
}
