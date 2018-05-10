package com.xiaoer.abs;

import com.xiaoer.BallPen;
import com.xiaoer.Pencil;

/**
 *
 */
public interface AbsFactory {

    BallPen productBall();

    Pencil productPencil();


}
