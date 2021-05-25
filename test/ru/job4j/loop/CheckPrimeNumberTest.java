package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CheckPrimeNumberTest {
    @Test
    public void when5() {
        int number = 5;
        boolean result = CheckPrimeNumber.check(number);
        Assert.assertTrue(result);
    }

    @Test
    public void when4() {
        int number = 4;
        boolean result = CheckPrimeNumber.check(number);
        Assert.assertFalse(result);
    }

    @Test
    public void when1() {
        int number = 1;
        boolean result = CheckPrimeNumber.check(number);
        Assert.assertFalse(result);
    }

    @Test
    public void when0() {
        int number = 0;
        boolean result = CheckPrimeNumber.check(number);
        Assert.assertFalse(result);
    }

    @Test
    public void when6() {
        int number = 6;
        boolean result = CheckPrimeNumber.check(number);
        Assert.assertFalse(result);
    }

    @Test
    public void when7() {
        int number = 7;
        boolean result = CheckPrimeNumber.check(number);
        Assert.assertTrue(result);
    }
}