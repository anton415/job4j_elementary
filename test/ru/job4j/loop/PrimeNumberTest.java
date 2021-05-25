package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class PrimeNumberTest {
    @Test
    public void when5() {
        int finish = 5;
        int result = PrimeNumber.calc(finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when11() {
        int finish = 11;
        int result = PrimeNumber.calc(finish);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when2() {
        int finish = 2;
        int result = PrimeNumber.calc(finish);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }
}