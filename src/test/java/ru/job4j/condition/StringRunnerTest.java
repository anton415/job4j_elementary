package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author antonserdyuchenko
 * @since 01.09.2025
 */
public class StringRunnerTest {
    @Test
    public void whenMainThenPrintsIdeaWithYear() {
        PrintStream original = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        StringRunner.main(null);
        System.setOut(original);
        String[] lines = out.toString().split(System.lineSeparator());
        int year = LocalDate.now().getYear();
        String expected = "I like Java! But I am a newbie. " + year;
        assertThat(lines[1]).isEqualTo(expected);
    }
}