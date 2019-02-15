package com.itxiaoer.jdk8.function;

import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * function demo
 *
 * @author : liuyk
 */
public class FunctionDemo {

    static <T, R> R excuete(T t, Function<T, R> function) {
        return function.apply(t);
    }


    public static void main(String[] args) {
//        Integer y = 6;
//        Integer x = 5;
//
//        Integer excue = excuete(x, val -> val * y);


        Stream.generate(() -> Math.random() > 0.8 ? "ok" : null)
                .limit(5)
                .filter(Objects::nonNull)
                .findFirst()
                .ifPresent(System.out::println);

    }

}
