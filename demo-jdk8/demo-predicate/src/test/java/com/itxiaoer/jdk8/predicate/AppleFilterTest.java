package com.itxiaoer.jdk8.predicate;
//

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author : liuyk
 */
public class AppleFilterTest {
    // color
    private List<String> colors = Arrays.asList("red", "blue", "yellow");
    // apples
    private List<Apple> apples = new ArrayList<>(10);

    @Before
    public void init() {
        for (int i = 0; i < 10; i++) {
            apples.add(new Apple(10 * new Random().nextInt(), colors.get(i % colors.size())));
        }
    }

    @Test
    public void findRed() {
        List<Apple> results = AppleFilter.filter(this.apples, (e) -> "red".equals(e.getColor()));
        List<Apple> collect = apples.stream().filter(e -> "red".equals(e.getColor())).collect(Collectors.toList());

    }


}
