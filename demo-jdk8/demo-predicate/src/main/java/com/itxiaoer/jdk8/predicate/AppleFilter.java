package com.itxiaoer.jdk8.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author : liuyk
 */
public class AppleFilter {

    public static <T> List<T> filter(List<T> lists, Predicate<T> predicate) {
        if (lists == null || lists.isEmpty()) {
            return lists;
        }
        List<T> results = new ArrayList<>();
        for (T list : lists) {
            if (predicate.test(list)) {
                results.add(list);

            }
        }
        return results;
    }
}
