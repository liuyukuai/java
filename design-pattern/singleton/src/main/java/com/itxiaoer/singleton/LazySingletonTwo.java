package com.itxiaoer.singleton;

public class LazySingletonTwo {

    private LazySingletonTwo() {
    }

    private static LazySingletonTwo instance = null;

    public static synchronized LazySingletonTwo getInstance() {
        if (instance == null) {
            synchronized (LazySingletonTwo.class) {
                if (instance == null) {
                    instance = new LazySingletonTwo();
                }
            }
        }
        return instance;
    }
}
