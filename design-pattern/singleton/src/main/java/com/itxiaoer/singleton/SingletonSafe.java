package com.itxiaoer.singleton;

/**
 * 饿汉式（线程安全）
 */
public class SingletonSafe {
    private static final SingletonSafe instance = new SingletonSafe();

    private SingletonSafe() {
        if (instance != null) {
            throw new RuntimeException(" SingletonSafe is init. ");
        }

    }

    public static SingletonSafe getInstance() {
        return instance;
    }


}
