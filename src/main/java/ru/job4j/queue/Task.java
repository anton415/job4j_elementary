package ru.job4j.queue;

/**
 * @author antonserdyuchenko
 * @since 04.10.2025
 */
public record Task(Position position,
                   String description,
                   int urgency) {
}