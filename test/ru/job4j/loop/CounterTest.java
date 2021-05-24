package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {

    @Test
    public void when0to5then15() {
        int start = 0;
        int finish = 5;
        int expected = 15;
        int out = Counter.sum(start, finish);
        Assert.assertEquals(expected, out);
    }
}