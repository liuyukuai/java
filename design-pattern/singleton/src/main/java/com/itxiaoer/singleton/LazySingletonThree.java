package com.itxiaoer.singleton;

public class LazySingletonThree {

    private LazySingletonThree() {
    }

    public static LazySingletonThree getInstance() {
        return LazyHolder.instance;
    }

    public static class LazyHolder {
        private final static LazySingletonThree instance = new LazySingletonThree();

    }
}
