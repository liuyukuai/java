package com.itxiaoer.singleton;

import java.io.Serializable;

/**
 * 安全
 */
public class SerializableSingletonSafe implements Serializable {

    private static final SerializableSingletonSafe instance = new SerializableSingletonSafe();

    private SerializableSingletonSafe() {
    }


    public static SerializableSingletonSafe getInstance() {
        return instance;
    }

    // 避免序列化假冒的对象
    public Object readResovle() {
        return instance;
    }


}
