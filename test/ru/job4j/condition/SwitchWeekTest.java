package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SwitchWeekTest {

    @Test
    public void when1thenMonday() {
        int day = 1;
        String expected = "Monday";

        String out = SwitchWeek.nameOfDay(day);

        Assert.assertEquals(expected, out);
    }

    @Test
    public void when2thenTuesday() {
        int day = 2;
        String expected = "Tuesday";

        String out = SwitchWeek.nameOfDay(day);

        Assert.assertEquals(expected, out);
    }

    @Test
    public void when3thenWednesday() {
        int day = 3;
        String expected = "Wednesday";

        String out = SwitchWeek.nameOfDay(day);

        Assert.assertEquals(expected, out);
    }

    @Test
    public void when4thenThursday() {
        int day = 4;
        String expected = "Thursday";

        String out = SwitchWeek.nameOfDay(day);

        Assert.assertEquals(expected, out);
    }

    @Test
    public void when5thenFriday() {
        int day = 5;
        String expected = "Friday";

        String out = SwitchWeek.nameOfDay(day);

        Assert.assertEquals(expected, out);
    }

    @Test
    public void when6thenSaturday() {
        int day = 6;
        String expected = "Saturday";

        String out = SwitchWeek.nameOfDay(day);

        Assert.assertEquals(expected, out);
    }

    @Test
    public void when7thenSunday() {
        int day = 7;
        String expected = "Sunday";

        String out = SwitchWeek.nameOfDay(day);

        Assert.assertEquals(expected, out);
    }

    @Test
    public void when0thenError() {
        int day = 0;
        String expected = "Error";

        String out = SwitchWeek.nameOfDay(day);

        Assert.assertEquals(expected, out);
    }

}