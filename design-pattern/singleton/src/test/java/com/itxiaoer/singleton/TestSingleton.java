package com.itxiaoer.singleton;

import java.lang.reflect.Constructor;

public class TestSingleton {

    public static void main(String[] args) {

        // 私有构造器并不能保证完全单例
        try {
            Class<Singleton> clazz = Singleton.class;
            Constructor<Singleton> c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);
            Singleton singleton = c.newInstance();
            System.out.println(singleton);
            System.out.println(Singleton.getInstance());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
