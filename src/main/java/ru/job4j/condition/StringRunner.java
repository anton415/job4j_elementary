package ru.job4j.condition;

/**
 * Example that demonstrates compound assignment (+=) with String.
 * @author antonserdyuchenko
 * @since 20.08.2025
 */
public class StringRunner {
    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
        idea += " But I am a newbie. ";
        int year = 2025;
        idea += year;
        System.out.println(idea);
    }
}
