package com.itxiaoer.singleton;

import java.io.Serializable;

/**
 * 不安全
 */
public class SerializableSingleton implements Serializable {

    private static final SerializableSingleton instance = new SerializableSingleton();

    private SerializableSingleton() {
    }

    public static SerializableSingleton getInstance() {
        return instance;
    }

}
