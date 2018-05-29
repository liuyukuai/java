package com.itxiaoer.singleton;

public class LazySingletonOne {

    private LazySingletonOne() {
    }

    private static LazySingletonOne instance = null;

    public static synchronized LazySingletonOne getInstance() {
        if (instance == null) {
            instance = new LazySingletonOne();
        }
        return instance;
    }
}
